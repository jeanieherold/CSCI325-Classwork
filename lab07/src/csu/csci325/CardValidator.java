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
    private String mUserInputType;
    
    //constructor
    public CardValidator() {
        mAttempts = 0;
    }
    
    //methods
    public int getAttempts () {     
        return mAttempts;
    }

    public void setAttempts(int attempts) {    
        mAttempts = attempts;
    }
    
    //get the string the user entered without spaces and in lowercase
    public String getString() {
        String userResponse;
        Scanner keyboard = new Scanner(System.in);
        userResponse = keyboard.nextLine().trim().toLowerCase();
        
        mUserInputType = userResponse;
        
        return userResponse;
    }
    
    //get the integer the user entered without spaces
    public int getInt() {
        int userResponseAsInt;
        
        userResponseAsInt = Integer.parseInt(mUserInputType);
        
        return userResponseAsInt;
    }
    
    //next 2 methods - checkType - use method overloading to see if int for type was entered or the name of the card
    //for int
    public Boolean checkType(int iType) throws MaxAttemptsExceededException {
        boolean isValidIType = false;
        int test;
        mAttempts++;
        
        //check how many attempts 1st - throw exception if already 2 attempts
        if (mAttempts > 2) {
            throw new MaxAttemptsExceededException("Max attempts exceeded.");
        }
        
        test = iType;
        if(test == 1 || test == 2 || test == 3 || test == 4) {
            isValidIType = true;
        } else {
            isValidIType = false;
        }
        return isValidIType;
    }
    
    //for String
    public Boolean checkType(String sType) throws MaxAttemptsExceededException {
        boolean isValidSType = false;
        String amex = "American Express";
        String visa = "Visa";
        String mastercard = "Mastercard";
        String discover = "Discover";
        mAttempts++;
        
        //check how many attempts 1st - throw exception if already 2 attempts
        if (mAttempts > 2) {
            throw new MaxAttemptsExceededException("Max attempts exceeded.");
        }
        
        if(sType.toLowerCase().equals(amex.toLowerCase()) == true || sType.toLowerCase().equals(visa.toLowerCase()) == true || sType.toLowerCase().equals(mastercard.toLowerCase()) == true || sType.toLowerCase().equals(discover.toLowerCase()) == true) {
            isValidSType = true;
        } else {
            isValidSType = false;
        }
        
        return isValidSType;
    }

    //check for valid card number
    public Boolean checkNum(String sCardNum, String sCardType, int iCardType) throws MaxAttemptsExceededException {
        
        boolean isValidCardNum = false;
        
        String cardNumNoSpaces = sCardNum.replaceAll("\\s+", "");

        if(mAttempts > 2) {
            throw new MaxAttemptsExceededException("Max attempts exceeded.");
        }
        
        if ((cardNumNoSpaces.charAt(0) == '3' && cardNumNoSpaces.length() == 15) || 
            (cardNumNoSpaces.charAt(0) == '4' && cardNumNoSpaces.length() == 16) ||
            (cardNumNoSpaces.charAt(0) == '5' && cardNumNoSpaces.length() == 16) ||
            (cardNumNoSpaces.charAt(0) == '6' && cardNumNoSpaces.length() == 16)) {

            if(checkType(sCardType) || checkType(iCardType)) {
                isValidCardNum = true;
            } else {
                mAttempts++;
            }

        } else {
            mAttempts++;
        }
        
        return isValidCardNum;
    }
    
}
