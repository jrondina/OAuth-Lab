package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class CreditCard extends Card {
    private double mCardLimit;

    public CreditCard(double limit) {
        mCardLimit = limit;

    }

    public CreditCard() {
        mCardLimit = 100.0;
    }

    public double getLimit() {
        return mCardLimit;
    }
}
