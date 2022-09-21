public class Car {

    // define fields that describes a car
    // make every field in the care class private
    private String make;
    private double price;
    private int year;
    private String color;

    // add a constructor that takes 4 parameters
        // now in Main, the new instances of Car will have error bc it is expecting parameters
    public Car( String make, double price, int year, String color) {
        // set each field in the object equal to a parameter - this keyword (current object)
            // this distinguishes between fields and parameters
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;

    }

    // create a getter for each field
    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }

    // add setters to update fields
    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// class - blueprint for creating objects

// When creating a class you need to follow 3 steps
    // if a class has fields it needs to have:
    // constructor ex) car class needs one constructor, 4 getters and 4 setters
    // getters
    // setters

// constructor - updates fields and runs as soon as the object is created
    // How to make a constructor?
        // specify level of access - public
        // class name - shares the name of the class that it is in
        // parameters
// public vs private
    // public - methods and constructors - access from anywhere
    // private - fields, no access outside their class Why?
        // if access the field using dot syntax, getting the actual field - leads to mistakes
        // to access the field's value, use getter to get a copy of the field
// getter - returns a copy of the field value that you are interested in
    // do not have parameters
    // always add getters if the class has fields
    // public, lowerCamelCase, returns a copy of the field
// setters - if class has fields, need to add setters
    // update a private field
    // public, lowerCamelCase, receives a parameter
    // updates the field of the current object a parameter
    // every car obj can call them using dot syntax