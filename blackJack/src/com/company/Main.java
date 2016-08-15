package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(blackJack(0, 1));

    }

    static int blackJack(int a, int b) {
        if (a > 21) {
            if (b > 21) {
                return 0;
            }
            if (b <= 21) {
                return b;
            }
        }
        if (a <= 21) {
            if ((b > a && b <= 21)) {
                return b;
            }
            else {
                return a;
            }
        }
        return 0;
    }


}
