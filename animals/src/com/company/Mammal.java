package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Mammal extends Animal{
    private String mBlooded;



    public Mammal(String blooded, int legs, int topSpeed, boolean endangered, String name) {
        super(legs, topSpeed, endangered, name);
        mBlooded = blooded;
    }

    //public Mammal(int legs, int topSpeed, boolean endangered, String name, String blooded) {
    //    mBlooded = "warm";
    //}

    public String getBlooded() {
        return mBlooded;
    }

    public void setBlooded(String blood) {
        this.mBlooded = blood;
    }
}
