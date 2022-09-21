public class Main {
    public static void main(String[] args) {
        // create an object of the Car class
            //by default,  every field that is a number will start at 0 and null for strings
            // now that a constructor has been added, need to pass in 4 args, and the field will not be default
        Car nissan =  new Car("Nissan", 5000, 2020, "red");
        Car dodge = new Car("Dodge", 11000, 2019, "blue");

        // use a setter to update the color of each car
        nissan.setColor("green");
        dodge.setColor("white");

        // 50% off sell for every car
        nissan.setPrice(nissan.getPrice() / 2);

        dodge.setPrice(dodge.getPrice() / 2);

        // use the getter to print the color of the nissan object
        System.out.println(nissan.getColor());

        // can update the fields of an object using . syntax
        // nissan.year = 2030;
        // nissan.color = "orange";

        //instantiate a new car object



        System.out.println("This " + nissan.getColor() + " " + nissan.getYear() + " " + nissan.getMake() + " costs " + "$" + nissan.getPrice());
        System.out.println("This " + dodge.getColor() + " " + dodge.getYear() + " " + dodge.getMake() + " costs " + "$" + dodge.getPrice());


    }
}


