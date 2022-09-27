public class Main {
    public static void main(String[] args) throws Exception {

        // instantiate GenericMethod class
        GenericMethod gm = new GenericMethod();

        // works with any type
        gm.showItem("hello");
        gm.showItem("Q");
        gm.showItem(35);
        gm.showItem(3.14);

        // now that we have a return statement in the GenericMethod class
        System.out.println("Item is returned: " + gm.showItem(321.75));
    }
}