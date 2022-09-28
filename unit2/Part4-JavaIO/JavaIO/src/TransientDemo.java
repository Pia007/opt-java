import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// create a car class that implements Serialization

class Car1 implements Serializable {

    // fields
    // add transient keyword to fields that you don't want to be serialized
    String name;
    transient String color;

    // constructor
    public Car1(String name, String color) {
        this.name = name;
        this.color = color;
    }
}




public class TransientDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //create car object
        Car1 carNew = new Car1("Porsche", "Red");

        // serialize the car object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("carNew.txt"));
        oos.writeObject(carNew);

        // deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("carNew.txt"));
        Car1 carNew2 = (Car1) ois.readObject();

        System.out.println(carNew2.name);
        System.out.println(carNew2.color);  // will be null bc it was transient
    }
}


// Transient keyword
// only be used with variables
// might want to serialize an object but not all of its fields
// defines a field that you do not want to be serialized
// in deserialization, the transient variable is initialized with default value based on data type

