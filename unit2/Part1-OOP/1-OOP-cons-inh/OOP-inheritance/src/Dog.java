package com.timbuchalka;

/**
 *
 */
public class Dog extends Animal{

    //fields or state
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //inhertis from Animal, must call the constructor
    // all dogs have a brain and body, so we can hard code those values
    // add the rest of the fields
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // methods
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    //override methods
    // super() automaticaly defaults to the super class method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");

        // call move() from the animal class, better to use move() than super.move()
        // Why may want to create a move method in the dog class
        // using move() will guarantee that the move() in the dog class will be called
        // first if it exists
        // then it will be called in the animal class
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    //override move() from the animal class
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
