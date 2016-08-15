package com.company;

/**
 * Created by jamesrondina on 6/28/16.
 */
public class Card {
    private String mNameOnCard;
    private String mCardBrand;

    public Card(String name, String brand) {
        mNameOnCard = name;
        mCardBrand = brand;
    }

    public Card() {
        mNameOnCard = "John Doe";
        mCardBrand = "Visa";
    }

    public String getName(){
        return mNameOnCard;
    }

    public String getBrand() {
        return mCardBrand;
    }

}
