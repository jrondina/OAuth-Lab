package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Mammal extends Animal{
    String mBlooded;

    public Mammal(String blooded) {
        mBlooded = blooded;
    }

    public Mammal() {
        mBlooded = "warm";
    }

    public String getBlooded() {
        return mBlooded;
    }

    public void setBlooded(String blood) {
        this.mBlooded = blood;
    }
}
