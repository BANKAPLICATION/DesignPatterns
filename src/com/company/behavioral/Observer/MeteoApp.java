package com.company.behavioral.Observer;

public class MeteoApp {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.addObserver(new ConsoleObserver());
        station.setMeasurements(25, 760);
    }
}
