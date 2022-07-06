package com.company.behavioral.Mediator;

public class MediatorApp {
    public static void main(String[] args) {
        TextChat chat = new TextChat();
        User admin = new Admin(chat, "Jok, joker");
        User u1 = new SimpleUser(chat, "Max");
        User u2 = new SimpleUser(chat, "Vova");
        User u3 = new SimpleUser(chat, "Sasha");
        u2.setEnable(false);
        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);
        admin.sendMessage("hello");

    }
}
