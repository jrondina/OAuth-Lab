package com.company;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        StopLight aStopLight = new StopLight("green");

        Car aSkyline = new Car("Blue", "Nissan", 156);
        Car aSupra = new Car("Silver", "Toyota", 185);
        Car aRx7 = new Car("White", "Mazda", 160);
        Car aNSX = new Car("Red", "Honda", 168);
        Car a911 = new Car("Black", "Porsche", 205);
        Car aM3 = new Car("Blue", "BMW", 170);
        Car aFiero = new Car("Red", "Pontiac", 125);
        Car aRoadRunner = new Car("Orange", "Plymouth", 148);
        Car aCorvette = new Car("Red", "Chevrolet", 180);
        Car aShelbyCobra = new Car("Blue", "Ford", 172);
        Car aChallenger = new Car("Black", "Dodge", 176);
        Car aCTSV = new Car("Silver", "Cadillac", 170);
        Car aWrangler = new Car("Green", "Jeep", 110);
        Car aDMC12 = new Car("Silver", "DMC", 115);
        Car aMetro = new Car("Blue", "Geo", 60);
        Car a850 = new Car("Yellow", "Volvo", 130);
        Car aC230 = new Car("Red", "Mercedes-Benz", 140);
        Car aViper = new Car("White", "Dodge", 182);
        Car aVanquish = new Car("Green", "Aston Martin", 151);
        Car aBRZ = new Car("Blue", "Subaru", 130);
        Car aR8 = new Car("Silver", "Audi", 200);

        for (int i = 0; i < 10; i++) {


            for (int j = 0; j < 2; j++) {
                switch (j) {
                    case 0:
                        aStopLight.isGreen();
                        aSkyline.go();
                        aSupra.go();
                        aRx7.go();
                        aNSX.go();
                        a911.go();
                        aM3.go();
                        aFiero.go();
                        aRoadRunner.go();
                        aCorvette.go();
                        aShelbyCobra.go();
                        aChallenger.go();
                        aCTSV.go();
                        aWrangler.go();
                        aDMC12.go();
                        aMetro.go();
                        a850.go();
                        aC230.go();
                        aViper.go();
                        aVanquish.go();
                        aBRZ.go();
                        aR8.go();

                    case 1:
                        aStopLight.isYellow();
                        aSkyline.slow();
                        aSupra.slow();
                        aRx7.slow();
                        aNSX.slow();
                        a911.slow();
                        aM3.slow();
                        aFiero.slow();
                        aRoadRunner.slow();
                        aCorvette.slow();
                        aShelbyCobra.slow();
                        aChallenger.slow();
                        aCTSV.slow();
                        aWrangler.slow();
                        aDMC12.slow();
                        aMetro.slow();
                        a850.slow();
                        aC230.slow();
                        aViper.slow();
                        aVanquish.slow();
                        aBRZ.slow();
                        aR8.slow();
                    case 2:
                        aStopLight.isRed();
                        aSkyline.stop();
                        aSupra.stop();
                        aRx7.stop();
                        aNSX.stop();
                        a911.stop();
                        aM3.stop();
                        aFiero.stop();
                        aRoadRunner.stop();
                        aCorvette.stop();
                        aShelbyCobra.stop();
                        aChallenger.stop();
                        aCTSV.stop();
                        aWrangler.stop();
                        aDMC12.stop();
                        aMetro.stop();
                        a850.stop();
                        aC230.stop();
                        aViper.stop();
                        aVanquish.stop();
                        aBRZ.stop();

                        Random outlaw = new Random();
                        if (outlaw.nextBoolean()) {
                            aR8.go();
                        } else {
                            aR8.stop();
                        }
                    default:
                        break;

                }


            }

        }
    }

}
