package com.company.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {
    User admin;
    List<User> users = new ArrayList<>();

    public TextChat() {
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public TextChat(User admin, List<User> users) {
        this.admin = admin;
        this.users = users;
    }

    public void addUser(User u) {
        if(admin == null) throw new RuntimeException("There is no admin");
        if(u instanceof Admin) users.add(u);
        else {
            throw new RuntimeException("Admin can not pass in other chat");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if(user instanceof Admin) {
            for(User u: users) {
                if(u != user && u.isEnable) {
                    u.getMessage(user.getName() + " " + message);
                }
                if(admin.isEnable()) {
                    admin.getMessage(user.getName() + " : " + message);
                }
            }
        }
    }

}
