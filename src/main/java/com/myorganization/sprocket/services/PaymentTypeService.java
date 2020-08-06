package com.myorganization.sprocket.services;

import com.myorganization.sprocket.models.entities.PaymentType;
import com.myorganization.sprocket.repositories.PaymentTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentTypeService {

    private final PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeService(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    public List<PaymentType> findAllPaymentTypes(){
        return paymentTypeRepository.findAll();
    }

    public PaymentType findById(Long paymentTypeId) {
        return paymentTypeRepository.findById(paymentTypeId).orElse(null);
    }

    public PaymentType save(PaymentType paymentType){
        return paymentTypeRepository.save(paymentType);
    }
}
