public class WholeNumbers {
    public static void main(String[] args) {

        // int variable type stores whole numbers
        // 4 bytes o memory
        // have a range of -2,147,483,648 to 2,147,483,647 for storage

        int numberOfFans = 5000;
        System.out.println("There are " + numberOfFans + " fans.");

        // long variable type stores whole numbers that reach up to 9 quintillion
        // 8 bytes of memory
        // have a range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 for storage
        // add L at the end of the variable name to signify that it is a long variable
        long globalPopulation = 7000000000L;
        System.out.println("There are " + globalPopulation + " people on earth.");

        long dailyGoogleSeaches = 50000000000L;
        System.out.println("There are " + dailyGoogleSeaches + " Google searches per day.");
    }
}
