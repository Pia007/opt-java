package academy.learnprogramming.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    // rather than inc back to 5 wrap it to the front
        // front will be the end of the array
        // back will start filling up the beginning of the array
    public void add(Employee employee) {
        // check if ths
        if (size() == queue.length - 1) {
            // get the current size for use later
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];

            /* resizing the array req unwrapping the queue
               copy the elements from the front of the queue to the back of the array
               into the front of the resized array
               then add the remaining elements in the queue to the end
               After resizing, the front will be reset to 0 and the back will be the size
               because that will be the next available position
             */

            // copy the elements from the front to the end of the array
            System.arraycopy(queue, front, newArray, 0, queue.length - front);

            // copy into the new array, starting at the position of the items that were added
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;   // set front pointer to 0
            back = numItems;  // set the back pointer to the size
        }

        // 0   jane
        // 1    john
        // 2  -   -back
        // 3  -mike - front
        // 4   -bill

        // After resizing
        // 0 mike
        // 1 bill
        // 2 jane
        // 3 john
        // 4 - back
        // 5
        // 9

        // only incr if back < length - 1
        queue[back] = employee;
        if (back < queue.length - 1) {
            back++;
        }
        else {    // otherwise wrap it
            back = 0;
        }
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        else if (front == queue.length) {   // if still items in the queue, then wrap front to the beginning
            front = 0;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    // adjust to account for possibility of front being wrapped
    public int size() {
        if (front <= back) {
            return back - front;
        }
        else {
            return back - front + queue.length;
        }

    }

    // adjust to account for the possibility of the front being wrapped
    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {   // if wrapped, print in 2 pieces
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
