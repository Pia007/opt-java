public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }

    // add getters

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    //override the equals() method for the Person
//    public boolean equals(Object obj) {
//        System.out.println("Hi");
//        return false;
//    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        // if it is typecast the obj to person
        Person person = (Person)obj;
        // then compare the fields to the current obj that call this method to the one that's being passed in
        return this.age == person.getAge() && this.name.equals(person.getName());

    }
}
