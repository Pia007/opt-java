public class PC {
    //fields
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    //constructor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // methods
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}

// Part 2
// Hide the functionality so that the calling program cannot access the fields directly
// make the getters private
// create function public void power
// create function private void drawLogo
// this function will be called by the powerUp function
// decrease code complexity
// remove the getters and access the fields directly