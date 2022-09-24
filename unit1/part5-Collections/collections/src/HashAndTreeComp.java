import java.util.*;

public class HashAndTreeComp {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();

        long now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            map.put(i, i);
        }
        for (int i = 0; i < 500000; i++) {
            map.get(i);
        }

        System.out.println("Time taken for TreeMap: " + (System.currentTimeMillis() - now));

        Map<Integer, Integer> map2 = new HashMap<>();

        now = System.currentTimeMillis();

        for (int i = 0; i < 500000; i++) {
            map2.put(i, i);
        }
        for (int i = 0; i < 500000; i++) {
            map2.get(i);
        }

        System.out.println("Time taken for HashMap: " + (System.currentTimeMillis() - now));
    }
}
