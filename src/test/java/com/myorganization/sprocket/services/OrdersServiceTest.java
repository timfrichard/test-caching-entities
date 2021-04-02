package com.myorganization.sprocket.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.myorganization.sprocket.models.entities.*;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;

import javax.transaction.Transactional;
import javax.validation.ConstraintViolationException;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class OrdersServiceTest {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private ProductService productService;

    @BeforeEach
    void setUp() {
        log.info("Started testing class");
    }

    @DisplayName("Find Order By Primary Key Id")
    @Test
    public void findById() throws IOException {
        Orders orders = Orders.builder().customer(buildCustomer())
                .notes("My notes..").orderDate(LocalDate.now()).paidDate(LocalDate.now())
                .orderDetails(buildOrderDetails(true))
                .paymentType(buildPaymentType())
                .shippedDate(LocalDate.now())
                .shippingFeeAmount(BigDecimal.ONE)
                .status(OrderStatus.New).build();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.writeValue(new File("orders2.json"), orders);

    }

    @DisplayName("Get JSON File and Map to Orders Object")
    @Test
    public void getJsonFileAndMapToObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File resource = new ClassPathResource(
                "orders.json").getFile();
        Orders order = mapper.readValue(resource, Orders.class);
        System.out.println(order.toString());
    }

    @DisplayName("Save Order With Valid Notes")
    @Test
    @Transactional
    public void save() {
        Orders orders = Orders.builder().customer(customerService.findById(1L))
                .notes("My notes..").orderDate(LocalDate.now()).paidDate(LocalDate.now())
                .orderDetails(buildOrderDetails(false))
                .paymentType(buildPaymentType())
                .shippedDate(LocalDate.now())
                .shippingFeeAmount(BigDecimal.ONE)
                .status(OrderStatus.New).build();

        Orders persistedOrder = ordersService.save(orders);
        assertAll("Asserting all of the values needed",
                () -> Assertions.assertNotNull(persistedOrder.getId()),
                () -> Assertions.assertEquals("My notes..", orders.getNotes())
        );
    }

    @DisplayName("Save Order With Invalid Notes")
    @Test
    @Transactional
    public void save_invalid_notes() {
        Orders orders = Orders.builder().customer(customerService.findById(1L))
                .notes("@My notes..").orderDate(LocalDate.now()).paidDate(LocalDate.now())
                .orderDetails(buildOrderDetails(false))
                .paymentType(buildPaymentType())
                .shippedDate(LocalDate.now())
                .shippingFeeAmount(BigDecimal.ONE)
                .status(OrderStatus.New).build();

        ConstraintViolationException exception = assertThrows(ConstraintViolationException.class, () -> {
            Orders persistedOrder = ordersService.save(orders);
        });

        assertAll("Asserting all of the values needed",
                () -> assertTrue(exception.getConstraintViolations().size() == 1),
                () -> assertTrue(exception.getMessage().contains("Notes has failed validation using the following text: @My notes.."))
        );
    }

    @DisplayName("Save Order With Invalid Notes and Order Date")
    @Test
    @Transactional
    public void save_invalid_notes_and_orderdate() {
        Orders orders = Orders.builder().customer(customerService.findById(1L))
                .notes("@My notes..").orderDate(LocalDate.of(2020, 03, 22)).paidDate(LocalDate.now())
                .orderDetails(buildOrderDetails(false))
                .paymentType(buildPaymentType())
                .shippedDate(LocalDate.now())
                .shippingFeeAmount(BigDecimal.ONE)
                .status(OrderStatus.New).build();

        ConstraintViolationException exception = assertThrows(ConstraintViolationException.class, () -> {
            Orders persistedOrder = ordersService.save(orders);
        });

        assertAll("Asserting all of the values needed",
                () -> assertTrue(exception.getConstraintViolations().size() == 2),
                () -> assertTrue(exception.getMessage().contains("Notes has failed validation using the following text: @My notes..")),
                () -> assertTrue(exception.getMessage().contains("must be a date in the present or in the future"))
        );
    }

    private PaymentType buildPaymentType() {
        return PaymentType.builder().description("Paying by check")
                .name("Check").paymentTypeId(1L).build();
    }

    private List<OrderDetail> buildOrderDetails(boolean buildProduct) {
        List<OrderDetail> details = Lists.newArrayList();

        OrderDetail orderDetail = OrderDetail.builder().allocationDate(LocalDate.now())
                .discount(1).product(buildProduct())
                .quantity(1).status(OrderDetailStatus.On_Order)
                .unitPrice(BigDecimal.ONE).build();
        if (buildProduct) {
            orderDetail.setProduct(buildProduct());
        } else {
            orderDetail.setProduct(productService.findById(1L));
        }
        details.add(orderDetail);

        return details;
    }

    private Product buildProduct() {
        return Product.builder().category("Canned Fruit & Vegetables").description("")
                .discontinued(false).listPrice(BigDecimal.valueOf(1.2))
                .productCode("NWTCFV-93").productName("Northwind Traders Corn")
                .quantityPerUnit("14.5 OZ").reorderLevel(10).standardPrice(BigDecimal.ONE).targetLevel(40).build();
    }

    private Customer buildCustomer() {
        return Customer.builder().address("4213 Mocking Bird Ln.").businessPhone("314 231-2345")
                .city("St Louis").company("My Customer Co").emailAddress("emailme@mail.com")
                .firstName("Herman").homePhone("314 567-8901").jobTitle("Painter")
                .lastName("Munster").state("MO").zipCode(63100).build();
    }

}