public class Parrot extends Bird {

    // constructor
    public Parrot(String name) {
        super(name);
    }
}

// Part 2:update Parrot class
// Why? Bird class now implements CanFly interface
// Parrot class extends Bird class
// Parrot class automatically inherits the fly() method from the Bird class
// delete the fly() method from the Parrot class
