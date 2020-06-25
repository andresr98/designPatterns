package com.design.patterns.structurals.bridge;

//Primer nivel de jerarquia con implementacion del tipo de mensaje
// Note que es una implementacion concreta

public class EmailMessage extends Message {

    public EmailMessage (MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }


}
