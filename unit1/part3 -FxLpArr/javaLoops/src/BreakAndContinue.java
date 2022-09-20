package src;// continue skips a single run and continues to the next one
// break stops the loop

public class BreakAndContinue {
    public static void main(String[] args) {
        for( int i = 0; i <= 10; i++) {
            //continue skips every run that has an odd number
            // break stops the code from executing as soon as it gets to an odd number
            if ( i % 2 != 0) {
                // continue;
                break;
            }
            System.out.println(i);
        }
    }
}
