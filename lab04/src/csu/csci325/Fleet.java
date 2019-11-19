/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;

/**
 *
 * @author jeanieherold
 */
public class Fleet {
    
    private ArrayList<Boat> mFleet;
    
    //constructor
    public Fleet() {
        mFleet = new ArrayList();
    }
    
    //methods

    public ArrayList<Boat> getFleet() {
        return mFleet;
    }

    public void addBoat(Boat b) {
        mFleet.add(b);
    }
    
    public Boat getBoat(String name, int year) {
        Boat b = new Boat();
        for (int i = 0; i < mFleet.size(); i++) {
            if(mFleet.get(i).getName().equals(name) && mFleet.get(i).getYearBuilt() == year) {
                b = mFleet.get(i);
                break;
            }
        }
        
        return b; 
    }
    
    public void removeBoat(String name, int year) {
        for (int i = 0; i < mFleet.size(); i++) {
            if(mFleet.get(i).getName().equals(name) && mFleet.get(i).getYearBuilt() == year) {
                mFleet.remove(i);
                break;
            }
        }
        
        
    }
    
    
}
