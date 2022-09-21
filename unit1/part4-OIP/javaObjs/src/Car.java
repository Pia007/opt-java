import java.util.Arrays;

public class Car {

    // define fields that describes a car
    // make every field in the care class private
        // add spare parts field to the car class
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    // add a constructor that takes 4 parameters

    public Car( String make, double price, int year, String color, String[] parts) {
        // set each field in the object equal to a parameter - this keyword (current object)
            // this distinguishes between fields and parameters
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    // copy constructor
        // it expects to receive another Car - pass in Car source
        // set the fields equal to that of the source
        // go to Main and call the copy constructor
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
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

    // update - add getter for spare parts
    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
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

    // add setter for parts field
    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    //add an action to the car class
    public void drive() {
        System.out.println("You brought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    //define a toString method
    public String toString() {
        return "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "parts: " + Arrays.toString(parts) + ".\n";
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

// Updates to constructor, getters and setters
    // When? whenever a new field is added to your class
    // adding an array field to the car class
        // every car now comes with spare parts - array
// Updating constructor
    // add String[] parts to the parameters
    // define the value - this.field = Arrays.copyOf(original, newLength);
        //why? because it's an array
    // next go to main and define the parts array, then add it to each call to the constructor
    // try running the code and you will see a reference to the array and not the elements
        // print the contents of the array - Array.toString(object.field)
    // Reference Trap
        // if set parts field to parts parameter - this.parts = parts;
            // bad because the parameter and field both share a ref to the same array
            // best practice is to set the field to a copy of the array
//Update the getters
    // need to add a getter for the spare parts field
    // ref trap - getter should not return an array field directly
    // should be a copy -- see spare parts getter
    // Update the copy constructor
        // nissan2 uses the copy constructor to update its field so it does not the spare parts array
            // update it by setting it to a copy of the source array and its length - see copy constructor above

//Update the setters
    // add a setter for the parts field bc it is private there is no way to update it from outside

// toString()
    //returns every field as one string and a special method
    // public, name toString and returns a string value
    // add a toString() method to the car class
    // Why is toString() special?
        //When you print an object, Java looks for toString() -- see prints in console
            // if the toString method is not used - it will return the name of the Class and a hashcode
            // when added to your class, Java automatically calls it when printing the object
    // good practice - every class that models and object should have a toString method

