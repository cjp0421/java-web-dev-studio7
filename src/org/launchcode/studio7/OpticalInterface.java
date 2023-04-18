package org.launchcode.studio7;

public interface OpticalInterface {
    //spin, store, write, read, report, stop, delete
    //does not have to be the same in the class that implements it
    void spinDisc();
    void storeData();
    void writeData();
    void readData();
    void reportData();
    void stopSpinning();
    void deleteData();
}
