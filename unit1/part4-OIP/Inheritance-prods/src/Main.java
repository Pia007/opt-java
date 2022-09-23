import models.Discountable;
import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";
    public static void main(String[] args) {

        Shirt shirt = new Shirt(Shirt.Size.XL,5.99, "blue", "Java Vuitton" );
        Pants pants = new Pants(32, 21.99, "black", "Java Klein");
        Shirt shirt2 = new Shirt(shirt);
        // change back to Pants bc pants can be discountable but not all discountable are pants
        Pants pants2 = new Pants(pants);
        // create another pants obj to test if compareTo() worked
        Pants pants3 = new Pants(36, 99.99, "acid gray", "True Religion");

        // compare pants3 vs pants
        System.out.println(pants.compareTo(pants2));

        pants.discount();
    }
}


