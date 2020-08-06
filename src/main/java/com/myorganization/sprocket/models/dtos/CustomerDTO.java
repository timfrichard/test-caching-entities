package com.myorganization.sprocket.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Data
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class CustomerDTO {

    private String address;

    private String businessPhone;

    private String city;

    private String company;

    private String emailAddress;

    private String firstName;

    private String homePhone;

    private Long id;

    private String jobTitle;

    private String lastName;

    private String state;

    private Integer zipCode;

}
