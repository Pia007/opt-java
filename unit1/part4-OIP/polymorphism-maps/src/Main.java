import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Book, String> books = new LinkedHashMap<Book, String>();
        books.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");



        // print the HashMap to see the random order
        printMap(books);
        //convert to a keySet,then array and grab obj at index 2
        System.out.println("\n\n" + books.keySet().toArray()[2]);
    }

    public static void printMap(Map<Book, String> map) {
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
    }
}