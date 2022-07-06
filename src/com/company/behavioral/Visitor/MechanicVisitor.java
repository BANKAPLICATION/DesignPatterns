package com.company.behavioral.Visitor;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked the engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("polished the body");
    }
}
