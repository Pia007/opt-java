package academy.learnprogramming.linkedlists;

public class EmployeeLinkedList {

    // fields
    private EmployeeNode head;
    private int size;

    // add items to the list
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        // assign the head to the new node's next node ref
        node.setNext(head);

        // set the head to the new node
        head = node;
        size++;
    }


    // remove a node
    public EmployeeNode removeFromFront() {
        // check if its empy
        if (isEmpty()) {
            return null;
        }

        // otherwise
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    // get the size
    public int getSize() {
        return size;
    }

    // check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // add a method to print the list
    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");

        // travers the list unit current hit null
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
