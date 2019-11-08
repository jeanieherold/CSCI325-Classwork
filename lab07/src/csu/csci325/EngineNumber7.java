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
public class EngineNumber7 {
    
    public static void main(String[] args) {
        
        String sCard;
        int iCard = 0;
        String cardNum;
         
        System.out.println("Enter your card type by list number or name:");
        System.out.println("1. American Express");
        System.out.println("2. Visa");
        System.out.println("3. Mastercard");
        System.out.println("4. Discover");
        
        //create a validator
        CardValidator validator = new CardValidator();
        System.out.println(validator.getAttempts());
        sCard = validator.getString();
        System.out.println(sCard);
        if(sCard.charAt(0) == '1' || sCard.charAt(0) == '2' || sCard.charAt(0) == '3' || sCard.charAt(0) == '4') {
            iCard = validator.getInt(); 
            try {
                System.out.println("iCardTYPE: " + validator.checkType(iCard));
            } catch (MaxAttemptsExceededException e) {
                System.out.println(e.getMessage());
            }
            
            System.out.println("Enter your card number:");
            cardNum = validator.getString();
            System.out.println("int: " + cardNum);
            
        } else {
            try {
                System.out.println("sCardTYPE: " + validator.checkType(sCard));
            } catch (MaxAttemptsExceededException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter your card number:");
            cardNum = validator.getString();
            System.out.println("string: " + cardNum);
        }
        
        try {
            System.out.println("validator:" + validator.checkNum(cardNum, sCard, iCard));
        } catch (MaxAttemptsExceededException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(validator.getAttempts());
        
    }
    
}
