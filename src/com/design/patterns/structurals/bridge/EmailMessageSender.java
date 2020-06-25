package com.design.patterns.structurals.bridge;

//Segundo nivel de jerarquia, con implementacion del envio de mensaje
public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Sending email message...");
    }
}
