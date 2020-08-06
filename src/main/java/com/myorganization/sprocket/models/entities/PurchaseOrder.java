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
@Table(name = "purchase_order")
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class PurchaseOrder {

    @Column(name = "approved_date", columnDefinition = "DATE")
    private LocalDate approvedDate;

    @Column(name = "created_date", columnDefinition = "DATE")
    private LocalDate createdDate;

    @Column(name = "executed_date", columnDefinition = "DATE")
    private LocalDate expectedDate;

    @Column(name = "PO_ID_NUMBER", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PURCHASE_ORDER_SEQ")
    @GenericGenerator(
            name = "PURCHASE_ORDER_SEQ",
            strategy = BaseConstants.ORG_HIBERNATE_ID_ENHANCED_SEQUENCE_STYLE_GENERATOR,
            parameters = {
                    @Parameter(name = BaseConstants.INCREMENT_SIZE, value = "1")
            }
    )
    @Id
    private Long id;


    @Column(name = "notes", length = 255)
    private String notes;

    @Column(name = "payment_amount", nullable = false, precision = 22, scale = 2)
    private BigDecimal paymentAmount;

    @Column(name = "payment_date", columnDefinition = "DATE")
    private LocalDate paymentDate;

    @JoinColumn(name = "fk_payment_type", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private PaymentType paymentMethod;
}
