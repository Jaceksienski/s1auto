package com.eservice.s1auto.service.address;

import com.global.api.entities.Address;
import org.springframework.stereotype.Component;

@Component
public class MerchantAddress {

    public Address defaultAddress(){
        Address billingAddress = new Address();
        billingAddress.setStreetAddress1("Apartment 852");
        billingAddress.setStreetAddress2("Complex 741");
        billingAddress.setStreetAddress3("Unit 4");
        billingAddress.setCity("Chicago");
        billingAddress.setPostalCode("50001");
        billingAddress.setState("IL");
        billingAddress.setCountryCode("840");

        return billingAddress;
    }

    public Address defaultAddressSecond(){
        Address shippingAddress = new Address();
        shippingAddress.setStreetAddress1("Flat 456");
        shippingAddress.setStreetAddress2("House 789");
        shippingAddress.setStreetAddress3("Basement Flat");
        shippingAddress.setCity("Halifax");
        shippingAddress.setPostalCode("W5 9HR");
        shippingAddress.setCountryCode("826");
        return shippingAddress;
    }

    public Address defaultAddressWithWrongData(){
        Address billingAddress = new Address();
        billingAddress.setStreetAddress1("%%%%%%%%");
        billingAddress.setStreetAddress2("-----------");
        billingAddress.setStreetAddress3("");
        billingAddress.setCity("");
        billingAddress.setPostalCode("34");
        billingAddress.setState("1");
        billingAddress.setCountryCode("1");

        return billingAddress;
    }

}
