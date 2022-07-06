package com.company.behavioral.Mediator;

public class Admin extends User {

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    void getMessage(String message) {
        System.out.println("Administrator " + getName() + " getting a message " + message);
    }
}
