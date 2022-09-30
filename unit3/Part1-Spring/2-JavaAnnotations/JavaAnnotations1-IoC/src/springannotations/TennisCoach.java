package springannotations;

@Component  // annotation with default bean ID

public class TennisCoach  implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}

// Default Bean ID
    // Class Name with first letter lower case
        // TennisCoach -> tennisCoach
    // @Component("thatSillyCoach") - override default bean ID
        // @Component without a value - use default bean ID

