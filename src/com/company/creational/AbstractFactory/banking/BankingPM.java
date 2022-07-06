package com.company.creational.AbstractFactory.banking;

import com.company.creational.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager  {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
