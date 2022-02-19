package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer(
                "John",
                "Doe",
                "johndoe@email.com",
                "(123)-456-7890"
        );
    }

    @Test
    public void shouldSetIsMemberValueToTrue() {
        customer.setMember(true);
        assertEquals(true, customer.isMember());
    }

    @Test
    public void shouldSetIsMemberValueToFalse() {
        customer.setMember(false);
        assertEquals(false, customer.isMember());
    }

    @Test
    public void shouldReturnListOfStringsFromCustomerFirstAndLastName() {
        List<String> firstAndLastNames = customer.getFirstAndLastName();
        assertEquals(firstAndLastNames, customer.getFirstAndLastName());
    }

    @Test
    public void shouldSetCustomersShippingAddress() {
        Address customerShippingAddress = new ShippingAddress(
                "12345 N SomeStreet Rd",
                "",
                "New York City",
                "New York",
                10001
        );
        customer.setShippingAddress(customerShippingAddress);
        assertEquals(customerShippingAddress, customer.getShippingAddress());
    }

    @Test
    public void shouldSetCustomersBillingAddress() {
        Address customerBillingAddress = new BillingAddress(
                "12345 N SomeStreet Rd",
                "",
                "New York City",
                "New York",
                10001
        );
        customer.setBillingAddress(customerBillingAddress);
        assertEquals(customerBillingAddress, customer.getBillingAddress());
    }
}