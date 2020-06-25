package com.design.patterns.structurals.bridge;

//Segundo nivel de jerarquia, con implementacion del envio de mensaje
public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Sending text message...");
    }
}
