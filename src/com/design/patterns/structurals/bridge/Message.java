package com.design.patterns.structurals.bridge;

//Primer nivel de jerarquia, clase base que habla con el cliente
public abstract class Message {

    MessageSender messageSender;

    public Message (MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
