package com.company;

/**
 * Created by jamesrondina on 6/29/16.
 */
public abstract class Remote {

    protected boolean needsBatteries;
    protected boolean supportsUsb;

    public Remote(boolean batteries, boolean usb) {
        needsBatteries = batteries;
        supportsUsb = usb;

    }

    public boolean isNeedsBatteries() {
        return needsBatteries;
    }

    public void setNeedsBatteries(boolean needsBatteries) {
        this.needsBatteries = needsBatteries;
    }

    public boolean isSupportsUsb() {
        return supportsUsb;
    }

    public void setSupportsUsb(boolean supportsUsb) {
        this.supportsUsb = supportsUsb;
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed() {
        System.out.println("The Power Button was pressed");
    }

    public void numberButtonPressed(int button) {
        System.out.println("Changing channel to " + button);
    }
}
