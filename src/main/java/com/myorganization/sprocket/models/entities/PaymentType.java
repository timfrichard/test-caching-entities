package com.myorganization.sprocket.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment_type")
@AllArgsConstructor
@Builder
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Cacheable
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class PaymentType {

    @Column(name = "payment_type_description", length = 50)
    private String description;

    @Column(name = "payment_type_name", length = 15, nullable = false)
    private String name;

    @Column(name = "payment_type_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAYMENT_TYPE_SEQ")
    @GenericGenerator(
            name = "PAYMENT_TYPE_SEQ",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator"
            ,
            parameters = {
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    @Id
    private Long paymentTypeId;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "paymentType")
//    private Set<PurchaseOrderPayment> purchaseOrderPayments = new HashSet<>(
//            0);

}
