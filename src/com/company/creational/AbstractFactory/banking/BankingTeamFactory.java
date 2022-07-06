package com.company.creational.AbstractFactory.banking;

import com.company.creational.AbstractFactory.Developer;
import com.company.creational.AbstractFactory.ProjectManager;
import com.company.creational.AbstractFactory.ProjectTeamFactory;
import com.company.creational.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
