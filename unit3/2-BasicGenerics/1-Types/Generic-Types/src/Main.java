class Store {
    //fields
    private Object item;

    // methods
    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {


        // instantiate store class
        Store store = new Store();
        store.setItem(45.5);  // double

        // can cast Object into any other object
        int item = (int) store.getItem();
        System.out.println(item);

    }
}


// Generic types
// if wanted to make the item a double
// would have to cast it as a double
// but we have it casted as an int
// there are no errors until we try to run the program
// thus Runtime error - which we do not want
// this is bc generics where not uses
// Java must test the type casting at runtime