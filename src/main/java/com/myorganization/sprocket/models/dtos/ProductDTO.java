package com.myorganization.sprocket.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class ProductDTO {

    private String category;

    private String description;

    private Boolean discontinued;

    private Long id;

    private BigDecimal listPrice;

    private Integer minimumReorderLevel;

    private String productCode;

    private String productName;

    private String quantityPerUnit;

    private Integer reorderLevel;

    private BigDecimal standardPrice;

    private Integer targetLevel;
}
