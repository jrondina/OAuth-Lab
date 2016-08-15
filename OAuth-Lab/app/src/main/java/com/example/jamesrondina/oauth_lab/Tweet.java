package com.example.jamesrondina.oauth_lab;

/**
 * Created by jamesrondina on 8/4/16.
 */
public class Tweet {
    String Status;

    public String getDTStamp() {
        return DTStamp;
    }

    public void setDTStamp(String DTStamp) {
        this.DTStamp = DTStamp;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    String DTStamp;
}
