package com.company.creational.FactoryMethod;

public class DigitalWatchMaker implements WatchMaker {

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
