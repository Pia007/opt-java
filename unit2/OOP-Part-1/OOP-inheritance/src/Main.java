package com.timbuchalka;

public class Main {

    public static void main(String[] args) throws Exception {
        // initialize an animal class
        // name, brain, body, size, weight
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        // initialize Dog class
        // name, brain, body, size, weight, eyes, legs, tail, teeth, coat
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // use the inherited methods
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Goldie", 2, 4, 2, 2, 2);

        fish.rest();
        fish.moveBackFin();
        fish.moveMuscles();

    }
}
