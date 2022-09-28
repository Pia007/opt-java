import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// create a car class that implements Serialization
class Car implements Serializable {

    // fields
    String name;
    String color;

    // constructor
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
}



public class SerializationDeserializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // create a car object
        Car car = new Car("BMW", "Black");

        // serialization
            // create an output stream object using the FileInputStream class
            // pass in file name where the serialized car object will be stored
            // create the object output stream
            // use writeObject() method to write the car object to the file
        // FileOutputStream fos = new FileOutputStream("car.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.txt"));
        oos.writeObject(car);
        // Note: run the progam, file will be created but contents will be unreadable

        // deserialization
            // create an input stream object using the FileInputStream class
            // pass in file name where the serialized car object is stored
            // create the object input stream
            // create a new car obj and use readObject() method to read the car object from the file
        // FileInputStream fis = new FileInputStream("car.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.txt"));
        Car car2 = (Car) ois.readObject();

        // check that the car object was deserialized correctly
        System.out.println(car2.name);
        System.out.println(car2.color);
    }

}

// Serialization
    // process of converting a java object into a stream so that it can be written into files
        // any file on filesystem operating system
    //interfaces
        // Serializable interface
        // must be implemented by a class in order be serializable
        // is a mockup interface - does not have any methods
        // just informs any process that wants to serialize an object that this is a serialized object
    // classes
        // Write data to the output stream
            // ObjectInputStream
            // FileInputStream
        // deserializing
            // FileOutputStream
            // ObjectOutputStream

// Deserialization
    // process of converting a stream into a java object
        // any file on filesystem operating system
