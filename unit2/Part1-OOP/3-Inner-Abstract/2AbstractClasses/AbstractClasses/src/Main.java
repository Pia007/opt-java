public class Main {
    public static void main(String[] args) throws Exception {

        // creating a new Dog object
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        // creating a new Bird object
        Parrot parrot = new Parrot("Amazon Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        // creating a new Penguin object
        Penguin penguin = new Penguin("Emperor Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();

    }
}

// Abstract class
    // use keyword abstract
    // cannot directly instantiate an abstract class
    // define methods but do not provide implementation of those methods
    // the classes that inherit from the abstract class are required to provide implementation of the methods

