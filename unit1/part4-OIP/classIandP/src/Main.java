public class Main {
    public static void main(String[] args) {
        // print anew object of the person class
        Person person = new Person("Mary", 35);
        // Person person2 = person;  will have same hashCode
        Person person2 = new Person(person);  // different hashCodes

        // both have the same hashCode ref
        System.out.println("Equality: " + person2.equals(person));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
    }
}