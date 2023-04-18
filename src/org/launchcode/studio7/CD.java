package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends Disk implements OpticalInterface {
String bandname;
public CD(String name, double capacity, ArrayList<String> contents, String aBandname){
    super(name, capacity, contents);
    this.bandname = aBandname;

}

    @Override
    public void spinDisc() {
        System.out.println("This CD is spinning.");
    }

    @Override
    public void storeData() {
        System.out.println("The data is stored on the CD.");
    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {
        System.out.println("Name: "+ name + "\n" +
                "Songs: " + contents + "\n" +
                "Band Name: " + bandname);
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

    public String getBandname() {

        return bandname;
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
