package com.company.creational.AbstractFactory.website;

import com.company.creational.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
