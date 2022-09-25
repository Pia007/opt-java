public class Car extends Vehicle {
    //fields
    private int doors;
    private int engineCapacity;

    //constructor
    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

}

// Car is a subclass of Vehicle

//Compostion - deals with has a relationship
// modelling parts of a whole

// Computer - has motherboard, case and monitor
// motherboard case and monitor are not computers
// Create a class for each part
