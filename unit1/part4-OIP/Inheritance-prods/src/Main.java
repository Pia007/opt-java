import models.Discountable;
import models.Pants;
import models.Product;
import models.Shirt;

import java.util.Arrays;

public class Main {

    static final String FILE_NAME = "products.txt";
    public static void main(String[] args) {

        Product[] products = new Product[] {
                new Pants(32, 24.59, "Blue", "JAVA KLEIN"),
                new Shirt(Shirt.Size.MEDIUM, 24.29, "Black", "CHANEL"),
                new Pants(34, 24.53, "Red", "JANGLER"),
                new Shirt(Shirt.Size.SMALL, 24.89, "Orange", "GEORGE"),
                new Pants(30, 24.54, "Grey", "FENDI"),
                new Shirt(Shirt.Size.LARGE, 24.49, "Blue", "ECKO"),
                new Pants(30, 24.51, "Red", "VERSACE"),
                new Shirt(Shirt.Size.SMALL, 24.49, "Beige", "ZARA"),
                new Pants(29, 24.53, "Dark", "JANGLER"),
                new Shirt(Shirt.Size.SMALL, 24.79, "Red", "NIKE"),
                new Pants(26, 24.58, "Indigo", "BELSTAFF"),
                new Shirt(Shirt.Size.LARGE, 24.54, "Blue", "ADIDAS"),
                new Pants(34, 24.50, "Red", "JANGLER"),
        };
        // test sort by class then sort by price
        Arrays.sort(products);
        printArray(products);

    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}


