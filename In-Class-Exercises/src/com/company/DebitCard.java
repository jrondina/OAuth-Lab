package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class DebitCard extends Card{
    private double mAccountBalance;

    public DebitCard(double balance) {
        mAccountBalance = balance;
    }

    public DebitCard(){
        mAccountBalance = 0.0;
    }

    public double getBalance() {
        return mAccountBalance;
    }

}
