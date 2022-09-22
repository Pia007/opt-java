public class Main {
    public static void main(String[] args) {
        // print anew object of the person class
        Person person = new Person("Mary", 35);

        // overriding equals();
        // Person person2 = person;
        // System.out.println(person2 == person);  // true

        Person person2 = new Person(person);   // p2 is a copy of p
        //System.out.println(person2 == person);  false bc p2 now has a new ref that is not the same as p

        // will return false too
        System.out.println(person2.equals(person));
    }
}