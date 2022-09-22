import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // String[] parts = {"tire", "keys"}; same as new String[] {"tires", "keys"};

        // Define and array of cars, instead of having 3 separate car variable,
        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
                new Car("Dodge", 11000, 2019, "blue", new String[] {"tires", "keys"}),
                new Car("Nissan", 5000, 2016, "yellow", new String[] {"tires", "filter"}),
                new Car("Ford", 48000, 2022, "black", new String[] {"tires", "filter"}),
                new Car("Toyota", 41000, 2022, "white", new String[] {"tires", "keys"}),

        };

        Dealership dealership = new Dealership(cars);
        System.out.println(dealership);


    }
}





