import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // load spring config file

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");


        // retrieve beans from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if the beans are the dame
        boolean result =(theCoach == alphaCoach);

        System.out.println("\nPointing to the same object" + result);

        // get memory location
        System.out.println("\nMemory location for theCoach: " + theCoach);

        // close the context
        context.close();
    }
}

// Bean Scopes
    // lifecycle of a bean
        // how long does a bean live?
        // how many instances of a bean are created?
        // how is the bean shared?
    // Spring supports scopes
        // singleton - default, one instance per spring container
            // cached in memory
                // all requests for the bean return the same instance
        // prototype - one instance per bean definition
        // request - one instance per HTTP request
        // session - one instance per HTTP session
        // global session - one instance per global HTTP session
    // can be explicitly set in the spring config file
        // scope="singleton"

