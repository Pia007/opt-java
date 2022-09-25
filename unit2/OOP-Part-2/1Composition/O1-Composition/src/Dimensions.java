package com.timbuchalka;

/**
 * Created by dev on 8/3/15.
 */
public class Dimensions {

    //fields
    private int width;
    private int height;
    private int depth;

    //constructor
    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
