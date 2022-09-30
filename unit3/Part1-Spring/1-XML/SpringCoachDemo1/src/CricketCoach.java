public class CricketCoach implements Coach {

    // 2.create a constructor in your class for injection

    // fields
    private FortuneService fortuneService;

    // no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");

    }

    // setter for dependency injection
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
