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

    // getter
    public Car getCar(int index) {
        // same ref as the outside variable, will change the field, not good
        //return this.cars[index];

        // creating a new obj by copying the source does not change the field, good
        return new Car(this.cars[index]);
    }

    // sell action
    public void sellCar(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
    }

}

// dealership class is a manager class
    // manages objects of another class
    // will manage objects of the car class
    // dealership class needs to model every field and every action
        // field will be an array of car objects
    // next go to main and create an object of the dealership
// setters
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
// getters
    // must add bc the Cars field is private
    // for the sake of memory - do not get all car obj at once
    // dealership class manages an array of car objs
    // return 1 obj, from an index of the users choice
    //*Main get the car obj at index 0
    //Ref Trap
        // running the code shows that the field has change but its private
        // Why?
            // outside var and field  share a ref to the same obj
            // getter should not return an obj
    // Fix: return a new copy of the obj in Dealerships getter
        // pass in the source to copy values from - this.cars[index]
        // creates a new car obj by copying every field from the source obj into the new obj
            // java knows to run the constructor that receives one as a parameter
            // the getter returns a new copy, there is no way any of the obj in the cars field will be affected
        // now running the code shows that the field is still protected
// sell car action
    // sellCar() - pass in which car index
    // append the drive() to the care at that index
    // remove the car from inventory
    // *Main call sellCar from the dealership and pass in an index