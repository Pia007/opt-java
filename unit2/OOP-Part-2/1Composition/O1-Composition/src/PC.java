package com.timbuchalka;

/**
 * Created by keanehubertang on 8/3/15.
 */
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

    // getters
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

// PC is comprised of the Case, Monitor and Motherboard classes
// it has a case, monitor and motherboard
// did not use the extends keyword
// Why? In Java can only inherit from one class at a time
// PC is
//
