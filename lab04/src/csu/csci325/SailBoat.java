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
public class SailBoat extends Boat {
    
    private int mPassengers;
    
    //constructor 
    public SailBoat(String n, int y, int p) {
        super(n, y);
        mPassengers = p;
    }
    
    //methods

    public int getPassengers() {
        return mPassengers;
    }

    public void setPassengers(int p) {
        mPassengers = p;
    }
    
    @Override
    public String toString() {
        return String.format("SailBoat Name: " + mName + 
                              "\nMaximum passengers: " + mPassengers);
    }
    
    
    
}
