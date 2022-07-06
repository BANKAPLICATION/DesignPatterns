package com.company.creational.AbstractFactory.website;

import com.company.creational.AbstractFactory.Developer;
import com.company.creational.AbstractFactory.ProjectManager;
import com.company.creational.AbstractFactory.ProjectTeamFactory;
import com.company.creational.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
