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
// hashCode() and equals() - adding both to child classes
    // equal() - use the super() method when comparing parent class to the child class
        // super() calls the getter in the parent class
    // hashCode() - to generate a hash code
        // pass in the unique param and the super params from the parent
            // ex Shirt class  return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
            // go to *Main and check if shirt and shirt2 are equal using the debugger
                // based on the contents of the objects they are equal
            // *Main print the hashCodes of ea shirt
                // they are both the same

//this.method vs super.method
    // this can call local and inherited methods
        // when calling an inherited method, safer to use super bc this will call the local method first
    // super can only call inherited methods

// toString() - add to each child class and print one of each

//Enum - an item that contains a limited number of constants
    // used to ensure that something can only be a limited number of values
    // defines a collection of static final constants
    // size of a shirt should only be sm, med, lg, xl, xxl
    // in shirt class - create a public enum
        // constants must be in CAPS
        // by default the values are final
    // next change the SIZE field from a String to Size so that it can only be the number of constants
    // next the constructor needs to receive an enum constant
    // change getters and setters to reflect the enum Size
    // *Main - enum is explicitly static - can be accessed directly from the class
        // and give it one of the 5 values ex Shirt.Size.XL

// abstract method - many ways to implement
    // Parent - if implemented by parent, child class is forced to override it
        // create only to force child classes to override it
        // How? ex) public abstract void pay(double price);
            // public - specify level of access
            // abstract - can be implemented in different ways
            // void - return type
            // parameters
    // requirements - evey product must be folded before sale
        // must for every child to implement the fold method
        // *Product define a public abstract method that forces every child class to define a method that returns void when fold() is called
            // and it does not take any parameters
        // abstract method does not have a body, is not concrete and can be implemented in several ways
        // each child class will have its own way of overriding it
            //Shirt and Pants class override it
        //*Main test

//Interface - defines a method that a class needs to implement, contract
    // if a class implements an interface it must override all methods inside the interface
    // used to define behavior that is required from a class
    // How? ex) public interface name {};
        // method signatures are defined inside the interface
            // public void method1();
        // the class that implements it must override every method inside of it
    // *Pants - pants are eligible for %50 discount
        // force the pants class to implement this behavior
        // How to Define and interface?
            // in models create Discountable.java
                // make it an interface
                // force every class that implements it to override a public void method called discount
            //*Pants - add that it implements the discountable interface
                // and is agreeing to override the discount method
                // override the discount()
        // *Main - use debugger to test
        // Interfaces allow polymorphism How?
            // Pants are discountable, can declare the object as type discountable
// sort() - sorts Comparable objects
    // Comparable is an interface that classes can implement
        // defines one method, compareTo()
        // expects a generic - like a function receives a parameter, a class or interface can receive a generic
            // public interface Comparable<T> {} - <T> is the generic
            // the generic fields the methods signature
                // ex) public interface Comparable<T> {..... public in compareTo(T o) }  will have to override the compared to T
                // ex) public interface Comparable<Pants> { ..... public in compareTo(Pants o)} will have to override the compared to pants
        // products are required to be sorted by price
            // *Pants - implement the Comparable interface and pass in the pass type generic   <Pants>
                // now must override the compareTo() method of the Comparable interface
                    // compareTo(Pants specifiedObject) - using specifiedObject instead of 'o', WHY?
                        // a current object calls the method and is compared to the specified object
                            // compare price of current obj against the price of the specified obj
                            // How is an int used to compare the two
                                // if return value is - (crr obj < spec obj), 0 (crr obj = spec obj), + (crr obj > spec obj)
                            // in the return statement use super to subtract the specified obj from the current obj
                                // do not use int alone, to type cast the result bc it could cause a inaccurate result
                                        // use int Math.round()  ex)return (int) Math.round(super.getPrice() - specifiedObject.getPrice());
                                            // Math.round() rounds to the nearest whole number  of type long
                                            // then type cast to an int
                            // * Main -test before sorting, create another Pants obj
                                //compare pants to pants3...etc
                // sort() can use compareTo to determine how to sort comparable objs
                    // calls compareTo from one obj against a specified obj
                    // when the result of compareTo is positive, sort knows that the current obj is > the specified obj and
                        // will place the specified obj after the current.
                        // repeats the process across the entire array from lowest to highest
                // remove everything from main and copy everything from sample-one.txt in resources
                    // use Arrays.sort(products)
        // *Shirt class - make it comparable, both the pants and shirt classes have the same implementation of compareTo
            // so define the compareTo implementation inside of the parent, Product, class
                // both shirt and pants will inherit the same method
        // Remove the Comparable interface and the compareTo() override from Pants and Shirts class
        // Make the Product class comparable in the with <Product>
            // next, override compareTo() - type cast the rounded difference between the current price and the specified objects price
            // now both Pants and shirts will inherit compareTo from Product
        // *Main - remove all code and replace with sample-two.txt, RUN AND all products are sorted by price from low to high
//sort() the products by alphabetical order based on class type then sort the rest by price
    //can get the class type by using getClass()
    // can get the name using getSimpleName()
    // *Product, inside compareTo get the class name of the current object
        // then check if they are NOT equal, and compare then if they are not
    // test and result will show all product sorted by class name then sorted by price

// Math,round() if diff, 0.5 will rd to 0,
    // use Double.compare(double, double) to compare decimals
        // ex return Double.compare(super.getPrice(), o.getPrice());
    // Replace array with that from Quiz and sort from lowest to highest price

// finalize the app
    // data has shirts and pants - can store each line as an obj of the Product class
    // create a function that returns a product array - getData()
        // create a new obj of the fil input stream class to connect the product.txt file
        // create a new obj from the scanner input class that will pick up the data from the file input stream
        // create a product array
        // create a for loop that will iterate as long as scan has a next line
            // use switch check if scan.next() is Pants or Shirt
                // set the elem at index to a new obj of the Pants or Shirt class
                    // use the correct scanner for the data type of the fields
                    // the Shirt constructor expects an enum value. Shirt.Size.valueOf(scan.next())
        // close the scanner
        // return the products array
    // inside main class
        // try to call getData() and store the array
            // sort the array
                // iterate over the array
                    // print each product
        // catch exception if it fails
            // print the exception




