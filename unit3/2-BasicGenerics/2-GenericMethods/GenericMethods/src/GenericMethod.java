public class GenericMethod {

    //method
    // public <T> void showItem(T item) {
    public <T> T showItem(T item) {
        System.out.println("The item is: " + item.toString());
        return item;
    }

}

// Generic Methods
    // must use diamond operator with the samme generic type
    // if want to return the item, it cannot be void
    // must use the same generic type - replace void with T
        // then use return statement
