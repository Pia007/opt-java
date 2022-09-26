public class Penguin extends Bird {

    // constructor
    public Penguin(String name) {
        super(name);
    }

    // overriding the abstract methods - make the class concrete and valid
    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
