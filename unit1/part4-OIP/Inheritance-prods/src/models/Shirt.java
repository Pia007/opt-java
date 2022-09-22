package models;

import java.util.Objects;

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

    //equals()
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return size.equals(shirt.size)
           && super.getPrice() == shirt.getPrice()
           && super.getColor().equals(shirt.getColor())
           && super.getBrand().equals(shirt.getBrand());
    }

    // hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }
}
