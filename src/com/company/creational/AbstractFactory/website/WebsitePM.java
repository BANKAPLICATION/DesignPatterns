package com.company.creational.AbstractFactory.website;

import com.company.creational.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
