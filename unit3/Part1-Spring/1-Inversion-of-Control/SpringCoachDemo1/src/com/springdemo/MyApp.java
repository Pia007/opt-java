package com.springdemo;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theCoach = new TrackCoach();


        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}

// requirements
    // app must be able to support different types of coaches
        // How? Use an interface - all Coaches will have a method called getDailyWorkout()
    // coach implemetation should be configurable and not hard coded