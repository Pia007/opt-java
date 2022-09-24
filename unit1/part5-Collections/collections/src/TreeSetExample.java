import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetExample {
    public static void main(String[] args) {

        //instantiate new set by implementing TreeSet from the Set Interface
        // maintain order
        // ascending
        // order is reverse if using the Comparator

        SortedSet<Integer> set1 = new TreeSet<>();

        set1.add(12);
        set1.add(18);
        set1.add(20);
        set1.add(3);
        set1.add(6);
        set1.add(36);
        set1.add(99);

        //subset uses SortedSet Interface - if range 1 to 55
        Set<Integer> subSet = set1.subSet(1, 55);

        // subset of all items >= 20
        Set<Integer> subSet2 = set1.tailSet(20);

        // smaller of items < 20
        Set<Integer> subSet3 = set1.headSet(20);


        System.out.println(set1.first()); // smallest
        System.out.println(set1.last()); // largest


        for(Integer sb3: subSet3 )
            System.out.println(sb3);
    }
}
