package javacode;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    //field
    private FortuneService fortuneService;

    // ref the values from the properties file
    @Value("${opt.email}")
    private String email;

    @Value("${opt.team}")
    private String team;

    //constructor
    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    //getter and setter methods
    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

// Java Code - injecting values from properties file
    // Process
    // Create a properties file
    // load the properties file into the spring config file
    // reference the values from the properties file