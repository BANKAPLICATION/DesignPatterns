package com.company.structural.Bridge;

public abstract class Car {
    Make make;
    public Car(Make m){
        make = m;
    }
    abstract void showType();

    void showDetails() {
        showType();
        make.setMake();
    }
}
