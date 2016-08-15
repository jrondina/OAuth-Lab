package com.company;

/**
 * Created by jamesrondina on 6/27/16.
 */
public class IceCream {

    String mFlavor;
    double mPrice;
    String mSize;
    boolean mMelted;


    public IceCream(String flavor, double price, String size, boolean melted) {

    }

    public String getFlavor(){
        return mFlavor;
    }
    public void setFlavor(String flavor) {
        mFlavor = flavor;
    }

    public double getPrice(){
        return mPrice;
    }
    public void setPrice(double price) {
        mPrice = price;
    }

    public String getSize() {
        return mSize;
    }
    public void setSize(String size) {
        mSize = size;
    }

    public boolean getMelted() {
        return mMelted;
    }
    public void setMelted(boolean melted) {
        mMelted = melted;
    }

    public static void main(String[] args) {
        IceCream chocolate = new IceCream("chocolate", 1.00, "large", false);
        IceCream vanilla = new IceCream("vanilla", 1.25, "small", false);
        IceCream strawberry = new IceCream(("strawberry", 1.50, "small", false))
    }
}
