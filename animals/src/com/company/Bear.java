package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Bear extends Mammal{
    private String mFurColor;

    public Bear(String color, int legs, int topSpeed, boolean endangered, String name, String blooded) {
        super(blooded, legs, topSpeed, endangered, name);
        mFurColor = color;
    }


    public String getFurColor() {
        return mFurColor;
    }

    public void setFurColor(String furColor) {
        this.mFurColor = furColor;
    }
}
