/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Scanner;

/**
 *
 * @author jeanieherold
 */
public class EngineNumber7 {
    
    public static void main(String[] args) {
        
       CardValidator validator = new CardValidator();
        
        try {
            System.out.println(validator.checkNum("12345432", null, 8));
            System.out.println(validator.getAttempts());
            System.out.println(validator.checkNum("12345432", null, 8));
            System.out.println(validator.getAttempts());
            System.out.println(validator.checkNum("12345432", null, 8));
            System.out.println(validator.getAttempts());
            System.out.println(validator.checkNum("12345432", null, 8));
            System.out.println(validator.getAttempts());
        } catch (MaxAttemptsExceededException e) {
            System.out.println("thrown at: " + validator.getAttempts());
            System.out.println("Max attempts exceeded-Engine7");
        }
        
        
        
        
        

        
        //test address verification ------------------------
//        String address;
//        Scanner keyboard = new Scanner(System.in);

//        System.out.println("Enter your address:");
//        address = keyboard.nextLine();

//        AddressVerification verify = new AddressVerification();
        
//        verify.validateAddress(address);
        
//        System.out.println(verify.validateAddress("123 OldBirch, Wren, 29673"));
        
    }
    
}
