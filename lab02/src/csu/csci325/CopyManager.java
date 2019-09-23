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
public class CopyManager {
    
    //fields
    private int mTotalCount;
    private int mTotalCountSinceLastToner;
    private Paper mPaper;
    private Toner mToner;
    
    //constructor
    public CopyManager() {
        mTotalCount = 0;
        mTotalCountSinceLastToner = 0;
        mPaper = new Paper(3000);
        mToner = new Toner();
    }
    
    //methods
    public int getTotalCopiesMade() {
        return mTotalCount;
    }
    
    public int getTotalCopiesSinceLastToner() {
        return mTotalCountSinceLastToner;
    }
    
    public void fillToner() {
        mToner.incrementByOne();
        mTotalCountSinceLastToner = 0;
    }
    
    public double getToner() {
        return mToner.getAmount();
    }
    
    public int getPaper() {
        return mPaper.getAmount();
    }
    
    public int copyIt() {
        if(mPaper.getAmount() > 0 && mToner.getAmount() > 0) {
            mPaper.decrementPaper();
            mToner.decrementAmt();
            mTotalCount++;
            mTotalCountSinceLastToner++;
            System.out.println("Copied successfully");
            return -1; //copy made success
        } else if (mPaper.getAmount() <= 0) {
            System.out.println("Paper is out");
            return -2; //copier is out of paper
        } else if (mToner.getAmount() <= 0) {
            System.out.println("Toner is out");
            return -3; //copier is out of toner
        } else {
            System.out.println("Unknown error");
            return -5; //unknown error occurred
        }
    }
    
}
