class Movie {

    //fields
    private String name;

    //constructor
    public Movie(String name) {
        this.name = name;
    }

    //methods
    public String plot() {
        return "This movie does not have a plot.";
    }

    //getters
    public String getName() {
        return name;
    }
}

class Halloween extends Movie {

    // constructor
    // super() calls the constructor of the parent class
    public Halloween() {
        super("Halloween");
    }

    // methods
    @Override
    public String plot() {
        return "Jason was very scary";
    }
}

class Armageddon extends Movie {

    // constructor
    public Armageddon() {
        super("Armaggedon");
    }

    // methods
    @Override
    public String plot() {
        return "A meteor is going to hit the earth";
    }
}

class StarWars extends Movie {

    // constructor
    public StarWars() {
        super("Star Wars");
    }

    // methods
    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class Lou extends Movie {

    // constructor
    public Lou() {
        super("Lou");
    }

    // methods
    @Override
    public String plot() {
        return "A CIA agent tries to save her family.";
    }
}

class IndependenceDay extends Movie {

    // constructor
    public IndependenceDay() {
        super("Independence Day");
    }

    // methods
    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class Forgettable extends Movie {

    // constructor
    public Forgettable() {
        super("Forgettable");
    }

    // methods
    // no plot method

}

public class Main {
    public static void main(String[] args) throws Exception {

        for (int i = 1; i < 11; i++) {

            // create new movie
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
                    + "Plot: " + movie.plot() + "\n");
        }
    }


    // method to generate a random movie
    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 6) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        // process the random number to return a movie
        switch (randomNumber) {
            case 1:
                return new Halloween();
            case 2:
                return new Armageddon();
            case 3:
                return new StarWars();
            case 4:
                return new Lou();
            case 5:
                return new IndependenceDay();
            case 6:
                return new Forgettable();
            default:
                return null;
        }
        // return null;
    }
}


//Polymorphism 
// method or mechanism in OOP that allows actions to act differently based on the actual object that the action is being performed on.
// Demonstration of polymorphism - create several classes.
// All w/i the Main public class.
// Way to create classes that will never be reused
// Pro: small and compact classes
// May or may not be accessible outside of the Main class, based on modifiers.
// Create a basic Movies Class
// Then create classes that relate to a specific type of movie
// create a static method that will return a random movie
// inllustrate polymorphism
// create a for loop that will iterate 10 times and return a random movie
// getNumber() method - will return the movie name
// plot() method - will return the plot of the movie
// if it has a plot, it will execute the plot method in that movie class
// if it doesn't have a plot, execute the plot from the parent class, it will return "No plot here"
// thus POLYMORPHISM - the same method name, but different results based on the object that it is being called on.

