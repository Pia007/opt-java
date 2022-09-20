import java.util.Scanner;
//then set up scanner to receive input from the user. How?
    // scanner variable
        // type Scanner, var name and new Scanner value
    // scanner has methods to get values from the user
        // nextLine() - waits for the user to enter a string
        // nextDouble() - "" a double value
        // nextInt() - "" an integer
// if user puts in the wrong type, the app will crash
// ALWAYS CLOSE THE SCANNER WHEN DONE. WHY?
    //it's a memory leak
    // scan.close()

public class Survey {
    // use Scanner to make apps interactive
        //waits for the user to enter a value into the terminal
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey.");

        int counter = 0;

        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("How much do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you, " + name + ", for answering all " + counter + " questions.");
        System.out.println("Your fast food expenses are " + (foodPrice / coffeePrice) + " times more than your coffee expenses.");
        System.out.println( name + ", weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee.");
        System.out.println( name + ", weekly, you spend $" + (foodAmount * foodPrice) + " on food.");
        scan.close();
    }
}
