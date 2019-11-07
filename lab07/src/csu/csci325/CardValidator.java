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
public class CardValidator {
    
    //fields
    private int mAttempts;
    
    //constructor
    public CardValidator() {
        mAttempts = 0;
    }
    public int getAttempts () {     
        return mAttempts;
    }

    //methods
    public void setAttempts(int attempts) {    
        mAttempts = attempts;
    }
    
    //get the string the user entered without spaces and in lowercase
    public String getString() {
        String userResponse = "";
        Scanner keyboard = new Scanner(System.in);
        userResponse = keyboard.nextLine().replaceAll("\\s+", "").toLowerCase();
        
        return userResponse;
    }
    
    //get the integer the user entered without spaces
    public int getInt() {
        int userResponse;
        Scanner keyboard = new Scanner(System.in);
        userResponse = Integer.parseInt(keyboard.nextLine().replaceAll("\\s+", ""));
        
        return userResponse;
    }
    
    //next 2 methods - checkType - use method overloading to see if int for type was entered or the name of the card
    //for int
    public Boolean checkType(int iType) {
        boolean isValidIType = false;
        int test;
        
        //check how many attempts 1st - throw exception if already 2 attempts
        try {
            if (mAttempts < 2) {
                test = getInt();
                if(test == 1 || test == 2 || test == 3 || test == 4) {
                    isValidIType = true;
                }   
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        mAttempts++; 
        return isValidIType;
    }
    //for String
    public Boolean checkType(String sType) {
        boolean isValidIType = false;
        String test;
        
        //check how many attempts 1st - throw exception if already 2 attempts
        try {
            if (mAttempts < 2) {
                test = getString();
                if(test == "americanexpress" || test == "visa" || test == "mastercard" || test == "discover") {
                    isValidIType = true;
                }   
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        mAttempts++; 
        return isValidIType;
    }

    //check for valid card number
    public Boolean checkNum(String sCardNum, String sCardType, int iCardType) {
        
        try {
            if(mAttempts < 2) {
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        boolean isValidCardNum = false;
        String cardNumNoSpaces = sCardNum.replaceAll("\\s+", "");
        
        if ((cardNumNoSpaces.charAt(0) == '3' && cardNumNoSpaces.length() == 15) 
                || (cardNumNoSpaces.charAt(0) == '4' && cardNumNoSpaces.length() == 16)
                || (cardNumNoSpaces.charAt(0) == '5' && cardNumNoSpaces.length() == 16) 
                || (cardNumNoSpaces.charAt(0) == '6' && cardNumNoSpaces.length() == 16)
                ) {
            isValidCardNum = true;
        } 
        
        mAttempts++;
        
        return isValidCardNum;
    }
    
}
