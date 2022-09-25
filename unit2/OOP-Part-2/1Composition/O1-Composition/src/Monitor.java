package com.timbuchalka;

/**
 * Created by dev on 8/3/15.
 */
public class Monitor {

    //fields
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;   // Resolution is a class


    //constructor
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    // methods
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    // getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}


// Resolution class has to be created
// good example of composition
// this class is part of the monitor class
// but monitor is not a resolution
