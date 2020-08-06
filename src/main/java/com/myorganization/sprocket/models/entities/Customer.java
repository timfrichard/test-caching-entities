package com.myorganization.sprocket.models.entities;

import com.myorganization.sprocket.Utils.BaseConstants;
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
@Table(name = "customer")
@AllArgsConstructor
@Builder
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Cacheable
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Customer {

    @Column(name = "address", length = 50)
    private String address;

    @Column(name = "business_phone", length = 15)
    private String businessPhone;

    @Column(name = "city", length = 30)
    private String city;

    @Column(name = "company", length = 30)
    private String company;

    @Column(name = "email_address", length = 50)
    private String emailAddress;

    @Column(name = "first_name", length = 30)
    private String firstName;

    @Column(name = "home_phone", length = 15)
    private String homePhone;

    @Column(name = "CUST_ID_NUMBER", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ")
    @GenericGenerator(
            name = "CUSTOMER_SEQ",
            strategy = BaseConstants.ORG_HIBERNATE_ID_ENHANCED_SEQUENCE_STYLE_GENERATOR,
            parameters = {
                    @Parameter(name = BaseConstants.INCREMENT_SIZE, value = "1")
            }
    )
    @Id
    private Long id;

    @Column(name = "job_title", length = 30)
    private String jobTitle;

    @Column(name = "last_name", length = 30)
    private String lastName;

    @Column(name = "state", length = 2)
    private String state;

    @Column(name = "zip_code", length = 5)
    private Integer zipCode;

}
