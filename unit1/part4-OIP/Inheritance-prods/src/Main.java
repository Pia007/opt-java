import models.Pants;
import models.Product;
import models.Shirt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static final String FILE_NAME = "src/products.txt";
    public static void main(String[] args) {
        try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length ; i++) {
                System.out.println(products[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    /**
     * Function Name: getData
     * @return Product []
     * @throws FileNotFoundException
     *
     * Inside the function:
     *  1. Loads the data from the products.txt
     */

    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scan = new Scanner(fis);

        // product.txt has 18 rows, need array to store 18 objs

        Product[] products = new Product[18];

        for (int i = 0; scan.hasNextLine(); i++) {
            // first piece of data states what the obj is
            switch (scan.next()) {
                case "PANTS": products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next()); break;
                case "SHIRT": products[i] = new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(), scan.next());
            }
        }
        scan.close();
        return products;
    }
}


