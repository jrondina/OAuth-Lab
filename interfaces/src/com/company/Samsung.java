package com.company;

/**
 * Created by jamesrondina on 6/29/16.
 */
public class Samsung extends Remote implements Waterproof, Rechargeable, Universal{

    public Samsung(boolean batteries, boolean usb) {
        super(batteries, usb);
    }

    @Override
    public void channelUp() {
        System.out.println("Samsung changed the channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Samsung changed the channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Samsung changed the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Samsung changed the volume down");

    }


    @Override
    public boolean isRechargeable() {
        System.out.println("The Samsung remote is not rechargeable!");
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote only supports Samsung TVs");
    }

    @Override
    public boolean isWaterproof() {
        System.out.println("This Samsung remote is waterproof!");
        return true;
    }
}
