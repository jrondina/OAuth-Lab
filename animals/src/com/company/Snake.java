package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Snake extends Reptile{
    private double mLength;

    public Snake(double length, boolean eggs, int legs, int topSpeed, boolean endangered, String name) {
        super(eggs, legs, topSpeed, endangered, name);
        mLength = length;
    }

    public double getLength() {
        return mLength;
    }

    public void setLength(double length) {
        this.mLength = length;
    }
}
