package com.myorganization.sprocket.models.dtos;

import com.myorganization.sprocket.models.entities.PaymentType;
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
public class PurchaseOrderDTO {

    private LocalDate approvedDate;

    private LocalDate createdDate;

    private LocalDate expectedDate;

    private Long id;

    private String notes;

    private BigDecimal paymentAmount;

    private LocalDate paymentDate;

    private PaymentType paymentMethod;
}
