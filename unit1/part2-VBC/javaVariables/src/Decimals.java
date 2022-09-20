public class Decimals {
    public static void main(String[] args) {

        //double variables store decimals
        // 8 bytes of memory
        // have a range of -1.7x10^308 to 1.7x10^308 for storage
        // add D at the end of the variable name to signify that it is a double variable
        double percentage = 55.7;
        System.out.println("In 2022, " + percentage + "% of the world's population is urban.");

        double dividend = 25;     // stores is as a decimal
        System.out.println(dividend);  // prints it as a decimal, 25.0

        double divisor = 5;
        System.out.println(dividend + " dividend by " + divisor + " = " + dividend/divisor);  // prints 5.0

        //Always use double for math calculations - percision is lost when using int or long



    }
}
