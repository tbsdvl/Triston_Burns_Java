package com.company;

import com.company.pointofsale.IceCream;

import java.util.ArrayList;
import java.util.Arrays;

public class IceCreamApp {

    public static void main(String[] args) {
        com.company.pointofsale.IceCream posIceCream = new com.company.pointofsale.IceCream("Chocolate", 2.43, 10);
        com.company.factory.IceCream factoryIceCream = new com.company.factory.IceCream("Vanilla", 5.30, 1.57, 3, new ArrayList<String>(Arrays.asList("Milk", "Eggs", "Vanilla Extract", "Rock Salt")));
    }

}
