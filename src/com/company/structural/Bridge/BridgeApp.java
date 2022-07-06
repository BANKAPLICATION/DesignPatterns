package com.company.structural.Bridge;

public class BridgeApp {

    public static void main(String[] args) {
        Car car = new Sedan(new Mercedes());
        car.showDetails();
    }
}
