package com.company;

/**
 * Created by jamesrondina on 6/29/16.
 */
public class Sharp extends Remote implements Waterproof, Rechargeable, Universal{

    public Sharp(boolean batteries, boolean usb) {
        super(batteries, usb);
    }

    @Override
    public void channelUp() {
        System.out.println("Sharp changed the channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Sharp changed the channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Sharp changed the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sharp changed the volume down");

    }


    @Override
    public boolean isRechargeable() {
        System.out.println("The Sharp remote is not rechargeable!");
        return false;
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote supports all TVs, not just Sharp!");
    }

    @Override
    public boolean isWaterproof() {
        System.out.println("This Sharp remote is not waterproof!");
        return false;
    }
}
