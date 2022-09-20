// must import Arrays inorder to print the whole array
import java.util.Arrays;


public class UpdateArrays {
    public static void main(String[] args) {
        String[] menu = { "Expresso", "Ice Coffee", "Macchiato"};

        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        //cannot resize an array, have to create a new array
        // create an array that can hold 5 elements
        String[] newMenu = new String[5];

        for(int i = 0; i < menu.length; i++) {
            // copy each element from menu into newMenu
            newMenu[i] = menu[i];
            System.out.println(i + ". " + newMenu[i]);
        }

        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";

        System.out.println(Arrays.toString(newMenu));
    }
}
