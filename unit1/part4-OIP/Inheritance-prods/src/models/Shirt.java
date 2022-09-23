package models;

import java.util.Objects;

public class Shirt extends Product {

    // enum
    public enum Size {
        SM, MED, LG, XL, XXL
    }

    // change String to Size enum
    private Size size;

    // add the enum to the constructor
    public Shirt (Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;

    }

    // copy constructor
    public Shirt (Shirt source) {
        super(source);
        this.size = source.size;
    }

    //getters - change String to Size
    public Size getSize() {
        return this.size;
    }

    //setters
    public void setSize(Size size) {
        this.size = size;
    }

    // override fold()
    @Override
    public void fold() {
        System.out.println("Lay the shirt on a flat surface.");
        System.out.println("Fold the shirt sideways");
        System.out.println("Bring the sleeves in.");
        System.out.println("Fold from the bottom up.");
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

    // toString
    @Override
    public String toString() {
        return "{" +
                " size = '" + getSize() + "'" +
                " price = '" + super.getPrice() + "'" +
                " color = '" + super.getColor() + "'" +
                " brand = '" + super.getBrand() + "'" +
                "}";
    }
}
