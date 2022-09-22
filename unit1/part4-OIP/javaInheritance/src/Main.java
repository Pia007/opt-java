public class Main {
    public static void main(String[] args) {
        // print anew object of the person class
        Person person = new Person("Mary", 35);
        Person person2 = new Person(person);

        // overriding toString()
        System.out.println(person.toString());
    }
}