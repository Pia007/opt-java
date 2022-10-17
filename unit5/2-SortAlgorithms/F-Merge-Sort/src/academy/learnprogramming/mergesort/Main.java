package academy.learnprogramming.mergesort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    // { 20, 35, -15, 7, 55, 1, -22 }

    // calls itself recursively
    public static void mergeSort(int[] input, int start, int end) {

        // break out of recursion when there is a 1 element array
        if (end - start < 2) {
            return;
        }

        // partitioning
        int mid = (start + end) / 2;
        mergeSort(input, start, mid);  // merge sort on left partition
        mergeSort(input, mid, end);    // merge sort on right partition
        merge(input, start, mid, end);  // now merge the left and right partitions, which are already sorted
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    // merging step
    public static void merge(int[] input, int start, int mid, int end) {

        // if last element in the left partition is <= first element in the right partition just return
            // bc the result of the merge will equal the input array
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        // otherwise merge
        int i = start;
        int j = mid;
        int tempIndex = 0;

        // temp array - large enough to hold both partitions
        int[] temp = new int[end - start];

        // step through both array
            // comparing index i of the left array to index j of the right array
                // then write the smallest one into the position in the temp array

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // if there are elements left over in the right partition it means they are greater than
            // those that have been copied
            // their positions will not change in the input array
        // elements left over in the left partition must be copied over into the input array

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}

/*
    MERGE SORT:
        a. divide and conquer algo
            - splits the array into smaller arrays
        b: recursive algo although loops can be used
        c: two phases
            1. splitting - prep phase to make sorting faster,
                - logical, no new arrays created
                - indices are used to track where the arrays are split
                How?
                    - left array
                        - split into left and right array
                        - repeat splitting until all arrays have one item each
                    - right array
                        - split into left and right array
                        - repeat until all arrays have one item each
            2. merging - sorting occurs
                - merge every left - right pair into a sorted array
                - continue until there is only one array

      example) { 20, 35, -15, 7, 55, 1, -22 }, for this implementation the extra element will ---> right array
      a. start index = 0
      b. end = array.length, which is 7 Note: end index is always last i + 1
      c. midpoint = ( start + end ) / 2 = 3
      e. initial split
        1.left array - start = 0, end = 3, items 0 to 2,
            3. left array - item 0
            4. right array - start = 1, end 3, midpoint = (1+3)/2 = 2 (which is index 1 + 1), items 1 and 2
                7. left array - item 1
                8. right array - item 2
        2.right array - start = 3, end = 7, midpoint = ( 3 + 7)/2 = 5 (which is index 4 + 1), items 3 to 6, has extra element
            5. left array - start = 3, end = 5, midpoint = (3+5)/2 = 4(which is index 3 + 1), items 3 and 4
                9. left array - item 3
                10. right array - item 4
            6. right array - start = 5, end = 7, midpoint = (5 + 7)/2 = 6 (which is index 5 + 1), item 5 and 6
                11. left array - item 5
                12. right array - item 6
      f. merging - sibling arrays get merged, starting from the last split
         1.   - create a temp array large enough to hold all the elements
              - set i t the first index of the left array, and k to the first index of the right array
              - compare left[i] to right[j]
                -- if left is smaller, copy it to the temp array and increment i by 1
                -- if fight is smaller, copy it to the temp array and increment j by 1
         2. Repeat process until all elements in the 2 arrays have been processed
               -- at which point the temp array contains the merges values in sorted order
               -- then copy the temp array back into the original input array, at the correct positions
               -- if the left array is at positions x to y, and the right array is at positions y +1 to z after the copy
                    positions x to z will be sorted in the original array
    Performance
      -- not an in-place algo
      -- O(nlogn) - base 2. repeatedly dividing the array in half during the splitting phase
      -- stable algo
*/
