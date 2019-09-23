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
public class Paper {
    
    //fields
    private final int MAX_PAPER = 3000;
    private int amountOfPaper = 100;

    //constructor
    public Paper(int amt) {
        if (amt + amountOfPaper > MAX_PAPER) {
            amountOfPaper = MAX_PAPER;
        } else {
            amountOfPaper = amt;
        } 
    }

    //methods
    public int getAmount() {
        return amountOfPaper;
    }
    public void setAmount(int amt) {
        amountOfPaper = amt;
    }
    
    //decrease amt of paper by 1 if paper not out
    public boolean decrementPaper() {
        if (amountOfPaper > 0) {
            amountOfPaper--;
            return true;
        } else {
            System.out.println("The Copier is out of paper. Load paper");
            return false;
        }
    }
    
    //return true or false according to if the amt of paper added will exceed the max paper amt
    public boolean incrementPaper(int amt) {
        if (amt + amountOfPaper < MAX_PAPER) {
            amountOfPaper += amt;
            return true;
        } else {
            System.out.println("The amount of paper you are adding exceeds the Maximum pages allowed - Add fewer pages to the tray.");
            return false;
        }
    }
    
    
}
