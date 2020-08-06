package com.myorganization.sprocket.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.myorganization.sprocket.models.entities.Customer;
import com.myorganization.sprocket.models.entities.OrderDetail;
import com.myorganization.sprocket.models.entities.OrderDetailStatus;
import com.myorganization.sprocket.models.entities.OrderStatus;
import com.myorganization.sprocket.models.entities.Orders;
import com.myorganization.sprocket.models.entities.PaymentType;
import com.myorganization.sprocket.models.entities.Product;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Slf4j
@SpringBootTest
class OrdersServiceTest {

    @BeforeEach
    void setUp() {
        log.info("Started testing class");
    }

    @Test
    void find() {
    }

    @DisplayName("Find Order By Primary Key Id")
    @Test
    void findById() throws IOException {
        Orders orders = Orders.builder().customer(buildCustomer())
                .notes("My notes..").orderDate(LocalDate.now()).paidDate(LocalDate.now())
                .orderDetails(buildOrderDetails())
                .paymentType(buildPaymentType())
                .shippedDate(LocalDate.now())
                .shippingFeeAmount(BigDecimal.ONE)
                .status(OrderStatus.New).build();

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.writeValue(new File("/temp/orders.json"), orders);

    }

    @DisplayName("Get JSON File and Map to Orders Object")
    @Test
    void getJsonFileAndMapToObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        Orders order = mapper.readValue(new File("/temp/orders.json"), Orders.class);
        System.out.println(order.toString());
    }

    private PaymentType buildPaymentType() {
        return PaymentType.builder().description("Paying by check")
                .name("Check").paymentTypeId(1L).build();
    }

    private List<OrderDetail> buildOrderDetails() {
        List<OrderDetail> details = Lists.newArrayList();

        details.add(OrderDetail.builder().allocationDate(LocalDate.now())
                .discount(1).product(buildProduct())
                .quantity(1).status(OrderDetailStatus.On_Order)
                .unitPrice(BigDecimal.ONE).build());

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

    @Test
    void save() {
    }
}