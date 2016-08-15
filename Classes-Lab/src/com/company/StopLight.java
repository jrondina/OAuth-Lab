package com.company;

import java.util.Scanner;

/**
 * Created by jamesrondina on 6/27/16.
 */
public class StopLight {
    String mLightColor;

    public StopLight(String color){
        mLightColor = color;
    }

    public boolean isRed() {
        System.out.println("The light is red!");
        return mLightColor == "red";
    }

    public boolean isYellow() {
        System.out.println("The light is yellow!");
        return mLightColor == "yellow";
    }

    public boolean isGreen() {
        System.out.println("The light is green!");
        return mLightColor == "green";
    }

    public void setLightColor(String color) {
        //Scanner inputColor = new Scanner(System.in);
        //System.out.println("Input a stoplight color:");
        //color = inputColor.nextLine();

        if (color.toLowerCase() == "red") {
            mLightColor = "red";
        }
        else if (color.toLowerCase() == "yellow") {
            mLightColor = "yellow";
        }
        else if (color.toLowerCase() == "green") {
            mLightColor = "green";
        }
        else {
            System.out.println("Invalid input, please enter 'red', 'yellow', or 'green'!");
        }
    }

}
