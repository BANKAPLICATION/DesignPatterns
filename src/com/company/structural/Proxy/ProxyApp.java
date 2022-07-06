package com.company.structural.Proxy;

public class ProxyApp {
    public static void main(String[] args) {

//        Image image = new RealImage("D:/images/my.jpg");
//        image.display();


        //that's like lazy initialization it provides all need things when it needed
        Image image2 = new ProxyImage("D:/images/my.jpg");
//        image2.display();

    }
}
