package com.myorganization.sprocket.controllers;

import com.myorganization.sprocket.models.dtos.OrdersDTO;
import com.myorganization.sprocket.models.entities.Orders;
import com.myorganization.sprocket.models.mappers.OrdersMapper;
import com.myorganization.sprocket.services.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("orders-api")
public class OrdersController {

    private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("find-orders-by-id")
    public OrdersDTO findOrdersById(@RequestParam(value = "ordersId") final Long ordersId){
        return OrdersMapper.MAPPER.ordersToDTO(ordersService.findById(ordersId));
    }

    @PostMapping("save-order")
    public OrdersDTO saveOrder(@RequestBody final Orders orders){

        orders.getOrderDetails().forEach(orderDetail -> {orderDetail.setOrders(orders);});
        log.info("About to save an order.");

        return OrdersMapper.MAPPER.ordersToDTO(ordersService.save(orders));
    }
}
