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


