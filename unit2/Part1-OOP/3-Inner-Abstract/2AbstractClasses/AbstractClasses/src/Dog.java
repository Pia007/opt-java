public class Dog extends Animal{

    // constructor
    // using super() to call the constructor of the class that we are extending from
    public Dog(String name) {
        super(name);
    }


    // overriding the abstract methods - make the class concrete and valid
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }


}

// initially the Dog class is empty
// the error message requires that abstract methods from the Animal class be implemented

