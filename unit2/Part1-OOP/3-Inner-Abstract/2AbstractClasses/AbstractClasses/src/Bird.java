public abstract class Bird extends Animal {

    //constructor
    public Bird(String name) {
        super(name);
    }

    // overriding the abstract methods - make the class concrete and valid
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    // abstract method
    public abstract void fly();

}

// make abstract Bird class that extends abstract Animal class
    // abstract fly() method that individual birds will implement
    // cannot directly instantiate the Bird class in Main bc it is abstract
    // must create a new class that extends the Bird class

