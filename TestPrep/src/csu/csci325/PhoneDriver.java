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
public class PhoneDriver {

    public static void main(String[] args) {
        
        Phone myphone = new Phone("Galaxy");
        
        System.out.println(myphone.getType());
        System.out.println(myphone.getNumber());
        myphone.setNumber("555-423-5555");
        System.out.println(myphone.getNumber());
        //start of polymorph example
        myphone.ringtone();
        
        myphone = new SmartPhone();
        myphone.setNumber("555-123-1234");
        System.out.println("phone number: " + myphone.getNumber());
        //polymorph code example... SmartPhone method for ringtone overrides Phone class method for ringtone. 
        myphone.ringtone();
        
        
    }
    
    
}
