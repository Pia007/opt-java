import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // lower bounded wildcard
    // Java will not know what items will be in the list
    // must use the Object class, parent of every class
    // public static void showAll(List<? super Number> list) {
    //     for (Number n : list)
    //         System.out.println(n);
    // }

    // must use the Object class, parent of every class
    public static void showAll(List<? super Number> list) {
        for (Object num : list)
            System.out.println(num);
    }



    public static void main(String[] args) throws Exception {

        //
        List<? super Integer> listOne = new ArrayList<Integer>();
        List<? super Integer> listTwo = new ArrayList<Number>(); // integer extends number class
        List<? super Integer> listThree = new ArrayList<Object>(); // integer is an Object, parent child relationship

        // read using lower bound wildcard
        List<Serializable> listFour = new ArrayList<Serializable>();  // check to see what implements serializable interface
        listFour.add("Hello");
        listFour.add("World");
        listFour.add("!");
        showAll(listFour);

        // insert into list using lower bound wildcard
        List<? super Number> listFive = new ArrayList<>();
        listFive.add(1);
        listFive.add(2.0);
        listFive.add(3.0f);
        showAll(listFive);
    }
}



// Lower bounded wildcard
    // want to use wildcards with parent classes(supertypes)
        // used when you want to insert items into a generic data structure or collection
        // super keyword ex) printAll(List<? super T>)
            // the method can accept the list of any super class of T
    // adding an item when using an lower bounded wildcard
        // ex) addItem(List<? super Integer>)
            // can add Numbers or even Objects bc Number and Object are superclasses of Integer
    // reading items from a lower bounded wildcard related list
        // can only read Objects exclusively but CANNOT read lists
        // ex) readItems(List<? super T>)
            // cannot guarantee which list it is pointing to
// Upper v Lower bounded wildcard
    // upper can read and lower can write