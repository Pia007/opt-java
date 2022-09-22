import models.Pants;
import models.Shirt;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {
        Shirt shirt = new Shirt("SMALL",5.99, "BLUE", "Java Vuitton" );
        Pants pants = new Pants(32, 21.99, "black", "Java Klein");

        System.out.println(shirt.toString());
        System.out.println(pants.toString());


    }
}