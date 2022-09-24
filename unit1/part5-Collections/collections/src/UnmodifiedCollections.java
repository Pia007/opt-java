import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiedCollections {
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

        // now cannot remove index 0 -
        nums = Collections.unmodifiableList(nums);

        modify(nums); // will get unsupported operation exception

        System.out.println(nums);

    }

    public static void modify(List<Integer> list) {
        list.remove(0);
    }
}
