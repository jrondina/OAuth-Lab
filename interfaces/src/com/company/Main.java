package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Remote> remotes = new ArrayList<>();
        remotes.add(new Samsung(true, false));
        remotes.add(new Sony(false, true));
        remotes.add(new Sharp(false, false));

        for (Remote remote : remotes)  {
            remote.numberButtonPressed(7);
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();
            remote.powerButtonPressed();

        }
    }
}
