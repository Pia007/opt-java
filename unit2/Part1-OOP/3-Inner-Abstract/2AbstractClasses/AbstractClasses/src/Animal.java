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

// Abstract Class v Interface
// not all methods of an abstract class have to be abstract
// entire interface is abstract - no fields, no constructors, only specify
// methods that must be implemented
// Animal Class is an abstract class
// it has fields, constructors and some methods are abstract

