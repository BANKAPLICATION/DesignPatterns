package com.company.structural.Facade;

public class HDD {
    void copyFromDVD(DVDRom dvd) {
        if(dvd.hasData()) {
            System.out.println("Data is being copied from the disk");
        }
        else {
            System.out.println("Insert the data disk");
        }
    }
}
