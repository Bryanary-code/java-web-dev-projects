package org.example;

public class Computer extends AbstractEntity {

    private String brand;
    private String model;
    private int year;

    public Computer(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start() {
        System.out.println("Computer is starting.");
    }

    public void shutDown() {
        System.out.println("Computer is shutting down.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}
