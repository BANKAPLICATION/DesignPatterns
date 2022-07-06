package com.company.creational.Prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "Source sourcecode = new SourceCode()");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("------------");
        System.out.println(masterClone);
    }
}
