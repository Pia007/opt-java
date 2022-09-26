public abstract class Animal {

    //fields
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    // abstract methods
    // forcing the classes that will inherit from this class to implement these methods
    // each method does not have a body - the body is provided by the class that inherits from this class
    public abstract void eat();

    public abstract void breathe();

    // getters - not abstract
    public String getName() {
        return name;
    }

}

// Part 2: Abstract Class v Interface
    // fields
        // abstract class can have fields
        // interface cannot have fields
    // constructors
        // interfaces cannot have constructors
        // abstract classes can have constructors
    // methods
        // not all methods of an abstract class have to be abstract -See Animal class
            // abstract classes can have defined methods, methods with an implementation
            // methods are required to be implemented by the classes that inherit from the abstract class
            // methods of an abstract class can have any access modifier
        // all interface methods are abstract methods
            // methods are required to be implemented by the classes that implement the interface
    // variables
        // abstract class can have member variables that are inherited by the subclasses
        // interfaces can have variables
            // but they are all public, static and final - cannot be changed, constant
    // access modifiers
        // abstract class can have any access modifier
    // interface are automatically public
