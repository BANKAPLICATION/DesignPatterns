package com.company.creational.Builder;

public class BuilderApp {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildMake("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();
        System.out.println(car);
    }
}
