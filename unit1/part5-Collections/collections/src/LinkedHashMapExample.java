import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        //Doubly-Linked List connects the inserted items
        // need more memory
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("aaa", 1);
        map.put("bbb", 2);
        map.put("ccc", 3);
        map.put("ddd", 4);
        map.put("eee", 5);
        map.put("fff", 6);
        map.put("ggg", 7);
        map.put("hhh", 8);
        map.put("iii", 9);
        map.put("jjj", 10);
        map.put("kkk", 11);

        // order of insertion is preserved
        for(String key: map.keySet())
            System.out.println(key + " - " + map.get(key));
    }
}
