package com.company;

/**
 * Created by jamesrondina on 6/27/16.
 */
public class Car {
    String mColor;
    String mBrand;
    int mTopSpeed;

    public Car(String color, String brand, int topSpeed) {
        mColor = color;
        mBrand = brand;
        mTopSpeed = topSpeed;
    }

    public void go() {
        System.out.println("The " + mBrand + " is going");
    }

    public void slow() {
        System.out.println("The " + mBrand + " is slowing down");
    }

    public void stop() {
        System.out.println("The " + mBrand + " has stopped");
    }

    public String getColor() {
        return mColor;
    }

    public String getBrand() {
        return mBrand;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public void setBrand(String brand) {
        mBrand = brand;
    }

    public void setTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }

}


