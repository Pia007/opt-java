import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetExample {
    public static void main(String[] args) {

        //instantiate new set by implementing LinkedHashSet from the Set Interface
        // maintain order
        // doubly-linked list - needs more memory
        // no duplicates
        Set<String> set1 = new LinkedHashSet<>();

        set1.add("Adam");
        set1.add("Luke");
        set1.add("Joe");
        set1.add("Mary");
        set1.add("Will");

        Set<String> set2 = new LinkedHashSet<>();

        set2.add("Mike");
        set2.add("Sal");
        set2.add("Larry");
        set2.add("Russ");
        set2.add("Anna");

        for(String s1 : set1 )
            System.out.println(s1);

        for(String s2 : set2 )
            System.out.println("\n" + s2);
    }
}
