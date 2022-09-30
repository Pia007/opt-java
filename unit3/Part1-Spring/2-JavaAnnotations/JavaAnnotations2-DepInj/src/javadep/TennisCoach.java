package javadep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.context.annotation.Scope;
import org.springframework.beans.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	// fields
	@Autowired
	@Qualifier("randomFortuneService")  // use this qualifier to specify which bean to use - default name of the bean id
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
}

//@Scope Annotation