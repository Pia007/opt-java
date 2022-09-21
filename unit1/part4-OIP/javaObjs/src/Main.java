import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create an object of the Car class
            //by default,  every field that is a number will start at 0 and null for strings
            // now that a constructor has been added, need to pass in 4 args, and the field will not be default
            // now that the constructor has been updated to 5 parameters, create and array called parts
            // then pass in the parts array into each constructor call
        String[] parts = {"tire", "keys"};
        Car nissan =  new Car("Nissan", 5000, 2020, "red", parts);
        Car dodge = new Car("Dodge", 11000, 2019, "blue", parts);

        // use the copy constructor
        Car nissan2 = new Car(nissan);

        // use a setter to update the color of each car
        nissan.setColor("green");
        dodge.setColor("white");
        nissan2.setColor("yellow");

        // set nissan2 to have a spare filter instead of keys
        nissan2.setParts(new String[] {"tires", "filter"});  //return or change an array

        // 50% off sell for every car
        nissan.setPrice(nissan.getPrice() / 2);

        dodge.setPrice(dodge.getPrice() / 2);

        System.out.println(nissan);
        System.out.println(dodge);
        System.out.println(nissan2);

        // call the drive action from the nissan obj
//        System.out.println(nissan.parts);
//        System.out.println(Arrays.toString(nissan2.getParts()));

    }
}


