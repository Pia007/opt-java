public class GenericMethod {

    //methods

    // public <T> void showItem(T item) {
    public <T> T showItem(T item) {
        System.out.println("The item is: " + item.toString());
        return item;
    }

    // 1D array of generic items
    public <T> void showItems(T[] items) {
        for (T item: items) {
            System.out.println(item);
        }
    }

    // multiple parameters
    public <T, V> void printItems(T t, V v) {
        System.out.println("The t item is: " + t.toString());
        System.out.println("The v item is: " + v.toString());
    }

}

