/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flower;

/**
 *
 * @author jeanieherold
 */
public class Flower {
    
    //convention : 'member variables' - an attribute of a class : put the m in front
    private double mHeight;
    private int mPedals;
    private boolean mThorns;
    private String mName;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(getHeight()); - incorrect - nothing instatiated
        //System.out.println(Flower.getHeight());   incorrect - nothing instatiated
        
        //instatiate a new flower and place the reference to the memory lcoation in 
        //the variable called my flower
                
        Flower myFlower = new Flower();
        
        System.out.println(myFlower.getHeight()); //print flower height
        System.out.println(myFlower.getNumberOfPedals()); //print flower number of pedals
        System.out.println(myFlower.hasThorns()); //print if flower has thorns
        System.out.println(myFlower.toString()); 
        
        System.out.println("The flower is called " + myFlower.toString() + ".");

    }
    
    //constructors - named the exact same thing as the class
    //constructor is called everytime object is instatiated
    public Flower() {
        mHeight = 4.0;
        mPedals = 50;
        mThorns = true;
        mName = "Peace";
    }
    
    //getters
    public double getHeight() {
        //return 4.0;
        return mHeight;
    }
    
    public int getNumberOfPedals() {
        //return 50;
        return mPedals;
    }
    
    public boolean hasThorns() {
        //return true;
        return mThorns;
    }
    
    public String toString() {
        //return "Peace";
        return mName;
    }
    
}
