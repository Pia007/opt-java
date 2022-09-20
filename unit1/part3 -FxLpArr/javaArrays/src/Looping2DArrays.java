package src;

public class Looping2DArrays {
    public static void main(String[] args) {
        int[][] grades = {
                {72, 74, 78, 76},
                {62, 64, 68, 66},
                {92, 94, 98, 96}
        };

        for (int i = 0; i < grades.length; i++) {

             switch (i) {
                 case 0: System.out.print("\tHarry: "); break;
                 case 1:System.out.print("\tRome: "); break;
                 case 2: System.out.print("\tHermione: "); break;
             }

             for (int k = 0; k < grades[i].length; k++) {
                // print every value at row 0
                 System.out.print(grades[i][k] + " ");
             }
             System.out.println("\n");
       }
    }
}