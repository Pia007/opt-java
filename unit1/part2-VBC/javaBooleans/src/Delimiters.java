import java.util.Scanner;

public class Delimiters {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers (on the same line)");
        String numbers = scan.nextLine();
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();

        System.out.println("Enter two very big integers (on the same line)");
        String bigNumbers = scan.nextLine();
//        long bigNum1 = scan.nextLong();
//        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line)");
        String decimals = scan.nextLine();
//        double decimal1 = scan.nextDouble();
//        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String words = scan.nextLine();
//        String text1 = scan.next();
//        String text2 = scan.next();

        scan.close();

//        System.out.println("\tIntegers are: " + num1 + " and " + num2);
//        System.out.println("\tBig Integers are: " + bigNum1 + " and " + bigNum2);
//        System.out.println("\tDecimals are: " + decimal1 + " and " + decimal2);
//        System.out.println("\tWords are: " + text1+ " and " + text2);

        System.out.println("\tIntegers are: " + numbers);
        System.out.println("\tBig Integers are: " + bigNumbers);
        System.out.println("\tDecimals are: " + decimals);
        System.out.println("\tWords are: " + words);
    }
}

// Scanner uses the delimiter pattern to read data
// delimiter separates user input
// white space by default
// ex separated by white space, will take 3 scan.nextInt() to pick them up
// 20 30 50
// scan.nextInt();
// scan.nextInt();
// scan.nextInt();
// methods delimited by whitespace
// scan.nextInt();
// scan.nextLong();
// scan.nextDouble();
// scan.next()


//scan.nextLine() - reads the entire line including the whitespace
   // do not use it before or after any method that follows the delimiter pattern it will pick up all of the whitespace
        // 24
        // scan.nextInt() - will grab the int,
        // scan.nextLine() - will grab all whitespace after it....thus, displaying space in the console
 // this will work
    // int num = scan.nextInt();
    // scan.nextLine();
    // String sentence = scan.nextLine();
    //How? Add a throwaway nextLine() before your real next line
    // 25 gets picked up by scan.nextInt()
    // scan.nextLine() picks up all of the remaining line which is whitespace
    // scan.nextLine() picks up the sentence
