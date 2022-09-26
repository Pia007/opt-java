public class Parrot extends Bird {

    // constructor
    public Parrot(String name) {
        super(name);
    }

    // overriding the abstract methods - make the class concrete and valid
    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
