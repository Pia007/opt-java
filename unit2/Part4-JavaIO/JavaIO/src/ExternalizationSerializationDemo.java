import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

// create an class that implements Externalizable

class CarExternal implements Externalizable {

    // fields
    String name;
    String color;

    // constructor with no-arg
    public CarExternal() {
    }

    // constructor
    public CarExternal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // implement to custom serialization and deserialization methods

    // Write object
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        // define the logic of writing
        out.writeObject(name);
        out.writeObject(color);
    }

    // Read object
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // define the logic of reading
        name = (String) in.readObject();
        color = (String) in.readObject();
    }
}


public class ExternalizationSerializationDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // create car object
        CarExternal car = new CarExternal("Audi", "Green");


        // serialize the car object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car4.txt"));
        oos.writeObject(car);

        // deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car4.txt"));
        CarExternal car2 = (CarExternal) ois.readObject();


        System.out.println(car2.name);
        System.out.println(car2.color);

    }

}

// Externalization Serialization
    // Serialization
        // java object is written to a stream and saved in a file
        // all is done by JVM
    // Externilization
        // defining custom serialization and deserialization logic
        // an interface
        // methods
            // writeExternal() - saves all the contents of the object to the file
                // save primitive values to the file
                    // writeInt(), writeByte(), writeBoolean()..etc
                // save object values to the file - Strings, Arrays..etc
                    // writeObject()
            // readExternal() - read data from the stream to that object
                // read primitive values from the file
                    // readInt(), readByte(), readBoolean()..etc
                // read object values from the file - Strings, Arrays..etc
                    // readObject()

// Serialization vs Externalization
    // process handling
        // Serialization - JVM
        // Externalization - programmer
    // object saving
        // Serialization - default saves entire object
        // Externalization - programmer defines what to save
    // control
        // Serialization - no control
        // Externalization - programmer has control
    // implementation
        // Serialization - implements Serializable from java.io
        // Externalization - implements Externalizable from java.io
    // methods
        // Serialization - no methods
        // Externalization - writeExternal() and readExternal()
    // constructor
        // Serialization - public no arg constructor is NOT required
        // Externalization - no-arg constructor, otherwise throws InvalidClassException
