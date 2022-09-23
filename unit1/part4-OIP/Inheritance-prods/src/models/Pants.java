package models;

import java.util.Objects;

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

    //equals()
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Shirt)) {
            return false;
        }
        Pants pants = (Pants) o;
        return waist == pants.waist
                && super.getPrice() == pants.getPrice()
                && super.getColor().equals(pants.getColor())
                && super.getBrand().equals(pants.getBrand());
    }

    // hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(waist, super.getPrice(), super.getColor(), super.getBrand());
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " waist = '" + getWaist() + "'" +
                " price = '" + super.getPrice() + "'" +
                " color = '" + super.getColor() + "'" +
                " brand = '" + super.getBrand() + "'" +
                "}";
    }
}
