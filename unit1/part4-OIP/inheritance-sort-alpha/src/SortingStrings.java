public class SortingStrings {
    public static void main(String[] args) {
        String john = "John";
        String amy = "Amy";
        String jane = "Jane";

        //test compareTo()
        System.out.println(amy.compareTo(john));
        System.out.println(amy.compareTo("Amy"));
        System.out.println(jane.compareTo(john));
    }
}




// String can use Comparable interface
    //How? overrides compareTo()
        // - returned when the characters in the 1st String have a lower unicode value
        // 0 if Strings are identical
        // + returned when the characters in the 1st String have a higher unicode value
