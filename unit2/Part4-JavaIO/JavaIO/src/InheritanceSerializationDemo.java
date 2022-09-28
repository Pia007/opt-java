import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;

// create car inherit class that implements Serialization

class CarInheritance implements Serializable {

    // fields
    String name;
    String color;

    // constructor with no-arg
    // values will be null if CarInheritance does not implement Serializeable, but the child class does
    public CarInheritance() {
    }

    // constructor
    public CarInheritance(String name, String color) {
        this.name = name;
        this.color = color;
    }
}


// create Ferrari child class that inherits from CarInheritance

class Ferrari extends CarInheritance {

    // fields
    int wheels;

    // constructor
    public Ferrari(String name, String color, int wheels) {
        super(name, color);
        this.wheels = wheels;
    }
}


public class InheritanceSerializationDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // create a ferrari object, child class of CarInheritance
        Ferrari ferrari = new Ferrari("Ferrari", "Red", 4);

        // serialize the ferrari object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ferrari.txt"));
        oos.writeObject(ferrari);

        // deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ferrari.txt"));
        Ferrari ferrari2 = (Ferrari) ois.readObject();

        System.out.println(ferrari2.name);
        System.out.println(ferrari2.color);
        System.out.println(ferrari2.wheels);


    }
}

// Serializable Inheritance
// if parent class is serializable, child class is also serializable
// child class can be serialized even if parent class is not serializable
// but parent class fields will not be serialized
// while serializing, jvm creates an object of the parent clss if it;s not Serializable
// thus, the parenet class should have a no-arg constructor
// otherwise, get InvalidClassException if parent class does not have a no-arg constructor
