package org.example;

public class SmartPhone extends Computer {

    private String os;

    public SmartPhone (String brand, String model, int year, String os) {
        super(brand, model, year);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void makeCall () {
        System.out.println("Making call....");
    }
}
