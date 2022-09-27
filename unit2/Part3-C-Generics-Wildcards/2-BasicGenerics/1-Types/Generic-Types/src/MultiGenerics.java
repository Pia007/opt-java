class HashTable<K, V> {

    // fields
    private K key;
    private V value;

    // constructor
    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // methods
    // override toString()
    @Override
    public String toString() {
        return "HashTable [key = " + key + ", value = " + value + "]";
    }

}


public class MultiGenerics {
    public static void main(String[] args) throws Exception {

        // instantiate HashTable
        HashTable<String, Integer> hashTable = new HashTable<>("Hello", 123);
        System.out.println(hashTable);

    }
}
