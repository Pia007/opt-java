package academy.learnprogramming.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    // fields
    private Employee[] queue;
    private int front;
    private int back;

    // constructor
    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    // enqueue
        // add to back of queue, back element, pts to next available position in the queue, is always at index back -1
    public void add(Employee employee) {
        if (back == queue.length) {  // if full, resize the array by double the size
            Employee[] newArray = new Employee[2 * queue.length];
            // copy the existing items into the new array
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        // assign new employee to back and incr back by 1
        queue[back] = employee;
        back++;
    }

    // dequeue
    public Employee remove() {
        if (size() == 0) {   // if size is 0, throw exception
            throw new NoSuchElementException();
        }

        // select the employee at the front of the queue
        Employee employee = queue[front];
        // null out first position
        queue[front] = null;
        // incr front by 1
        front++;
        // check of queue is empty
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return employee;
    }

    // access the first employee
    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    // get the size of the queue
    public int size() {
        return back - front;
    }

    // print the array from front to back
        // note front may not be 0
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

}
