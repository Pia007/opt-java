package models;

// make comparable
public abstract class Product implements Comparable<Product> {
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

    // copy constructor for the parent class
    public Product (Product source) {
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;
    }

    //getters
    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    // setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract void fold();

    //override compareTo

    @Override
    public int compareTo(Product specifiedObject) {
        // sort alphabetically by class name then by price

        // get product and specified obj class names
        String className = this.getClass().getSimpleName();
        String specClassName = specifiedObject.getClass().getSimpleName();

        //check if the class names are not equal
        if (!(className.equals(specClassName))) {
            return className.compareTo(specClassName);
        }

        return (int) Math.round(this.getPrice() - specifiedObject.getPrice());
    }
}
