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
	// Filed Injection - TennisCoach.java
		// inject dependencies by setting field values directly into the class
		// uses Java Reflection to inject dependencies
		// NO NEED FOR SETTER METHODS
	// Default Bean names
		// if the annotation's value doesn't indicate a bean name, an appropriate name
		// will be built based on the short name of the class (with the first letter lower-cased).
		// Java Beans Introspector - https://docs.oracle.com/javase/7/docs/api/java/beans/Introspector.html
		// EX HappyFortuneService --> happyFortuneService
	// special case of when BOTH the first and second characters of the class name
		// are upper case, then the name is NOT converted.
		// EX: RESTFortuneService --> RESTFortuneService
	// Qualifies with constructors
		// @Autowired
		// public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
		// 	fortuneService = theFortuneService;
		// }
	// Injecting values from properties file
		// @Value("${foo.email}")
		// private String email;
		// @Value("${foo.team}")
		// private String team;


