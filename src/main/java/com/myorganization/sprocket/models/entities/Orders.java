package com.myorganization.sprocket.models.entities;

import com.myorganization.sprocket.Utils.BaseConstants;
import com.myorganization.sprocket.constraints.EntityElementGeneralInput;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode(exclude = {"orderDetails"})
@NoArgsConstructor
@ToString(exclude = {"orderDetails"})
public class Orders {

    @JoinColumn(name = "fk_customer_id", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Customer customer;

    @Column(name = "ORD_ID_NUMBER", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDERS_SEQ")
    @GenericGenerator(
            name = "ORDERS_SEQ",
            strategy = BaseConstants.ORG_HIBERNATE_ID_ENHANCED_SEQUENCE_STYLE_GENERATOR,
            parameters = {
                    @Parameter(name = BaseConstants.INCREMENT_SIZE, value = "1")
            }
    )
    @Id
    private Long id;

    @Column(name = "notes", length = 255)
    @EntityElementGeneralInput(allowNull = true, label = "Notes", maxLength = 255, type = "SafeString")
    private String notes;

    @Column(name = "order_date", columnDefinition = "DATE")
    @FutureOrPresent
    private LocalDate orderDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "orders") //, cascade = { CascadeType.ALL }
    private List<OrderDetail> orderDetails;

    @Column(name = "paid_date", columnDefinition = "DATE")
    private LocalDate paidDate;

    @JoinColumn(name = "fk_payment_type", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    @NotNull
    private PaymentType paymentType;

    @Column(name = "shipped_date", columnDefinition = "DATE")
    private LocalDate shippedDate;

    @Column(name = "ship_fee_amount", nullable = false, precision = 22, scale = 2)
    private BigDecimal shippingFeeAmount;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
