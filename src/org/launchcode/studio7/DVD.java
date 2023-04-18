package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends Disk implements OpticalInterface {

    String director;

    public DVD(String name, double capacity, ArrayList<String> contents, String aDirector){
        super(name, capacity, contents);
        this.director = aDirector;

    }

    @Override
    public void spinDisc() {
        System.out.println("This DVD is spinning.");
    }

    @Override
    public void storeData() {
        System.out.println("The data is stored on the DVD.");

    }

    @Override
    public void writeData() {
        System.out.println("The data has been written to the DVD.");
    }

    @Override
    public void readData() {
        System.out.println("Reading the DVD's data now...");
    }

    @Override
    public void reportData() {

    }

    @Override
    public void stopSpinning() {

    }

    @Override
    public void deleteData() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
