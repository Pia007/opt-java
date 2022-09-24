package com.timbuchalka;

public class Fish extends Animal {

    // fields
    private int gills;
    private int eyes;
    private int fins;


    // constructor
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // methods
    public void rest(){
        System.out.println("Fish.rest() called");
        super.move(2);
    }

    // public void swim() {
    //     System.out.println("Fish.swim() called");
    //     move(60);

    // }

    public void moveMuscles() {
        System.out.println("Fish.moveMuscles() called");
        move(30);
    }

    public void moveBackFin() {
        System.out.println("Fish.moveBackFin() called");
        move(30);
    }

    private void swim(int speed){
        System.out.println("Fish.swim() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Fish.move() called");
        swim(speed);
        super.move(speed);
    }
}

