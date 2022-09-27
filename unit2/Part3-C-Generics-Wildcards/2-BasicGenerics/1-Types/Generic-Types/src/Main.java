class Store<T> {
    //fields
    // must have same type
    private T item;

    // methods
    // must use type T
    public void setItem(T item) {
        this.item = item;
    }

    // must use type T
    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        // instantiate store class
        // now we can use any type
        Store<String> store = new Store<>();
        store.setItem("Hello");  // string

        String item = store.getItem();
        System.out.println(item);


        // instantiate store2 class
        Store<Integer> store2 = new Store<>();
        store2.setItem(123);  // int

        int item2 = store2.getItem();
        System.out.println(item2);


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

    // to fix this we can use generics
        // use the diamond operator <>
            // ex) usually use capital T
                // can use any letter or word
    // fields and methods must use the same type
    // instantiating the object
        // Java will require the type
        // raw type - Store store = new Store();
        // can use any type when instantiating
        // when passing in a value to a method
            // compile time error
    // when generics are use, Java is really using Object super class