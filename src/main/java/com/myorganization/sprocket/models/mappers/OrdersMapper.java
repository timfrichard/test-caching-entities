package com.myorganization.sprocket.models.mappers;

import com.myorganization.sprocket.models.dtos.OrdersDTO;
import com.myorganization.sprocket.models.entities.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {OrderDetailMapper.class})
public interface OrdersMapper {

    OrdersMapper MAPPER = Mappers.getMapper(OrdersMapper.class);

    @Mapping(source = "orderDetails", target = "orderDetailDTOS")
    OrdersDTO ordersToDTO(Orders orders);

    @Mapping(source = "orderDetailDTOS", target = "orderDetails")
    Orders dtoToOrders(OrdersDTO OrdersDTO);

}
