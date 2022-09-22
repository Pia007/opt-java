import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        //both of type Product, can be store in an array of type Product that can store Product objects
        Product[] products = new Product[] {
            new Shirt("SMALL",5.99, "BLUE", "Java Vuitton" ),
            new Pants(32, 21.99, "black", "Java Klein"),
        };
    }
}