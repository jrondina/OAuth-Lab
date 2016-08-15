package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Reptile extends Animal{
    private boolean mLaysEggs;

    public Reptile(boolean eggs, int legs, int topSpeed, boolean endangered, String name) {
        super(legs, topSpeed, endangered, name);
        mLaysEggs = eggs;
    }

    //public Reptile() {

    //    mLaysEggs = true;
    //}

    public boolean getLaysEggs() {
        return mLaysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.mLaysEggs = laysEggs;
    }
}
