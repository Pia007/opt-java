import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {

        // instantiate a linked list of integers from the List interface
        // can instantiate LinkedList as a LinkedList
        //Doubly-LinkedList implementation,
        // store ref to the first item and the last item
        // each item has a ref to the previous and next item
        // Pro - can manipulate the first and last items, O(1)

        // List<Integer> list = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();



        // O(1)
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(3);

        // is a method of LinkList - will work if
            // LinkedList<Integer> list = new LinkedList<>();
        list.addLast(12);
        list.addFirst(21);
        list.removeFirst();

        System.out.println("Size: " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());

        // for each loop
        for(Integer num : list ) {
            System.out.println(num);
        }
    }
}
