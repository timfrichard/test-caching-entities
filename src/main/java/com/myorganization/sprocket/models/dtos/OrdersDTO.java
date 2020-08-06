package com.myorganization.sprocket.models.dtos;

import com.myorganization.sprocket.models.entities.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class OrdersDTO {

    private CustomerDTO customer;

    private Long id;

    private String notes;

    private LocalDate orderDate;

    private List<OrderDetailDTO> orderDetailDTOS;

    private LocalDate paidDate;

    private PaymentTypeDTO paymentType;

    private LocalDate shippedDate;

    private BigDecimal shippingFeeAmount;

    private OrderStatus status;
}
