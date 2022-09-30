public class MyApp {

    public static void main(String[] args) {

        Coach theCoach = new TrackCoach();
        Coach theCoach2 = new BaseballCoach();

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach2.getDailyWorkout());
    }
}


// Dependency Injection - client delegates responsibility of creating dependencies to Spring
// 1. Constructor Injection
// 2. Setter Injection
// 3. Field Injection

// Spring Container creates the object and injects dependencies
// helper objects