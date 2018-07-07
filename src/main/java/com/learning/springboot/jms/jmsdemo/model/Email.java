package com.learning.springboot.jms.jmsdemo.model;

/**
 * Created by genil on 7/7/18 at 16 01
 **/
public class Email {
    public Email() {

    }

    private String to;

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Email(String to, String body) {
        this.to = to;
        this.body = body;
    }

    private String body;

}
