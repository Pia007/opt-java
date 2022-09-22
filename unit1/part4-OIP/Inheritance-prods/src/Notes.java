public class Notes {
}

// Inheritance makes code reusable
    // Shirt and pants need to inherit from a Parent class
    // they share similar fields
        // instead of defining fields for each class
            // should inherit common fields from a parent class
    // they are children of the Product class
// in models create Product.java
    //define fields that shirt and pants have in common
        //then remove them from the shirt and pants fields and the constructors
        // also remove the same getters
   // a class that extends another class inherits from it
    // shirt and pants extend the Product class
        // now add extend to the shirt and pants classes
    //*Main confirm by creating an object of the shirt class
//super  superclass aka Parent class
    // super() - calls the constructor of the parent class
        // pass in args of the constructor
        // child class must use the parent class to update fields
    // create the constructor for the Product class
    // use super() to have shirt and pants to update fields
        // USE THE DEBUGGER TO STEP THROUGH THE EXECUTION
        // both will inherit 3 fields from the parent instructor that will be updated
        // after those field are updated, then they each update their own unique fields
             // ex shirt will update size and pants will update waist
// Shirt and Pants classes are inherit from the Product class
    //*Main - make the pants and shirt obj of type Product
// polymorphism is useful bc of flexibility
    // *Main - shirt and pants are both of type Product, they can be stored in an array

// super() copy Constructor
    // child calls the parent copy constructor
    // remove the array in Main
    // create shirt2 in Main, then in Shirt, create a copy constructor in Shirt, then a copy constructor in Product
    // create pants2 ''''''

// Getters and Setters
    // child class will inherit getters and setters its parent class
    // Product - parent
    // Shirt and Pants - children, have access to the product setters
        // shirt - has getter and setter for size
        // pants - had getter and setter for waist
    //*Main shirt and pants can access inherited getters and setters

// Abstract - a class can be abstract
    // can create an object of a concrete class, Product
    // CANNOT create an object of an abstract class
    // make a class abstract if its only purpose is inheritance
    // If you Label the parent class abstract, should not be able to create an object of the parent class
    // requirements state that the store sells shirt and pants
        // need to prevent and object of the Product class from being created because it would be ambiguous
            // Product product = new Product(4.99, "blue", "Java");  should not be allowed
        // make the Product class abstract
        // only purpose of the Product class is to provide inheritance for pants and shirt


