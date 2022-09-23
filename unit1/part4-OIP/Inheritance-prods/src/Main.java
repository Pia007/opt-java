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
        // declare pants type Discountable
        Discountable pants2 = new Pants(pants);

        // test interface discount() override
        pants2.discount();
    }

}


