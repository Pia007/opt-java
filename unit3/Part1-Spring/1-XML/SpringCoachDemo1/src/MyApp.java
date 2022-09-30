public class MyApp {

    public static void main(String[] args) {

       Coach theCoach = new TrackCoach();
       Coach theCoach2 = new BaseballCoach();

       System.out.println(theCoach.getDailyWorkout());
       System.out.println(theCoach2.getDailyWorkout());
    }
}

// Configuring Spring Container
    // 1. XML Configuration file-legacy
    // 2. Java Annotations - modern
    // 3. Java Source Code - modern

// Spring Development Process
    // 1. Define the Spring Beans -xml Configuration File
    // 2. Create a Spring Container - aka ApplicationContext
        // Specialized implementations of ApplicationContext
        // ClassPathXmlApplicationContext
        // FileSystemXmlApplicationContext
        // AnnotationConfigApplicationContext
        // WebApplicationContext
// 3. Retrieve Beans from Spring Container