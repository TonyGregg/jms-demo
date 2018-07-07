package com.learning.springboot.jms.jmsdemo.model;

/**
 * Created by genil on 7/7/18 at 16 06
 **/
public class SMS {
    private String shortText;
    private String senderNumber;

    @Override
    public String toString() {
        return "SMS{" +
                "shortText='" + shortText + '\'' +
                ", senderNumber='" + senderNumber + '\'' +
                '}';
    }

    public String getShortText() {
        return shortText;
    }

    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public SMS(String shortText, String senderNumber) {
        this.shortText = shortText;
        this.senderNumber = senderNumber;
    }

    public SMS() {
    }
}
