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
public class SmartPhone extends Phone {
    
    //fields
    private double mDataGigs;
    private double mTextLimit;
    private boolean mVideo;
    
    //constructor
    public SmartPhone(double dataGigs, double textLimit, String type, String number) {
        super(type, number);
        mDataGigs = dataGigs;
        mTextLimit = textLimit;
    }

    //no arg constructor
    public SmartPhone() {
        super();
        mDataGigs = 0;
        mTextLimit = 0;
    }
    
    //methods
    public double getDataGigs() {
        return mDataGigs;
    }

    public void setDataGigs(double dataGigs) {
        mDataGigs = dataGigs;
    }

    public double getTextLimit() {
        return mTextLimit;
    }

    public void setTextLimit(double textLimit) {
        mTextLimit = textLimit;
    }

    public boolean isVideo() {
        return mVideo;
    }

    public void setVideo(boolean video) {
        mVideo = video;
    }
    
    //the code below shows use of polymorphism since it is overriding the parent class method of the same name
    public void ringtone () {
        System.out.println("twinkle twinkle little star");
    }
    
}
