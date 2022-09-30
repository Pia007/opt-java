
public class BaseballCoach implements Coach {

    // fields
    private FortuneService fortuneService;

    // constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    // no-arg constructor
    public BaseballCoach() {
    }


    @Override
    public String getDailyWorkout() {

        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}

