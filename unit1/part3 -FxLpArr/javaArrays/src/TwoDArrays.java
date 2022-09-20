package src;

import java.util.Arrays;

// array that contains arrays
// when data is a grid or data

// int[][] integers = new int[3][4];
    // 2d array with 3 row with 4 elements in each row

public class TwoDArrays {
    public static void main(String[] args) {
//        int[][] grades = new int[3][4];

        // updating 2D arrays
//        grades[0][0] = 72;
//        grades[0][1] = 74;
//        grades[0][2] = 78;
//        grades[0][3] = 76;
//
//        grades[1][0] = 62;
//        grades[1][1] = 64;
//        grades[1][2] = 68;
//        grades[1][3] = 66;
//
//        grades[2][0] = 95;
//        grades[2][1] = 94;
//        grades[2][2] = 98;
//        grades[2][3] = 96;

        // create the array and define the values all in one line
        int[][] grades = {
                {72, 74, 78, 76},
                {62, 64, 68, 66},
                {92, 94, 98, 96}
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        // accessing grades
        System.out.println("\tHarry: " + grades[0][0] + ", " + grades[0][1] + ", " + grades[0][2] +", " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + ", " + grades[1][1] + ", " + grades[1][2] +", " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + ", " + grades[2][1] + ", " + grades[2][2] +", " + grades[2][3]);
    }
}
