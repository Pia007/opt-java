package javadep;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach implements Coach {

	// fields
	private FortuneService fortuneService;

	// create construnctor for injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	// add new method for fortunes
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

// Autowiring Example
	// Constructor Injection
		// @Component - default bean ID is tennisCoach
		// create a constructor in your class for injection
		// @Autowired - Spring will scan for a component that implements FortuneService
			// and inject it into the Coach implementation