package academy.learnprogramming.bubblesort;

public class Main {

    public static void main(String[] args) {

        // 2: create the array
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22, -33, 25, 78 };

        /* 3: implement the Bubble Sort algo
            Outer loop: set the entire array as the unsorted partition, as long as its > 0, decrease the unsorted partition index by 1
                the index will decrement from 6 to 0
                each iteration of the outer loop will traverse the array and the inner loop will bubble the largest value from the unsorted partition to the sorted partition
                Inner Loop: set i to 0 and as long as the last index of the unsorted partition is greater than i, incr i by 1
                   then compare the value of i with the value of i + 1
                        call the swap method - pass in the array, i and j
        */
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        // 4: Print the sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    /* 1: swap method takes 3 args - array and the indices to swap*/
    public static void swap(int[] array, int i, int j) {

        // if i = j, then do nothing
        if (i == j) {
            return;
        }

        // if i not equal to j then swap elements
            // create temp int variable and assign it to the value of i
            // swap --> assign the value of i to the value of j
            // assign value of j to the temp value which is i
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
