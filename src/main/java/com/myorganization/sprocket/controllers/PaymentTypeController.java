package com.myorganization.sprocket.controllers;

import com.myorganization.sprocket.models.dtos.OrdersDTO;
import com.myorganization.sprocket.models.entities.Orders;
import com.myorganization.sprocket.models.entities.PaymentType;
import com.myorganization.sprocket.models.mappers.OrdersMapper;
import com.myorganization.sprocket.services.PaymentTypeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("payment-type-api")
public class PaymentTypeController {

    private final PaymentTypeService paymentTypeService;

    public PaymentTypeController(PaymentTypeService paymentTypeService) {
        this.paymentTypeService = paymentTypeService;
    }

    @GetMapping("find-payment-type-by-id")
    public PaymentType findPaymentTypeById(@RequestParam(value = "paymentTypeId") final Long paymentTypeId){
        return paymentTypeService.findById(paymentTypeId);
    }

    @PostMapping("save-payment-type")
    public PaymentType savePaymentType(@RequestBody final PaymentType paymentType){

        log.info("Saving a payment type: " + paymentType.getName());

        return paymentTypeService.save(paymentType);
    }
}
