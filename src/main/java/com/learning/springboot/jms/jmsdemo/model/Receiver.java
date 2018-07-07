package com.learning.springboot.jms.jmsdemo.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by genil on 7/7/18 at 16 02
 **/
@Component
public class Receiver {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receivedMessage(Email email) {
        logger.info("Received email "+email);
    }

    @JmsListener(destination = "sms")
    public void receivedSms(SMS sms) {
        logger.info("Received short message "+sms);
    }
}
