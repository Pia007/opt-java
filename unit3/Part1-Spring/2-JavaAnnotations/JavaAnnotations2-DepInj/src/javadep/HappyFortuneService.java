package javadep;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}

//Autowiring Example -constructor injection ex
	// HappyFortuneService, RandomFortuneService, DatabaseFortuneService and RestFortuneService all implement FortuneService
	// @Component id is happyFortuneService
		// Spring will scan for a component that implements FortuneService
