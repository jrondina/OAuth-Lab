package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        addMessage("Test");
        viewMessage();

    }

    public static void addMessage(String words) {
        Singleton singleton = Singleton.getInstance();
        singleton.setMyMessage(words);
    }

    public static void viewMessage() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getMyMessage());
    }

}
