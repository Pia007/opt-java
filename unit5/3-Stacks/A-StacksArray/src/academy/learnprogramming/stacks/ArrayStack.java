package academy.learnprogramming.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    // fields
    private Employee[] stack;
    private int top;

    // constructor
    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    // add to top
    public void push(Employee employee) {
        if (top == stack.length) {    // if full, resize it thus O(n) - worst case
            // need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        // O(1)
        stack[top++] = employee;
    }

    // remove top item
        // pop() worst case is O(n) if size is not an issue
    public Employee pop() {
        if (isEmpty()) {   // if empty throw an exception
            throw new EmptyStackException();
        }

        // pop the employee, decrement the top and assign the employee at top -1, next available position on the stack
        Employee employee = stack[--top];
        // top index to null
        stack[top] = null;
        return employee;
    }

    // access the employee at the top of the stack
        // always O(1)
    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1]; // return top item, top is the nxt item in the stack, thus top - 1 is the top item
    }

    // get size of Stack
    public int size() {
        return top;
    }

    // check if the stack is empty
    public boolean isEmpty() {
        return top == 0;
    }

    // print the items in the stack
    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
