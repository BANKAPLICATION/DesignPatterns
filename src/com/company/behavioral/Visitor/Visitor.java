package com.company.behavioral.Visitor;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
