package org.launchcode;

public class CD extends BaseDisc {
    private String spinSpeedRange = "200 - 500 rpm";

    public CD(String name, int capacity, String contents, String discType) {
        super(name, capacity, contents, discType);
    }


    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of " + spinSpeedRange + ".");
    }
    public void playMusic() {
        System.out.println("Playing music from the CD.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
