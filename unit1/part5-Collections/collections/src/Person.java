import java.util.HashMap;
import java.util.Map;

// HashCode and Equals Example
public class Person {

    // fields
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //hashCode = hash-fx
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name !=null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    //toString
    @Override
    public String toString() {
        return "Person [" + "name='" + name + ", age=" + age + ']';
    }
}
