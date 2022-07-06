package com.company.structural.Decorator;

public class QuotesDecorator implements PrinterInterface {
    PrinterInterface component;

    public QuotesDecorator(PrinterInterface component) {
        this.component = component;
    }

    @Override
    public void print() {
        System.out.println("/");
        component.print();
        System.out.println("\"");
    }
}
