public class Main {
    public static void main(String[] args) throws Exception {

        // instantiate a new DeskPhone object
        // ITelephone boringPhone = new ITelephone(); // cannot instantiate an interface
        ITelephone boringPhone;
        boringPhone = new DeskPhone(1234567890);
        boringPhone.powerOn();
        boringPhone.callPhone(1234567890);
        boringPhone.answer();

        // instantiate a new MobilePhone object

        boringPhone = new MobilePhone(987654321);
        boringPhone.powerOn();
        boringPhone.callPhone(987654321);
        boringPhone.answer();
    }
}

//Interfaces
// methods that a particular class must implement
// Abstract methods - actual code goes in the class that is created
// used to provide common behavior that can be used by several classes
//How? - by implementing the same interface