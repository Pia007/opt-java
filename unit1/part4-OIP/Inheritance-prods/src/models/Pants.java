package models;

import java.util.Objects;

// implement the interface
public class Pants extends Product implements Discountable, Comparable<Pants> {

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

    // override discount() from the interface
    @Override
    public void discount() {
        // offer a 50% discount
        super.setPrice(super.getPrice() / 2);
    }

    // override fold()
    @Override
    public void fold() {
        System.out.println("Hold pants upright.");
        System.out.println("Fold one leg over the other.");
        System.out.println("Fold pants from the bottom in thirds.");
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


    // compareTo()
    @Override
    public int compareTo(Pants specifiedObject) {
        return (int) Math.round(super.getPrice() - specifiedObject.getPrice());
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
