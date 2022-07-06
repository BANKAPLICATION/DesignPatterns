package com.company.creational.AbstractFactory.banking;

import com.company.creational.AbstractFactory.Developer;

public class JavaDeveloper implements Developer  {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
