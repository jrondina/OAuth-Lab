package com.company;

public class Main {

    public static void main(String[] args) {
        Card aCard = new CreditCard(2000);
        Card aSecondCard = new DebitCard(7000);

        System.out.println("Cardholder: " + aCard.getName());
        System.out.println("Brand: " + aCard.getBrand());
        System.out.println("Limit: " + ((CreditCard)aCard).getLimit());

        System.out.println("");

        System.out.println("Cardholder: " + aSecondCard.getName());
        System.out.println("Brand: " + aSecondCard.getBrand());
        System.out.println("Balance: " + ((DebitCard)aSecondCard).getBalance());


    }

}
