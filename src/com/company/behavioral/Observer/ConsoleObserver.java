package com.company.behavioral.Observer;

public class ConsoleObserver implements Observer {

    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("The Weather has changed. Temperature " +temp + " Pressure = " + presser);
    }
}
