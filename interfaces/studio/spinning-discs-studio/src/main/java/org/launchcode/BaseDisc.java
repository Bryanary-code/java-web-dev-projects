package org.launchcode;

public abstract class BaseDisc implements OpticalDisc {
    protected String name;
    protected int capacity;
    protected String contents;
    protected String discType;

    public BaseDisc(String name, int capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Capacity: " + capacity + " MB\n" +
                "Contents: " + contents + "\n" +
                "Disc Type: " + discType;
    }
    public void writeData(String data) {
        System.out.println("Writing data: " + data);
    }

    public void readData() {
        System.out.println("Reading data...");
    }
}
