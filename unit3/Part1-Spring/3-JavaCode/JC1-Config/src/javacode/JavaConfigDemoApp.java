package javacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read the spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

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

// Confiugure Spring with Java Code Class
    // no xml file
    // Process:
    // 1. Create a Java class & annotate it with @Configuration
    // 2. Add component scanning support - @ComponentScan(optionally specify package)
    // 3. Read Spring Java config class with AnnotationConfigApplicationContext
    // 4. Retrieve bean from spring container
