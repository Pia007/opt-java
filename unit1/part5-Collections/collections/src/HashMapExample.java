import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        //instantiate a hashMap - implements Map interface
            // does NOT implement List, Queue, or Sets; thus not a Collection or Iterable
        // key-value pairs
        // 1D array under the hood, load factor 0.75 for Java (will resize)
        //does not keep items in a sorted order
        Map<Integer, String> map = new HashMap<>();

        // insert into map O(1) if no collision (key, value), can use null as keys
        map.put(1, "Adam");
        map.put(2, "Jack");
        map.put(31, "Mike");
        map.put(4, "Paul");
        map.put(null, "this is null");

        //remove items
        map.remove(2);

        // retrieve passed on keys O(1) get(key)
        // System.out.println(map.get(null));

        // use the keys to get all values, keySet()
        for(Integer key: map.keySet()) {
            System.out.println(map.get(key));
        }

        //
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
