package com.timbuchalka;

public class Main {

    public static void main(String[] args) throws Exception {

        // instantiate a new Dimensions, Case, Monitor, Motherboard and PC object
        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220B", "HewLett Packard", "240", new Dimensions(20, 20, 5));   // creating a new Dimensions object inside the Case object

        Monitor theMonitor = new Monitor("27inch UHD", "ASUS", 27, new Resolution(2540, 1440));  // creating a new Resolution object inside the Monitor object

        Motherboard theMotherboard = new Motherboard("MEG Z490", "MSi", 4, 6, "v2.44");

        // create a PC object
        // passing the Case, Monitor and Motherboard objects into the PC object
        // How to access the Case, Monitor and Motherboard objects from the PC object?
        // use the getters

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");  // accessing the Monitor object from the PC object
        thePC.getMotherboard().loadProgram("Windows 10.0");  // accessing the Motherboard object from the PC object
        thePC.getTheCase().pressPowerButton();  // accessing the Case object from the PC object
    }
}
