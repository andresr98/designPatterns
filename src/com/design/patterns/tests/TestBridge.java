package com.design.patterns.tests;

import com.design.patterns.structurals.bridge.*;

public class TestBridge implements ITestPattern {


    @Override
    public void test() {
        System.out.println("Usando el patrón Bridge\n");
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender=new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
