import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";
    public static void main(String[] args) {

        //access the enum directly from the class
        Shirt shirt = new Shirt(Shirt.Size.XL,5.99, "blue", "Java Vuitton" );
        Pants pants = new Pants(32, 21.99, "black", "Java Klein");
        Shirt shirt2 = new Shirt(shirt);
        Pants pants2 = new Pants(pants);

        //print a shirt to see the enum
        System.out.println(shirt2);
        System.out.println(pants2);

        // test fold() override
        shirt.fold();
        pants.fold();
    }

}


