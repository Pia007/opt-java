import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";
    public static void main(String[] args) {

        Shirt shirt = new Shirt("SMALL",5.99, "blue", "Java Vuitton" );
        Pants pants = new Pants(32, 21.99, "black", "Java Klein");
        Shirt shirt2 = new Shirt(shirt);
        Pants pants2 = new Pants(pants);

        // use debugger to check
        shirt.equals(shirt2);
        System.out.println(shirt.hashCode());
        System.out.println(shirt2.hashCode());
<<<<<<< HEAD

        pants.equals(pants2);
        System.out.println(pants.hashCode());
        System.out.println(pants2.hashCode());
=======
>>>>>>> 617b675c572cf9250868cda92e4f0f7d5ab64c59
    }
}


