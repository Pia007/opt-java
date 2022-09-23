import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        // instantiate an array list that stores strings using the List interface
        // ArrayList is the concrete implementation
        // resizing arrays takes O(N)

        // set the capacity of 1D array
        List<String> names = new ArrayList<>(10);

        //insert items - add()
        names.add("Kevin");
        names.add("Erin");
        names.add("Lynn");

        // can use random indexing in 0(1) - if index is known
        // System.out.println(names.get(0));

        //insert item into a given index - O(N)
        names.add(0, "Mark");

        //remove item at index 0 - O(N)
        names.remove(0);

        //contains() - is item present in the array - boolean, O(N)
        System.out.println(names.contains("Mark"));

        // forEach loop - can be done bc of the Iterable interface
        for (String s: names) {
            System.out.println(s);
        }

        // toArray() - returns array containing all items
        Object[] o = names.toArray();
        for (Object t: o) {
            System.out.println(t);
        }

    }

        // ARRAYLIST (ARRAYS) ARE FAST IF MANIPULATING THE LAST ITEM

}
