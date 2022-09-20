// scope of the function is within {}

// scope of a class spans the entire class

public class Scope {
    // scope spans the entire class
    static int dogs = 26;

    public static void main(String[] args) {
        System.out.println(dogs);
        // int apples = 5;
        // will not compile
        // someFunction(apples);

         someFunction();

    }

    public static void someFunction() {
        // error - out of scope
        // System.out.println(apples);

        // will work
        int apples = 5;
        System.out.println(dogs);

    }

}
