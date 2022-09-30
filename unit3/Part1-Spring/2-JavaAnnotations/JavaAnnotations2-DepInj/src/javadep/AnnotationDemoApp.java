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
	// Setter Injection - TennisCoach.java
		// inject dependencies by calling setter methods on the
		//1. Create setters in your class for injection
		//2. Configure the dependency injection with @Autowired
	// Method Injection - TennisCoach.java
		// @Autowired annotation on the method


