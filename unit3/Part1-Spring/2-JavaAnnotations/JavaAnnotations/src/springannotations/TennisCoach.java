package springannotations;

@Component("thatSillyCoach")  // annotation with bean ID

public class TennisCoach  implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}

