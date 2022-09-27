import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // implement a methdod that will sum of wild card data structure
    public static double sumAll(List<? extends Number> list) {

        double sum = 0.0;
        for (Number n: list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Upper bounded wildcard
    // list of items that are a subtype of number
    public static void showAll(List<? extends Number> list) {
        for (Number n : list)
            System.out.println(n);
    }




    public static void main(String[] args) throws Exception {

        // create Arraylist of 
        List<? extends Number> listOne = new ArrayList<>();   // no compile error
        List<? extends Number> listTwo = new ArrayList<Integer>();   // no compile error
        List<? extends Number> listThree = new ArrayList<Double>();   // no compile error 
        List<Integer> listFour = new ArrayList<Integer>();   // no compile error bc Integer is a subtype of Number  

        // use upper bounded wildcards to read the items
        showAll(Arrays.asList(1, 2, 3)); // no error bc int is subtype of number
        showAll(Arrays.asList(1.0, 2.0, 3.0)); // no error bc double is subtype of number
        showAll(Arrays.asList(1.0f, 2.0f, 3.0f)); // no error bc float is subtype of number

        // adding to the list is not allowed when using ? 
        System.out.println(sumAll(Arrays.asList(1, 2, 3)));
        System.out.println(sumAll(Arrays.asList(1.2, 2.8, 3.5)));
    }
}



// Upper bounded wildcard
    // want to use wildcards with child classes
    // show the items in the list of Rectangle when we know the rectangle is a shape
        // extends keyword ex) printAll(List<? extends T>)
            // accepts a list any subclass of T
    // adding an item when using an upper bounded wildcard
        // ex) addItem(List<? extend Number>)
            // Java will not let this happen because the type of the list is unknown
                // cannot add an item to a list of unknown type
    // Therefore reading and writing items using upper bound wildcards are independent opperations
        // can read items from List<? extends T>
        // cannot add items to List<? extends T>