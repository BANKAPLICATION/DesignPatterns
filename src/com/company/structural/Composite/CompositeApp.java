package com.company.structural.Composite;

public class CompositeApp {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape square1 = new Square();

        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape circle1 = new Circle();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();


        composite.addComponent(square);
        composite.addComponent(square1);

        composite1.addComponent(triangle);
        composite1.addComponent(circle);
        composite1.addComponent(circle1);

        composite2.addComponent(composite);
        composite2.addComponent(composite1);

        composite2.draw();

    }
}
