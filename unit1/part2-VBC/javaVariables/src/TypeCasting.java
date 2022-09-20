public class TypeCasting {
    // used to convert a value from one type to another
    public static void main (String[] args) {
        // cast a val from double to int
        // int variables can not store decimals

        //need to cast the double value to int. How?
        double decimal = 4.3;
        int integer = (int)decimal;
        System.out.println(decimal);
        System.out.println(integer);

        double salary = 5833.333333;
        int roundedSalary = (int)salary;
        System.out.println("The salary is $" + roundedSalary);


    }
}
