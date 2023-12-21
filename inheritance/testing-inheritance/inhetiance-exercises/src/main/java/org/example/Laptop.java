package org.example;

public class Laptop extends Computer {

    private double screenSize;

    public Laptop(String brand, String model, int year, double screenSize) {
        super(brand, model, year);
        this.screenSize = screenSize;

    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void connectWiFi () {
        System.out.println("Connecting to Wifi...");
    }
}
