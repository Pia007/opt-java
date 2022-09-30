import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	// fields
	@Autowired
	@Qualifier("happyFortuneService")  // use this qualifier to specify which bean to use - default name of the bean id
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
	// @Qualifier to tell Spring which bean to use