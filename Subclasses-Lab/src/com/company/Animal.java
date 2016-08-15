package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */

/**
 * Create an Animal class with the following properties set in the constructor: mNumLegs, mTopSpeed, mIsEndangered, mName.
 */
public class Animal {
    int mNumLegs;
    int mTopSpeed;
    boolean mIsEndangered;
    String mName;

    public Animal(int legs, int topSpeed, boolean endangered, String name){
        mNumLegs = legs;
        mTopSpeed = topSpeed;
        mIsEndangered = endangered;
        mName = name;

    }

    public Animal() {

    }

    public int getLegs(){
        return mNumLegs;
    }

    public void setNumLegs(int NumLegs) {
        this.mNumLegs = NumLegs;
    }

    public int getSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int TopSpeed) {
        this.mTopSpeed = TopSpeed;
    }

    public boolean getIsEndangered() {
        return mIsEndangered;
    }

    public void setIsEndangered(boolean mIsEndangered) {
        this.mIsEndangered = mIsEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
