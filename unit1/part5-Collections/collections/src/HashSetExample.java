import java.util.HashSet;
import java.util.Set;


public class HashSetExample {
    public static void main(String[] args) {

        //instantiate new set by implementing HashSet from the Set Interface
        // 1D array
        // initial capacity = 16 by default
        // no order
        // no duplicates
        // hashCode() transforms the input into an array index
        Set<String> set1 = new HashSet();

        set1.add("Adam");
        set1.add("Luke");
        set1.add("Sal");
        set1.add("Mary");
        set1.add("Anna");

        Set<String> set2 = new HashSet();

        set2.add("Mike");
        set2.add("Sal");
        set2.add("Larry");
        set2.add("Russ");
        set2.add("Anna");


        // retainAll() - retains only elements from set that are present in set2
        // set1.retainAll(set2);

        // remove()
        // set2.remove("Mike");
        // removeAll() - removes the items that are the i s1 and s2 from s1
        set1.removeAll(set2);

        for(String s1 : set1 )
            System.out.println(s1);

        for(String s2 : set2 )
            System.out.println("\n" + s2);
    }
}
