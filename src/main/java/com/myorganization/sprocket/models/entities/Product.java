package com.myorganization.sprocket.models.entities;

import com.myorganization.sprocket.Utils.BaseConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Product {

    @Column(name = "category_name", length = 30)
    private String category;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "discontinued")
    private Boolean discontinued;

    @Column(name = "PROD_ID_NUMBER", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ")
    @GenericGenerator(
            name = "PRODUCT_SEQ",
            strategy = BaseConstants.ORG_HIBERNATE_ID_ENHANCED_SEQUENCE_STYLE_GENERATOR,
            parameters = {
                    @Parameter(name = BaseConstants.INCREMENT_SIZE, value = "1")
            }
    )
    @Id
    private Long id;

    @Column(name = "list_price", nullable = false, precision = 22, scale = 2)
    private BigDecimal listPrice;

    @Column(name = "minimum_reorder_level")
    private Integer minimumReorderLevel;

    @Column(name = "product_code", length = 30)
    private String productCode;

    @Column(name = "product_name", length = 100)
    private String productName;

    @Column(name = "per_unit_measure", length = 30)
    private String quantityPerUnit;

    @Column(name = "reorder_level")
    private Integer reorderLevel;

    @Column(name = "standard_price", nullable = false, precision = 22, scale = 2)
    private BigDecimal standardPrice;

    @Column(name = "target_level")
    private Integer targetLevel;
}
