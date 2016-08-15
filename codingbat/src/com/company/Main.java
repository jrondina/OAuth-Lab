package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("gingivitis = ggiinnggiivviittiiss: " + doubleChar("gingivitis"));
        System.out.println("java = jjaavvaa: " + doubleChar("java"));
        System.out.println("I = II");
    }

    public static String doubleChar(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            newString = newString + str.charAt(i) + str.charAt(i);
        }

        return newString;
    }

}
