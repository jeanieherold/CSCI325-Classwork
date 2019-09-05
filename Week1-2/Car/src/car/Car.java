/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author jeanieherold
 */
public class Car {
    
    //attributes
    private String mColor;
    private String mMake;
    private String mModel;
    private int mYear;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instatiate
        Car myCar = new Car();
        
        //output
        System.out.println("Hi, I am Jeanie Herold.");
        System.out.println("My first car was a " + myCar.getColor() + " " + myCar.getYear() + " " + myCar.getMake() + " " + myCar.getModel() + ".");
    }
    
    //constructor
    public Car() {
        mColor = "blue";
        mMake = "Chevy";
        mModel = "Malibu";
        mYear = 1976;
    }
    
    //getters
    public String getMake() {
        return mMake;
    }
    
    public String getModel() {
        return mModel;
    }
    
    public String getColor() {
        return mColor;
    }
    
    public int getYear() {
        return mYear;
    }
    
}
