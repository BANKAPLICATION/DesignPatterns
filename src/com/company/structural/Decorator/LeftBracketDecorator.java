package com.company.structural.Decorator;

public class LeftBracketDecorator implements PrinterInterface {
    PrinterInterface component;

    public LeftBracketDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.println("\"");
        component.print();
        System.out.println("\"");
    }
}
