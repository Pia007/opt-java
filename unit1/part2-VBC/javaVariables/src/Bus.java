public class Bus {
    public static void main(String[]args) {
        // make a string variable name sentence
        String sentence = "Number of passengers: ";

        // bus starts with 0 passengers
        int passengers = 0;

        // fist stop - picks up 9 passengers
        passengers += 9;
        System.out.println(sentence + passengers);

        // second stop - drops off 5 passengers
        passengers -= 5;
        System.out.println(sentence + passengers);

        // last stop - drops off remaining passengers
        passengers -= passengers;
        System.out.println(sentence + passengers);


        System.out.println("End of shift!");
    }
}
