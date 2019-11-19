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
public class Phone {
    
    //fields
    private String mType;
    private String mNumber;
    
    //constructors
    public Phone(String type, String number) {
        mType = type;
        mNumber = number;
    }
    
    //constructor for setting type only
    public Phone(String type) {
        mType = type;
    }
    
    //no args constructor
    public Phone() {
        mType = "";
        mNumber = "";
    }
    
    
    //methods
    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }
    
    //method overloading
    public boolean isOnCall(String number, boolean video) {
        if (number == mNumber && video == true) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isOnCall(String number) {
        if (number == mNumber) {
            return true;
        } else {
            return false;
        }
    }
    
    
    public void ringtone () {
        System.out.println("ring ring");
    }
    
    
}
