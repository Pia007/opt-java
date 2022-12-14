package academy.learnprogramming.recursion;

public class Main {

    public static void main(String[] args) {

        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!

    // n! = n *(n - 1)!

    // Factorial with recursion
    public static int recursiveFactorial(int num) {

        // need to account for 0 otherwise stack over flow exception
        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    // Factorial without using recursion
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }
}

/*
 Recursive method calls itself


 */
