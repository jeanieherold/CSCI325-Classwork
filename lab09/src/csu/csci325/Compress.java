/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author jeanieherold
 */
public class Compress {
    
    //fields
    
    //constructors
    public Compress() {
        
    }
    
    //methods
    public static String compress (String s) {
        String encodedStr = "";
        Stack<String> compressedStack = new Stack<>();
        Stack<String> peekStack = new Stack<>();
        
        try {
            if(s.equals("")) {
                System.out.println("null pointer");
                return null;
            } else {
                //push each string element onto the stack
                for (int i = 0; i < s.length(); i++) {
                    compressedStack.push(s.substring(i, i+1));  
                    peekStack.push(s.substring(i, i+1));  
                }
            } 
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
            return null;
        }
        
        Stack<String> holdSt = new Stack<>();
        Integer counter = 1;
        String hold;
        
        try {
            while(!compressedStack.empty()) {

                hold = compressedStack.pop();
                System.out.println("hold: " + hold);
                if(!compressedStack.empty() && compressedStack.peek().equals(hold)) {
                    counter++;
                } else {
                    if (counter > 1) {
                        holdSt.push(hold + counter);
                        counter = 1;
                    } else {
                        holdSt.push(hold);
                        counter = 1;
                    }
                    
                }   
            }
            
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack Exception");
            return null;
        }
        
        try {
            while(!holdSt.empty()) {
                encodedStr += holdSt.pop();
            }
        } catch (EmptyStackException e) {
            System.out.println("Empty Stack Exception");
            return null;
        }
        
        
        System.out.println(encodedStr);
        
        return encodedStr;
    }
    
}
