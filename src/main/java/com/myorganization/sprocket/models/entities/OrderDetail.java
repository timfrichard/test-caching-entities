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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "order_detail")
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class OrderDetail {

    @Column(name = "allocation_date", columnDefinition = "DATE")
    private LocalDate allocationDate;

    @Column(name = "discount")
    private Integer discount;

    @Column(name = "ORD_DETAIL_ID_NUMBER", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_DETAIL_SEQ")
    @GenericGenerator(
            name = "ORDER_DETAIL_SEQ",
            strategy = BaseConstants.ORG_HIBERNATE_ID_ENHANCED_SEQUENCE_STYLE_GENERATOR,
            parameters = {
                    @Parameter(name = BaseConstants.INCREMENT_SIZE, value = "1")
            }
    )
    @Id
    private Long id;

    @JoinColumn(name = "fk_order_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Orders orders;

    @JoinColumn(name = "fk_product_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;

    @JoinColumn(name = "fk_purchase_order_id")
    @ManyToOne(fetch = FetchType.EAGER)
    private PurchaseOrder purchaseOrder;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderDetailStatus status;

    @Column(name = "unit_price", nullable = false, precision = 22, scale = 2)
    private BigDecimal unitPrice;
}
