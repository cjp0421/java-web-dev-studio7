package org.launchcode.studio7;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        CD cd1 = new CD("Wave of Mutilation",24, new ArrayList<>(),"Pixies");
        // TODO: Declare and initialize a CD and a DVD object.
        System.out.println(cd1);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        DVD movie1 = new DVD("Hot Fuzz", 95,new ArrayList<>(),"D. Irector");
        System.out.println(movie1);
        cd1.spinDisc();
        cd1.storeData();
        System.out.println(cd1.getBandname());
        movie1.spinDisc();
        movie1.contents.add("This is added data.");
        movie1.contents.add("This is more added data.");
        cd1.contents.add("Hey");
        for (String content : movie1.contents) {
            System.out.println(content);
        }
        for (String content : cd1.contents) {
            System.out.println(content);
        }
        cd1.readData();
        cd1.toString();

    }
}
