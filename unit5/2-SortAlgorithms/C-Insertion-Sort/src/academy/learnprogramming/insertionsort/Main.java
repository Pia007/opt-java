package academy.learnprogramming.insertionsort;

public class Main {

    public static void main(String[] args) {

        //1: create the array
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22, 75, -200, 3, 18 };

        /*
         2: Outer loop
            set first unsorted index to 1 bc index 0 is assumed to be the stating sorted partition
            as long as the first unsorted index is less than the array length
            incr the first unsorted index by 1
                set the value of the first unsorted index to a variable called newElement

            initialize i

                inner loop
                    assign the first unsorted index to i
                    as long as i > 0 and the value at the array index i - 1 > than the newElement
                    decr i by 1
                        shift to the right - set the value at array index 1 to the value at array index i - 1
             assign array index i to the value of the new element

        */
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}


/*
 INSERTION SORT: partitions the array into sorted and unsorted partitions
  -- grows the sorted partition from the front of the array
  How?
    1: Starts out with item at index 0 in the sorted partition
        -- since the length of the sorted partition is 1, by default the item is sorted
        -- thus, the first index of the unsorted partition is 1
        -- { 20, 35, -15, 7, 55, 1, -22 }
           -- on ea. iteration , take the 1st item in the unsorted partition and insert it into the sorted partition
                -- at the end of ea iteration the sorted partition has grown by one
           -- compare the value being inserted to the values in the sorted partition from right to left
                -- look for value <= value to insert
        -- 20 is the only sorted item and is in the sorted partition
        -- is 20 <= 35? yes and its already in its sorted position
            -- now 20, 35 are in the sorted partition
        -- is 35 <= -15? no, place -15 at index 1 of sorted partition and shift 35 to the right
        -- is 20 <= -15? no, place -15 at index 0 of sorted partition and shift 20 to the right
            -- -15, 20, 35 are in the sorted partition
        -- is 35 <= 7? yes, place 7 at index 2 of the sorted partition and shift 35 to the right
        -- is 20 <= 7? yes, place 7 at index 1 of the sorted partition and shift 20 to the right
        -- is -15 <= 7? no, 7 remains at index 1 of the sorted partitions
            -- -15, 7, 20, 35
        -- 55 will remain at index 4 and sorted partition will be -15, 7, 20, 35, 55
        -- 1 will be inserted at index 1. 7, 20, 35, 55 are shifted to the right
            and sorted partition will be -15, 1, 7, 20, 35, 55
        -- -22 will be inserted at index 0. -15, 1, 7, 20, 35, 55 will be shifted to the right
            and sorted partition will be -22, -15, 1, 7, 20, 35, 55

  Performance?
    a: in- place algo
    b: O(n^2) - quadratic
    c: it will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1,000,000 steps to sort 1000 items
    d: stable algo
*/
