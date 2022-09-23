public class Notes {
}

// HashMap directly implements the Map interface
// LinkedHashMap is a child class of hashMap, which implements the Map interface
// TreeMap implements the sortMap interface, which implements the Map interface

//Map - interface
//HashMap class implements Map
//    public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Clonable, Serializable


// Key Diff
    // HashMap has no order
        // index 2 - cannot predict
    //LinkedHashMap and TreeMap have order

// TreeMap and trees are sorted by compareTo()
    // change HashMap to TreeMap to see the sorted books
    // index 2 - harry potter

// LinkedHashMap entries appear based on insertion order
    // change TreeMap to LinkedHashMap to see the sorted books
    // index 2 - GoT

//When to use a Map - parity between data
    // HashMap if order is not important, best performance
    // TreeMap if want to specify the sort
    // LinkedHashMap if you want to specify insertion order

// polymorphism
    // printMap() expects a map and the HashMap can take the form of map so it can be directly passed in
    // can even declare the type as Map and still define the new Book as a Hash, Tree or LinkedHash Map