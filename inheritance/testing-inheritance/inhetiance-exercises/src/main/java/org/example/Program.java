package org.example;


public class Program {
    public static void main(String[] args) {
        // Creating instances and testing methods
        Laptop myLaptop = new Laptop("Dell", "Inspiron", 2022, 15.6);
        SmartPhone myPhone = new SmartPhone("Samsung", "Galaxy S21", 2022, "Android");
        Laptop myOtherLaptop = new Laptop("HP", "Pavillion", 2021, 17.0);

        System.out.println("Laptop ID: " + myLaptop.getId());
        myLaptop.displayInfo();
        myLaptop.start();
        myLaptop.connectWiFi();

        System.out.println("\nSmartPhone ID: " + myPhone.getId());
        myPhone.displayInfo();
        myPhone.start();
        myPhone.makeCall();

        System.out.println("\nLaptop ID: " + myOtherLaptop.getId());
        myOtherLaptop.displayInfo();
        myOtherLaptop.start();
        myOtherLaptop.connectWiFi();
    }
}
