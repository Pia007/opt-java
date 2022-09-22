package models;

public class Pants extends Product {

    // fields
    private int waist;


    //constructor receives 4 parameters
    public Pants (int waist, double price, String color, String brand) {
        // 3 parameters are passed into the Parent constructor to update
        super(price, color, brand);
        // after Parent is done, Pants will update waist field using its own constructor
        this.waist = waist;
    }

}
