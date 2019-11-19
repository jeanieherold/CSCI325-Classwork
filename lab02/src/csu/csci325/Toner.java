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
public class Toner {
    
//fields
    private static double MAX_TONER= 18;
    private double amountOfToner;

    //constructor
    public Toner() {
        amountOfToner = MAX_TONER;
    }

    //methods
    public double getAmount() {
        return amountOfToner;
    }
    
    //return true if the toner can be incremented by one
    public boolean incrementByOne() {
        if (amountOfToner < MAX_TONER) {
            amountOfToner++;
            return true;
        } else {
            System.out.println("The toner is full.");
            return false;
        }
    }
    
    public boolean decrementAmt() {
        //has to have at least 0.05 left to make a copy
        if (amountOfToner >= 0.05) {
            amountOfToner -= 0.05;
            return true;
        } else {
            System.out.println("The Toner is out");
            return false;
        }
    }
    
}
