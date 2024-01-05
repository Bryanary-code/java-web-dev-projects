package org.launchcode;

public class DVD extends BaseDisc {
    private String spinSpeedRange = "570 - 1600 rpm";

    public DVD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of " + spinSpeedRange + ".");
    }

    public void playMovie() {
        System.out.println("Playing movie from the DVD.");
    }
}

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

