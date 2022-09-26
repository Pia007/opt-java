public abstract class Bird extends Animal implements CanFly {

    //construtor
    public Bird(String name) {
        super(name);
    }

    // overriding the abstract methods from the animal class - make the class concrete and valid
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    // implementing fly() method from CanFly interface - make the class concrete and valid
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }

}

// make abstract Bird class that extends abstract Animal class
    // abstract fly() method that individual birds will implement
    // cannot directly instantiate the Bird class in Main bc it is abstract
    // must create a new class that extends the Bird class

// Part 2: update the bird class to implement the CanFly interface

