package com.company.behavioral.Mediator;

public abstract class User {
    Chat chat;
    String name;
    boolean isEnable = true;

    public User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
    abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
