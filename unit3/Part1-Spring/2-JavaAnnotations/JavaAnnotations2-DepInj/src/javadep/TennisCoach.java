import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	// fields
	@Autowired
	private FortuneService fortuneService;

	// create a no-arg constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// create constructor for injection
	// @Autowired
	// public TennisCoach(FortuneService theFortuneService) {
	// 	fortuneService = theFortuneService;
	// }

	// setter method for injection
	// @Autowired
	// public void setFortuneService(FortuneService theFortuneService) {
	// 	System.out.println(">> TennisCoach: inside setFortuneService() method");
	// 	fortuneService = theFortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// method injection
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
//		fortuneService = theFortuneService;
//	}

}

// Autowiring Example
	// field Injection
	// @Autowired annotation on the field