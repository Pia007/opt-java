package javadep;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.stereotype.Component;


@Component
public class TennisCoach implements Coach {

	// fields
	@Autowired
	@Qualifier("randomFortuneService")  // use this qualifier to specify which bean to use - default name of the bean id
	private FortuneService fortuneService;

	// create a no-arg constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff");
	}

	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff");
	}

	// create construnctor for injection
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

// Bean Lifecycle Methods with Annotations
	// @PostConstruct and @PreDestroy
		// any method name
		// can have any access modifier
		// can have any return type - void is common
			// although you can have a return type, it will be ignored
		// method should be no-arg
	// for prototype scope, Spring does not call the @PreDestroy method
		// because the container does not manage the complete lifecycle of a prototype bean
		// only when the application closes down, the container will call the @PreDestroy method