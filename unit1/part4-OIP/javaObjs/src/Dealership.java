import java.util.Arrays;

public class Dealership {

    private Car[] cars;  //create a field of cars

    // dealership constructor
    public Dealership() {
        //set the field with size of 3
        this.cars = new Car[3];

    }

    // setter
    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

}

// dealership class is a manager class
    // manages objects of another class
    // will manage objects of the car class
    // dealership class needs to model every field and every action
        // field will be an array of car objects
    // next go to main and create an object of the dealership
// setter
    // dealership has one field - req 1 setter
    // the field is an array of Cars
        // setCar is not a good idea - only want to be able to update one car
        // the setter should update 1 obj at a time, and let the user choose which obj
        // How?
            // dealership obj will call setCar()
                // setCar will receive a car obj - Car car
                // setCar will receive a parameter that identifies which car - int index
                // at that index, set that element in the Cars array to a new car obj
                    // then call the copy constructor by passing in a source obj
                    // this.cars[index] = new Car(car);   good habit to create a new obj using copy constructor
        // What's happening?
            // at the selected index, a new Car obj is created with a source obj passed in
            // Java runs the copy constructor that receives one as a parameter
            // every field value from the source obj is copied into the car that was just created
    //*Main to update the cars array