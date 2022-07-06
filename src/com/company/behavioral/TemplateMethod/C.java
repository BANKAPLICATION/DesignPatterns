package com.company.behavioral.TemplateMethod;

class TemplateApp {
    public static void main(String[] args) {
        C a = new A();
        a.templateMethod();
        System.out.println();
        C b = new B();
        b.templateMethod();
    }
}

public abstract class C {
    void templateMethod() {
        System.out.print("1");
        differ();
        System.out.print("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();

}
class A extends C {
    void differ() {
        System.out.print('2');
    }
    @Override
    void differ2() {
        System.out.print("5");
    }
}
class B extends C {
    void differ() {
        System.out.print("4");
    }

    @Override
    void differ2() {

    }

}

