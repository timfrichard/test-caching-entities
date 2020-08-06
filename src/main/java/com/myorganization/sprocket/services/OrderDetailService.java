package com.myorganization.sprocket.services;

import com.myorganization.sprocket.models.entities.OrderDetail;
import com.myorganization.sprocket.repositories.OrderDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {

    private final OrderDetailRepository repository;

    public OrderDetailService(final OrderDetailRepository repository) {
        this.repository = repository;
    }

    public OrderDetail findById(final Long orderDetailId){
        return repository.findById(orderDetailId).orElse(null);
    }

    public OrderDetail save(final OrderDetail orderDetail){
        return repository.saveAndFlush(orderDetail);
    }
}
