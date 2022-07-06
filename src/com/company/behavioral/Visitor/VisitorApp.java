package com.company.behavioral.Visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hooligan = new HooliganVisitor();

        body.accept(hooligan);
        engine.accept(hooligan);

    }
}
