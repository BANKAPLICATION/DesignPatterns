package com.company.creational.AbstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
