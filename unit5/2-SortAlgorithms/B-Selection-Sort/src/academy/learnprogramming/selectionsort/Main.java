package academy.learnprogramming.selectionsort;

public class Main {

    public static void main(String[] args) {

        //2 create an array
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22, 17, 32, -100 };

        // 3
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {

            // initialize largest index to 0
            int largest = 0;

            // 4. travers the unsorted partition and look for the largest element
                // if the element at index i is greater than the largest
                    // set the largest to index i
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            // 5 call the swap()
            swap(intArray, largest, lastUnsortedIndex);

        }

        // 6 print the sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    // 1. swap method
    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}


/*
    SELECTION SORT: Divides array into sorted and unsorted partitions
        -- traverse the array and looks for the largest element in the unsorted partition
            -- swaps it with the last element in the unsorted partition placing the largest in its correct sorted position
        -- 20, 35, -15, 7, 55, 1, -22
            - last unsorted index is 6 bc entire array is unsorted
            - index 0 will start as the largest index, incr i by 1
            - compare 20 v 35, 35 > 20 ---> largest index is now 1, incr i by 1
            - 35 vs -15 ---> largest is still index 1, incr i by 1
            - 35 vs 7 ---> largest still index 1, incr i by 1
            - 35 vs 55 ---> largest in now index 4, incr i by 1
            - 55 vs 1 ---> still index 4, incr i by 1
            - 55 vs -22 ---> still index 4, i is equal to the last unsorted index thus 1st traversal of the array is complete
            - Now swap largest(55) with the last(-22), -22 is now at index 4 and 55 at index 6
                now the unsorted partition is 5 and the sorted is at index 6
            -- Repeat the process until the entire array is sorted
        performance
            -- in place algo
            -- O(n^2) - quadratic
                - 100 steps to sort 10 items, 10,000 steps to sore 100 items, 1,000,000 steps to sort 1000 items
            -- doesn't require as mich swapping as bubble sort
            -- unstable algo

*/
