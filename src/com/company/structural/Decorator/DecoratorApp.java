package com.company.structural.Decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(new Printer("hello"));
        printer.print();
    }
}
