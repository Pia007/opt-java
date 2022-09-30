//1a constructor injector -  defining the dependency interface
public interface FortuneService {

    public String getFortune();
}


// Coach interface
// provides daily workouts
// will now provide daily fortunes
//How? helper object/dependency - FortuneService

// Common Injection Patterns
// Constructor Injection
// Process
// 1.define the dependence interface and class
// 2.create a constructor in your class for injection
// 3.configure the dependency injection in the spring configuration file
// Setter Injection
