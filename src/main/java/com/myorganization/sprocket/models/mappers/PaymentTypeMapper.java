package com.myorganization.sprocket.models.mappers;

import com.myorganization.sprocket.models.dtos.PaymentTypeDTO;
import com.myorganization.sprocket.models.entities.PaymentType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PaymentTypeMapper {

    PaymentTypeMapper MAPPER = Mappers.getMapper(PaymentTypeMapper.class);

    PaymentTypeDTO paymentTypeToDTO(PaymentType paymentType);
    PaymentType dtoToPaymentType(PaymentTypeDTO paymentTypeDTO);
}
