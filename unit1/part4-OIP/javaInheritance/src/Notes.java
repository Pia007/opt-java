public class Notes {
    public static void main(String[] args) {

    }
}

// Inheritance
    // Classes
        // inherit props from other classes
        // all have a common ancestor - object class
        // all inherit methods from the object class
            // the object class has a default equals(), toString(), hashCode ...etc
    // get inheritance folder from resources
        //*Main - create a new person and notice that it inherits methods automatically
//Overriding - class can be customized by overriding methods that it inherits
    //equal(), compares reference when used for obj and returns a boolean
        //*Main overriding equals() - illustrates why you should not use == to compare objects
            // by default obj inherits equals()
                    // uses == to compare the refs of 2 objs, thus need to OVERRIDE THE LOGIC of equals()
            // *Main - compare obj using equals(), same result as ==
    // how to override equals() - see Person

// hashCode() - equality contract, obj that are equal must always share the same hashCode
    // comment out equals() override in Person.java
    // *Main p1 and p2 have the same hashCode bc if inheritance
    //* now make p2 a copy of p - not the same hashCode
    // what happens when equals() is overridden but hashCode is not
        // uncomment the equals() override
        // set the objs directly equal to each other
        // both p and p2 point to the same obj
            // same hashCode and equality is true
        // so the equality contract is not broken
        // now set p2 to a new copy of the obj and run
            // equality true but different hashCodes
                // equals() compares the fields from each obj
                // hashCode() assigns a ref to each obj for its lifetime
            // equality contract is broken
                // fix always override hashCode if you override equals()
    // now override the hashCode() using the Objects.hash()
        // assigns equal objs the same hashCode
        // now equality is true and p and p2 have the same hashCode

//Overriding toString()
    //*Main - call to string for one of the obj and print
        // prints a ref to the Person class ex) Person@2482f9
        // by default Person inherits the toString() method from the obj class
    // in order to print the objects field when printing the obj, must override the toString()
        // do this in Person




