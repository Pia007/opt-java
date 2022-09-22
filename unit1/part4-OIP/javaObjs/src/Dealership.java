import java.util.Arrays;

public class Dealership {

    private Car[] cars;  //create a field of cars

    // dealership constructor
    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        // update each element
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
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

    // search action
    public String searchCar(String make, int budget) {
        for (int i = 0; i < this.cars.length; i++) {

            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equals(make) &&  this.cars[i].getPrice() <= budget) {
                return "\nWe found one in spot " + i + "\n" + this.cars[i].toString() + "\nAre you interested?" +"\n";
            }
        }
        return "Sorry we could not help you find a car.";
    }

    // add toString()
    public String toString() {
        String temp = "";

        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " + i + "\n";

            // if null, append empty
            if (this.cars[i] == null) {
                temp += "Empty\n";
            } else {
                temp += this.cars[i].toString() + "\n";
            }
        }
        return temp;
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
// search action
    // will search through all cars and return on that fits the cx's liking
        // 2 params ( make and budget)
    // Main* test - have the dealership search for a dodge on an 8000 budget
    // now add the logic - for loop
    // NULLPOINTER EXCEPTION - trying to access or dot syntax something with a null will crash and throw an exception
        // one care is null - must write logic for it

// add toString() to the dealership
    // return a string rep of every car
    // iterate over the cars array and
        // append the parking spot of each car to the temp var
        // append the description of each car obj
    //*Main - test by printing the dealership obj

// fixing the constructor
    // first then that runs when a new obj is created
    // should update every field of a new obj
    //*Main - remove
           // for (int i = 0; i < cars.length; i++) {
           //     dealership.setCar(cars[i], i);
           // }
        //Why? calling setter to update the cars field, should be done by constructor
    // pass the array of car objs into the constructor - Car[] cars
    // change the fixed length, 3, to reflect the same length of the parameter that gets passed in
        // Car[cars.length] cars
    //*Main - pass in one arg so that java will know which constructor to call
        // car array
    //*Main - add 2 more cars to the cars array and print dealership
        // spots should be empty bc all elements have not been updated
    // update every element with an object from the cars parameter
        // in dealership constructor
            // iterate over the cars array,
                    // index every element in the cars field
                    // avoid the ref trap by setting every elem in the cars field equal to a new car obj
                        // with each new cars obj copying its values from its source, the obj being indexed from the cars parameter
    // WHY NOT USE Arrays.copyOf
        // shallow copies the ref on each element
        // therefore elements from both arrs will share a ref to the same obj -- not good