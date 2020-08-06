package com.myorganization.sprocket.models.mappers;

import com.myorganization.sprocket.models.dtos.OrderDetailDTO;
import com.myorganization.sprocket.models.entities.OrderDetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {ProductMapper.class, PurchaseOrderMapper.class})
public interface OrderDetailMapper {

    OrderDetailMapper MAPPER = Mappers.getMapper(OrderDetailMapper.class);

    @Mapping(source = "product", target = "productDTO")
    OrderDetailDTO orderDetailsToDTO(OrderDetail orderDetail);

    @Mapping(source = "productDTO", target = "product")
    OrderDetail dtoToOrderDetail(OrderDetailDTO orderDetailDTO);
}
