package academy.learnprogramming.queues;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        // create the queue, will print in order added
        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        //queue.printQueue();

        // dequeue 2 employees - removes Jane and John, fist and second added
        queue.remove();
        queue.remove();
        // queue.printQueue();

        System.out.println(queue.peek());  // Mary
        queue.remove();
        queue.remove();
        queue.remove();
        //queue.remove();   // error, no more employees in queue

        queue.add(mikeWilson);


        queue.printQueue();

    }
}
