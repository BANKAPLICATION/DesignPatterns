package com.company.behavioral.Visitor;

public class HooliganVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("started the engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knocked on the case");
    }
}
