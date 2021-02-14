package org.kodluyoruz.mybank.helper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAddressRequest {

    private String city;

    private String street;

    private String houseNumber;

    private String zipCode;
}
