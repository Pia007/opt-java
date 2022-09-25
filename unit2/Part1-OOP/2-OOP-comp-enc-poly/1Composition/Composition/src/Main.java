public class Main {
    public static void main(String[] args) throws Exception {

        // instantiate a new Dimensions, Case, Monitor, Motherboard and PC object
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "HewLett Packard", "240", new Dimensions(20, 20, 5));   // creating a new Dimensions object inside the Case object

        Monitor theMonitor = new Monitor("27inch UHD", "ASUS", 27, new Resolution(2540, 1440));  // creating a new Resolution object inside the Monitor object

        Motherboard theMotherboard = new Motherboard("MEG Z490", "MSi", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}

// Part 2 - Composition
// refactor the PC to use powerUp() and drawLogo() methods
// remove other methods that were removed from the PC class