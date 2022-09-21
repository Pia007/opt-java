import java.util.Arrays;

public class Dealership {

    private Car[] cars;  //create a field of cars

    // dealership constructor
    public Dealership() {
        //set the field with size of 3
        this.cars = new Car[3];

    }

}

// dealership class is a manager class
    // manages objects of another class
    // will manage objects of the car class
    // dealership class needs to model every field and every action
        // field will be an array of car objects
    // next go to main and create an object of the dealership