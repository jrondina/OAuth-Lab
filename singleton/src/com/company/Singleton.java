package com.company;

/**
 * Created by jamesrondina on 6/29/16.
 */
public class Singleton {

    private static Singleton singleton = null;
    private static String myMessage;

    private Singleton() {
        myMessage = new String();
    }


    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();

        }

        return singleton;
    }

    public static String getMyMessage() {
        return myMessage;
    }

    public static void setMyMessage(String myMessage) {
        Singleton.myMessage = myMessage;
    }
}
