package com.springdemo;

public class TrackCoach implements Coach {

    // method to override
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K.";
    }
}
