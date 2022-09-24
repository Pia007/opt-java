import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {
    public static void main(String[] args) {

        //create List for demo
        // runs without synchronizedList, added for clarity
        // intrinsic lock insures that no two threads are executing the method at the same time
        List<Integer> nums = Collections.synchronizedList(new ArrayList<>());

        // instantiate a new thread with a new runnable
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    nums.add(i);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    nums.add(i);
                }
            }
        });

        //start the threads
        t1.start();
        t2.start();


        // wait for threads to finish executing
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of array: " + nums.size());

    }

    public static void modify(List<Integer> list) {
        list.remove(0);
    }
}
