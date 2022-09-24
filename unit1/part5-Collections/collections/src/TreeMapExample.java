import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        // Java uses red-black tree map
        // if want order descending - use Comparator
        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());

        map.put(10, "ten");
        map.put(3, "three");
        map.put(5, "five");
        map.put(1, "one");
        map.put(8, "eight");

//        TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
//
//        map.put("Adam", 26);
//        map.put("Kevin", 15);
//        map.put("Anna", 75);
//        map.put("Kia", 30);
//        map.put("Marty", 42);

        // get smallest item -lastKey() is method of the TreeMap interface -- change Map
        // note that the order is reversed
        System.out.println("Smallest key: " + map.lastKey());
        System.out.println("Larges key: " + map.firstKey());

        // will print in key ascending order
        // using the comparator - print in descending order
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
