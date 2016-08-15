package com.company;

/**
 * Created by jamesrondina on 6/29/16.
 */
public class Sony extends Remote implements Waterproof, Rechargeable, Universal{

    public Sony(boolean batteries, boolean usb) {
        super(batteries, usb);
    }

    @Override
    public void channelUp() {
        System.out.println("Sony changed the channel up");
    }

    @Override
    public void channelDown() {
        System.out.println("Sony changed the channel down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Sony changed the volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Sony changed the volume down");

    }


    @Override
    public boolean isRechargeable() {
        System.out.println("The Sony remote is rechargeable!");
        return true;
    }

    @Override
    public void supportsBrands() {
        System.out.println("This remote only supports Sony TVs");
    }

    @Override
    public boolean isWaterproof() {
        System.out.println("This Sony remote is not waterproof!");
        return false;
    }
}
