package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Disk {
//name, capacity, contents, disc type
    //the fields that I want every class to have are put in the abstract
    String name;

    double capacity;
    ArrayList<String> contents;


    String diskType = String.valueOf(this.getClass());


    public Disk(String name, double capacity, ArrayList<String> contents){
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
    }

//    @Override
//    public String toString() {
//        return "Disk{" +
//                "name='" + name + '\'' +
//                ", capacity=" + capacity +
//                ", contents=" + contents +
//                ", diskType='" + diskType + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        System.out.println("Name: " + this.name + "Class: " + this.diskType);
        return null;
    }

}
