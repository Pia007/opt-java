package models;

public class Shirt extends Product {

    // fields
    private String size;


    //constructor
    public Shirt (String size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;

    }
}
