public class Main {
    public static void main(String[] args) throws Exception {

        // instantiate DenericMethod class
        GenericMethod gm = new GenericMethod();


        // works with any type
        gm.showItem("hello");
        gm.showItem("Q");
        gm.showItem(35);
        gm.showItem(3.14);

        // now that we have a return statement in the GenericMethod class
        System.out.println("Item is returned: " + gm.showItem(321.75));

        // multiple parameters
        gm.printItems("Fun", 5);

        // initialize 1D array of generic items
        // must use Integer bc its an object
        // do not use int bc it is a primitive type - error
        Integer[] nums = {1, 2, 3, 4, 5};
        String[] words = {"hello", "world", "!"};
        gm.showItems(nums);
        gm.showItems(words);
    }
}