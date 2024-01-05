package org.launchcode;

public class Main {

            public static void main(String[] args) {
                CD myCd = new CD("My CD", 700, "Music", "CD");
                DVD myDvd = new DVD("My DVD", 4700, "Movies", "DVD");

                myCd.spinDisc();
                System.out.println(myCd.toString());

                myDvd.spinDisc();
                myDvd.toString();
            }
        }


        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
