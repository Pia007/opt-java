package models;

public class Pants {

    // fields
    private int waist;
    private double price;
    private String color;
    private String brand;

    //constructor
    public Pants (int waist, double price, String color, String brand) {
        this.waist = waist;
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public int getWaist() {
        return waist;
    }

    public double getPrice() {
        return price;
    }
}
