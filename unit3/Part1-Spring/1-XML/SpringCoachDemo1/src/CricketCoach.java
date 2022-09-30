public class CricketCoach implements Coach {

    // 2.create a constructor in your class for injection

    // fields
    private FortuneService fortuneService;
    private String emailAddress;  // literal injection
    private String team;   // literal injection

    // no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");

    }


    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //getters and setters for literal injection
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
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
