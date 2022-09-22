package models;

public class Product {
    // define fields that are common to shirt and pants classes
    private double price;
    private String color;
    private String brand;

    // constructor
    public Product (double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }
}
