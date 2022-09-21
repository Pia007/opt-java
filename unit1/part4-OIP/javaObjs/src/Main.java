import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"tire", "keys"};

        Car nissan =  new Car("Nissan", 5000, 2020, "red", parts);
        Car dodge = new Car("Dodge", 11000, 2019, "blue", parts);
        Car nissan2 = new Car(nissan);
        nissan.setColor("green");
        dodge.setColor("white");
        nissan2.setColor("yellow");

        nissan2.setParts(new String[] {"tires", "filter"});  //return or change an array

        // create an object of the dealership class
        Dealership dealership = new Dealership();

    }
}


