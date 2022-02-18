package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public double computePriceByQuantity () {
        return this.price * this.quantity;
    }

    public double computeAverageSellingPrice() { return this.price / this.quantity; }

    public String printMenuItem() {
        String message = "| Flavor: %s Price: %.2f Quantity in Stock: %d |";
        message = String.format(message, this.flavor, this.price, this.quantity);
        System.out.printf(message);
        return message;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
