import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	// fields
	private FortuneService fortuneService;

	// create a no-arg constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// create construnctor for injection
	// @Autowired
	// public TennisCoach(FortuneService theFortuneService) {
	// 	fortuneService = theFortuneService;
	// }

	// setter method for injection
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

// Autowiring Example
	// Setter Injection
		// @Component - default bean ID is tennisCoach
		// create no -arg constructor in your class for setter injection
		// create a setter method in your class for injection
		// configure the dependency injection with @Autowired