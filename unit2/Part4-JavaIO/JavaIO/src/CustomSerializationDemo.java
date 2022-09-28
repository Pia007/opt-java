import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// create car custom class that implements Serialization

class CarCustom implements Serializable {

    // fields
    String name;
    transient String color;

    // constructor
    public CarCustom(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // implement to custom serialization and deserialization methods

    // Write object
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();

        // customize the writing logic of color
        String colorTemp = "aa" + color;
        oos.writeObject(colorTemp);
    }

    // Read object
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();

        // customize the reading logic of color
        String colorTemp = (String) ois.readObject();
        color = colorTemp.substring(2);
    }

}


public class CustomSerializationDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // create car object
        CarCustom car = new CarCustom("Porsche", "Blue");

        // serialize the car object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car3.txt"));
        oos.writeObject(car);

        // deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car3.txt"));
        CarCustom car2 = (CarCustom) ois.readObject();

        System.out.println(car2.name);
        System.out.println(car2.color);

    }

}

// Custom Serialization
// classes you want to serialize but not a particular field

