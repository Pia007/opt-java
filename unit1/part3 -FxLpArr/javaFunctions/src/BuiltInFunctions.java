package src;

public class BuiltInFunctions {
    public static void main(String[] args) {
        // calling println() function
        System.out.println("Hello Java");

        double sine = Math.sin(1.2);
        System.out.println("The sine of 1.2 is: " + sine );

        double power = Math.pow(2, 4);
        System.out.println("2 to the power of 4 is: " + power);

        double random = Math.random();
        System.out.println("The random value is: " + random);

        double random100 = 100 * Math.random();
        System.out.println("The random value between 1 and 100 is: " + random100);

        double squareRt = Math.sqrt(random100);
        System.out.println(squareRt);
    }
}
