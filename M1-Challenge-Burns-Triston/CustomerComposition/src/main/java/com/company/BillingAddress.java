package com.company;

public class BillingAddress extends Address {

    public BillingAddress(String street1, String street2, String city, String state, int zip) {
        this.setStreet1(street1);
        this.setStreet2(street2);
        this.setCity(city);
        this.setState(state);
        this.setZip(zip);
    }
}
