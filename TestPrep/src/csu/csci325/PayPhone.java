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
public class PayPhone extends Phone {
    
    //fields
    private double mCost;
    private String mLocation;
    
    //constructors
    public PayPhone(double cost, String type, String number) {
        super(type, number);
        mCost = cost;
    }
    //no arg cosntr

    public PayPhone() {
        super();
        mCost = 0.0;
    }
    
    //methods

    public double getCost() {
        return mCost;
    }

    public void setCost(double cost) {
        mCost = cost;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }
    
}
