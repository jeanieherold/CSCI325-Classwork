/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

/**
 *
 * @author jeanieherold
 */
public class Boat {
    
    //fields
    String mName;
    int mYear;
    
    //constructor
    public Boat(String n, int y) {
        mName = n;
        mYear = y;
    }
    public Boat() {
        
    }
    
    //methods
    public String getName() {
        return mName;
    }

    public void setName(String n) {
        this.mName = n;
    }

    public int getYearBuilt() {
        return mYear;
    }

    public void setYearBuilt(int y) {
        this.mYear = y;
    }
    
    @Override
    public String toString() {
        return String.format("Boat Name: " + mName +
                "\nYear built: " + mYear);
    }
    
    
}
