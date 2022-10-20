package academy.learnprogramming.queues;

public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.remove();
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);

        queue.printQueue();

//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);
//        //queue.printQueue();
////
//        queue.remove();
//        queue.remove();
////        queue.printQueue();
////
////        System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
////        queue.remove();
//////
//        queue.add(mikeWilson);
//////
//////
//        queue.printQueue();


    }
}

/*

Circular Queue

using the empty space at the front of the array by wrapping the back of the queue to the front of the array
 -- front part of the queue will be the end of the array and the back part will start filling up
 -- makes use of empty space and the queue will not need to be resized

* */
