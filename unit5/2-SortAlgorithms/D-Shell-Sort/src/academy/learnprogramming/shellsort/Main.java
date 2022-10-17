package academy.learnprogramming.shellsort;

public class Main {

    public static void main(String[] args) {
        // 1. create the array
	    int[] intArray = { 20, 35, -15, 7, 55, 1, -22, -99, 18, -320, 3 };

        /* 2. outer loop
            initialize the gap to array length/2, thus gap = 3, start at 3rd item
            as long as the gap > 0
            divide the gap by 2

            3. inner loop
                init i to gap value
                as long as i < array length
                incr i by 1
                    init a new Element to the value of array index i

                    init j to i value

                4: while loop
                    while J >= gap value and the value at array index j-gap  is > new element
                        set array index j value = array index j - gap
                        subtract the gap from j
            set the value of array index j to the value of the newElement
        */
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {


            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}

/*
    SHELL SORT: variation of Insertion Sort
        -- chooses which element to insert using a gap(interval) of 1
        -- starts out using a larger gap value
            instead of comparing items to their neighbors it compares items that are farther apart
        -- as the algo runs, the gap is reduces
        -- goal is to reduce the amount of shifting required
            -- last gap value is always 1
               -- the equivalent to insertion sort
        -- does some prelim work, using gap values > 1, then becomes insertion sort
        NOTE: How to figure out what to start with and how to reduce it?
            many ways to calculate the gap value, which influences the time complexity

       Approach:
            base the gap on the array's length
            initialize the gap(interval) to array.length/2 until we get to 1, which is insertion sort
            on each iteration, divide the gap value by 2 to get the next gap value
       Example: { 20, 35, -15, 7, 55, 1, -22 }
            the array only has 7 elements, first gap value 7/2...which is 3 and the second is 3/2, which is 1
                this only 2 iterations for the array
            -- i = gap = 3
            -- j = 1 = 3
            newElement = intArray[i]
            compare intArray[j - gap] with newElement

            - starting at index 3(7) bc gap is 3, compare it with item 3 positions away, 20
                is 7 > 20? no, thus assign 20 to position 3,
                next set j = j - 3 which is 0
                now assign the newElement(7) to position 0
            { 7, 35, -15, 20, 55, 1, -22 }
            - next incr i, now i = 4
                is 55 > 35? yes, don't do anything
            { 7, 35, -15, 20, 55, 1, -22 }
            - inc i, now i = 5
                is 1 > -15? yes, don't do anything
            { 7, 35, -15, 20, 55, 1, -22 }
            inc i, now i = 6
                is -22 > 20? no, thus assign 1o to position 6
                set j = j - 3 which is 3
                compare intArray[j -gap], 3-3,  with new element
                is -22 > 7, no thus assign 7 to position 3 and -22 to position 0
            { -22, 35, -15, 7, 55, 1, 20 }
            - next iteration gap is 3/2 = 1...now an insertion sort

    Performance:
     a: in place algo
     b: difficult to nail down the time complexity bc it will depend on the gap. Worst case is O(n^2), but can do better
        but really depends on the gap
     c: does not require as much shifting as insertion sort, thus performs better
     d: unstable algo

     NOTE: CAN IMPROVE BUBBLE SORT USING SHELL SORT AS WELL

* */
