package models;

public class Shirt extends Product {

    // fields
    private String size;

    //constructor
    public Shirt (String size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;

    }

    // copy constructor
    public Shirt (Shirt source) {
        super(source);
        this.size = source.size;
    }

    //getters
    public String getSize() {
        return size;
    }

    //setters
    public void setSize(String size) {
        this.size = size;
    }
}
