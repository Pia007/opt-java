// Legacy code

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
            // pass the name of the config file into the constructor
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from spring container
            // myCoach is the bean id
            // Coach is the interface
                // .class refers to the bean class attribute in the xml file
        Coach theCoach = context.getBean("myCoach, Coach.class");

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();

    }
}
