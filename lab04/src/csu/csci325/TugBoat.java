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
public class TugBoat extends Boat {

    private int mCapacity;

    //constructor
    public TugBoat(String n, int y, int t) {
        super(n, y);
        mCapacity = t;
    }

    //methods

    public int getCapacity() {
        return mCapacity;
    }

    public void setCapacity(int t) {
        mCapacity = t;
    }
    
    @Override
    public String toString() {
        return String.format("TugBoat Name: " + mName + 
                              "\nCargo capacity: " + mCapacity + " tons");
    }
    
    
}
