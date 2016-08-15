package com.example.jamesrondina.todolist;

/**
 * Created by jamesrondina on 7/7/16.
 */
public class CustomObject {
    String mString;

    public CustomObject() {
        mString = "List Item";
    }

    public CustomObject(String mString) {
        this.mString = mString;
    }

    public String getmString() {
        return mString;
    }

    public void setmString(String mString) {
        this.mString = mString;
    }
}
