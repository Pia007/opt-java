package springannotations;
import  org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);  // default bean ID is tennisCoach

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }

}

// Java Annotations
    // special labels/ markers added to Java classes
    // provide meta-data about the class
    // processed at compile time and/or runtime for special processing
// Examples
    // @Override - indicates that the method overrides a method in a superclass
    // at compilation time, the compiler checks to see if the method actually
    // overrides a method in a superclass
// Why use Spring configs with annotations?
    // XML is verbose
    // configure Spring beans
    // Annotations minimize the amount of XML configuration
// How Annotations work?
    // Spring will scan classes for special annotations
    // Spring will automatically register the beans in the Spring container
// Process
    // Enable component scanning in Spring config file
    // Add the @Component annotation to your Java classes
    // Retrieve bean from Spring container
