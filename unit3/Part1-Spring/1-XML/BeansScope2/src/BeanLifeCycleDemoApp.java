import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // load spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");


        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}

// Bean Lifecycle methods -TrackCoach
    //Container
        // creates the bean, injects dependencies, internal processing,
        // optionally calls custom init method, bean is ready for use, container shuts down,
        // optionally calls custom destroy method, stops
    // can add custom methods/hooks during bean initialization
        // custom business logic
        // setting up handle to resources(db, sockets, files)
    // can add custom methods/hooks during bean destruction
        // custom business logic
        // clean up handles to resources(db, sockets, files)
    //How?
        // configuration entry in spring config file
            // init-method="customInitMethod"
            // destroy-method="customDestroyMethod"
                // DESTROY METHOD IS NOT CALLED FOR PROTOTYPE SCOPED BEANS
        // Process
            // 1. Define methods in bean class
                // can have any name
                // can have any access modifier
                // can have any return type - void is most common
                // return value cannot be retrieved
                // no arguments
            // 2. Configure bean in spring config file