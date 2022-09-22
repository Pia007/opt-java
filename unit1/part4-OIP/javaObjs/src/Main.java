import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // String[] parts = {"tire", "keys"}; same as new String[] {"tires", "keys"};

        // Define and array of cars, instead of having 3 separate car variable,
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
                new Car("Dodge", 11000, 2019, "blue", new String[] {"tires", "keys"}),
                new Car("Nissan", 5000, 2020, "yellow", new String[] {"tires", "filter"})
        };

        Dealership dealership = new Dealership();

        // update the dealership cars field by putting car objs in the array, replace make with index
        // dealership.setCar(nissan, 0);
        // instead of doing them individually, use a for loop

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        // get the car obj at [0]
        Car newCar = dealership.getCar(0);
        System.out.println("An outside variable is set to the car at index 0" + "\n" + newCar);

        // update the new car's color field, this changes the outside variable
        newCar.setColor("blue");
        System.out.println("This changes the outside variable's car color to blue" + "\n" + newCar);

        // access another copy of the car at index 0 and print it, the field is not changes
        System.out.println("The protected field has not changed" + "\n" + dealership.getCar(0));

        //the outside variable was changed but the obj[0] of the car field changed too
    }
}





