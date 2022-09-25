public interface ITelephone {

    // interface methods are always public
    // interface methods are always abstract
    // do need to use public or abstract keywords
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();

}

// create an interface to define the behavior of a telephone
// if class is going to implement an interface, it must implement all of the methods in the interface

