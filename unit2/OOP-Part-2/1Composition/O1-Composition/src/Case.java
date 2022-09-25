package com.timbuchalka;

/**
 * Created by dev on 8/3/15.
 */
public class Case {
    //fields
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;  // Dimensions is a class

    //constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    // methods
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    //getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}


// Dimensions class has to be created
// good example of composition
// this class is part of the case class
// but case is not a dimensions
