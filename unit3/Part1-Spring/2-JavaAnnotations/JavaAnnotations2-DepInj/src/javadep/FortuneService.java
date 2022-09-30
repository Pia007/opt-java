package javadep;

// define dependency interface
public interface FortuneService {

	public String getFortune();

}

// Autowiring Example
	// inject FortuneService into a Coach implementation
		// Spring will scan for a component that implements FortuneService
		// and inject it into the Coach implementation
