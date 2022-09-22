import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // String[] parts = {"tire", "keys"}; same as new String[] {"tires", "keys"};

        // Define and array of cars, instead of having 3 separate car variable,
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
                new Car("Dodge", 11000, 2019, "blue", new String[] {"tires", "keys"}),
                new Car("Nissan", 5000, 2016, "yellow", new String[] {"tires", "filter"})
        };

        Dealership dealership = new Dealership();

        // update the dealership cars field by putting car objs in the array, replace make with index
        // dealership.setCar(nissan, 0);
        // instead of doing them individually, use a for loop

        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        // sell a car
        dealership.sellCar(2);

        // search for a car
        System.out.println(dealership.searchCar("Dodge", 15000));

        // print the dealership
        System.out.println(dealership);
    }
}





