package com.myorganization.sprocket.models.dtos;

import com.myorganization.sprocket.models.entities.OrderDetailStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class OrderDetailDTO {

    private LocalDate allocationDate;

    private Integer discount;

    private Long id;

    private OrdersDTO orders;

    private ProductDTO productDTO;

    private PurchaseOrderDTO purchaseOrder;

    private Integer quantity;

    private OrderDetailStatus status;

    private BigDecimal unitPrice;
}
