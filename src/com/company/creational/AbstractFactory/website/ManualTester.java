package com.company.creational.AbstractFactory.website;

import com.company.creational.AbstractFactory.Tester;

public class ManualTester implements Tester  {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
