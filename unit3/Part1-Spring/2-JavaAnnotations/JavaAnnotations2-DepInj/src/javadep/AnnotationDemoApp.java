package javadep;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();
		
	}
}

// Java Annotations - Dependency Injection and Autowiring
	// Autowiring - Note in spring 4.3 @Autowired is no longer required
		// Spring will automatically wire objects together
		// How?
			// Spring will look for a class that mtches the propperty
				// matches by type: class or interface
			// Spring find the match and will automatically inject it
	// Spring will scan for a component that implements FortuneService
	// Spring will inject that dependency automatically
	// If multiple implementations of an Interface are found
		// use @Qualifier to specify which implementation to use
	// Autowiring Injection Types
		// Constructor Injection
		// Setter Injection
		// Field Injection
	// Constructor Injection - TennisCoach.java
		// inject dependencies by calling setter methods on the
		//1. Define the dependency interface and class
		//2. Create a constructor in your class for injection
		//3. Configure the dependency injection with @Autowired


