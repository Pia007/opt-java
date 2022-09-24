import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassMethods {
    public static void main(String[] args) {

        //create List for demo
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(10);
        nums.add(12);
        nums.add(7);
        nums.add(3);
        nums.add(8);
        nums.add(20);

        // reverse order
        // Collections.reverse(nums);

        // min and max
        System.out.println(Collections.min(nums));
        System.out.println(Collections.max(nums));

        // shuffle
        // bogo sort - random permutations of the underlying array
        // Collections.shuffle(nums);

        // shifts 2
        // Collections.rotate(nums, 2);

        //replace items with val 1 changes to 10
        Collections.replaceAll(nums, 1, 10);

        System.out.println(nums);

    }
}
