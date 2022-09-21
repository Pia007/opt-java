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

    // add another constructor
        // it expects to receive another Car - pass in Car source
        // set the fields equal to that of the source
        // go to Main and call the copy constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }

    // create a getter for each field
    public String getMake() {
        return this.make;
        //call also use return make
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

    //add an action to the car class
    public void drive() {
        System.out.println("You brought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
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

// Reference Trap - arrays and objects
    // when may variables share a reference to one object
        // state of a variable should not change bc another was updated
        // avoid: do not set class variables equal to one another, create a new object
// Copy constructor - copies every value from one object to another
    // one parameter - the object to copy values from, the source
        // public Car(Car source) {}
    // constructor overload - having more than one constructor
    // class can have many constructors - share same name, but can take diff parameters
    // how does java know which one is called - java looks at the arguments you pass in
    // CREATE A NEW OBJECT AND USE THE COPY CONSTRUCTOR TO COPY EVERY VALUE FROM A SOURCE

// Actions - methods that reps what the object can do