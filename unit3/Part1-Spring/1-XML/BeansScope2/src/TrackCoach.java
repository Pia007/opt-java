public class TrackCoach implements Coach {

    // 2.create a constructor in your class for injection

    // fields
    private FortuneService fortuneService;

    // no-arg constructor
    public TrackCoach() {

    }

    // constructor for dependency injection
    public TrackCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5K.";
    }

    @Override
    public String getDailyFortune() {
        return "I wish this old stuff worked: " + fortuneService.getFortune();
    }

    // define method for init
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // define method for destroy
    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }
}
