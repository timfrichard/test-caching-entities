package com.myorganization.sprocket.models.mappers;

import com.myorganization.sprocket.models.dtos.CustomerDTO;
import com.myorganization.sprocket.models.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper()
public interface CustomerMapper {

    CustomerMapper MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToDTO(Customer customer);
    Customer dtoToCustomer(CustomerDTO customerDTO);
}
