package com.myorganization.sprocket.services;

import com.myorganization.sprocket.models.entities.Orders;
import com.myorganization.sprocket.repositories.OrdersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OrdersService {

    private final CustomerService customerService;
    private final OrderDetailService orderDetailService;
    private final PaymentTypeService paymentTypeService;
    private final OrdersRepository repository;

    public OrdersService(final OrdersRepository repository, final CustomerService customerService,
                         final OrderDetailService orderDetailService,
                         final PaymentTypeService paymentTypeService) {
        this.repository = repository;
        this.customerService = customerService;
        this.orderDetailService = orderDetailService;
        this.paymentTypeService = paymentTypeService;
    }

    public void delete(final Orders orders) {
        repository.delete(orders);
    }

    public List<Orders> find() {
        return repository.findAll();
    }

    public Orders findById(final Long orderId) {

        return repository.findById(orderId).orElse(null);
    }

    public Orders save(final Orders order) {

        order.setCustomer(customerService.findById(order.getCustomer().getId()));
        order.setPaymentType(paymentTypeService.findById(order.getPaymentType().getPaymentTypeId()));
        Orders persistedOrder = repository.saveAndFlush(order);
        order.getOrderDetails().forEach(orderDetail -> {orderDetailService.save(orderDetail);});
        log.info("Customer: " + order.getCustomer());
        log.info("PaymentType: " + order.getPaymentType());

        Orders orders = findById(persistedOrder.getId());
        orders.getOrderDetails().forEach(orderDetail -> {orderDetail.getProduct();});
        return orders;
    }

}
