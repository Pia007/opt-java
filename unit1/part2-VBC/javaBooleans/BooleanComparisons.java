public class BooleanComparisons {
    public static void main (String[] args) {
        //comparisons
        // >, <, >=, <=, ==, !=, equals (for String), !equals (for String)

        int myHeight = 68;
        int yourHeight = 58;

        System.out.println(myHeight != yourHeight);

        String myName = "Lucy";
        String yourName = "Josh";

        System.out.println(myName.equals(yourName));
        System.out.println(!myName.equals(yourName));

    }
}
