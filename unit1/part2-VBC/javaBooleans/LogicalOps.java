public class LogicalOps {
    public static void main(String[] args) {
        // OR -|| true is either is true
        int chem = 99;
        int history = 72;

        if ( chem > 75 || history > 75) {
            System.out.println("You will get a scholarship!");
        } else {
            System.out.println("Sorry you did not get the scholarship");
        }

        // AND = && true if all are true
        if (chem > 75 && history > 75) {
            System.out.println("You will get a scholarship!");
        } else {
            System.out.println("Sorry you did not get the scholarship");
        }
    }
}
