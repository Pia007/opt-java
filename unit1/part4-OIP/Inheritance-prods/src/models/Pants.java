package models;

public class Pants extends Product {

    // fields
    private int waist;

    //constructor
    public Pants (int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }

    public Pants (Pants source) {
        super(source);
        this.waist = source.waist;
    }

    //getters
    public int getWaist() {
        return waist;
    }

    //setters

    public void setWaist(int waist) {
        this.waist = waist;
    }
}
