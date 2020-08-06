package com.myorganization.sprocket.models.mappers;

import com.myorganization.sprocket.models.dtos.PurchaseOrderDTO;
import com.myorganization.sprocket.models.entities.PurchaseOrder;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PurchaseOrderMapper {

    PurchaseOrderMapper MAPPER = Mappers.getMapper(PurchaseOrderMapper.class);

    PurchaseOrderDTO purchaseOrderToDTO(PurchaseOrder purchaseOrder);
    PurchaseOrder dtoToPurchaseOrder(PurchaseOrderDTO purchaseOrderDTO);
}
