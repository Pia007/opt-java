package academy.learnprogramming.linkedstack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

    // field
    private LinkedList<Employee> stack;

    // constructor
    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    // add to head of the list
    public void push(Employee employee) {
        stack.push(employee);
    }

    // remove from head of the list
    public Employee pop() {
        return stack.pop();
    }

    // access the head of the list
    public Employee peek() {
        return stack.peek();
    }

    // check if its empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();

        // print the stack as long as the iterator has an item after it
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
