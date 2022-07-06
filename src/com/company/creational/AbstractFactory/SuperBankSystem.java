package com.company.creational.AbstractFactory.website;

import com.company.creational.AbstractFactory.Developer;
import com.company.creational.AbstractFactory.ProjectManager;
import com.company.creational.AbstractFactory.ProjectTeamFactory;
import com.company.creational.AbstractFactory.Tester;
import com.company.creational.AbstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system ");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
