package com.company;

public class Main {

    public static void main(String[] args) {


        Bear aGrizzly = new Bear("Brown", 4, 15, false, "Grizzly", "Warm");
        Snake aBoa = new Snake(30, true, 0, 5, false, "Boa");


        System.out.println("Some Animals");
        System.out.println("Name: " + aGrizzly.getName() + " blood type: " + aGrizzly.getBlooded() + " Fur color: " +
                aGrizzly.getFurColor() + " Number of legs: " + aGrizzly.getLegs() + " Speed: " + aGrizzly.getSpeed() +
                " Endangered?: " + aGrizzly.getIsEndangered());
        System.out.println("Name: " + aBoa.getName() + " Lays Eggs?: " + aBoa.getLaysEggs() + " Length: " + aBoa.getLength()
                + " Speed: " + aBoa.getSpeed() + " Number of legs: " + aBoa.getLegs() + " Endangered?: " + aBoa.getIsEndangered());



    }
}
