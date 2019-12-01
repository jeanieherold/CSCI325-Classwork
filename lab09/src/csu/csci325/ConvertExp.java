/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author jeanieherold
 */
public class ConvertExp {
    
    //fields
    
    //constructor
    public ConvertExp() {
        
    }
    
    //use hashset
    public static boolean isOperator(String s) {
        boolean retVal = false;
        
        HashSet<String> opSet = new HashSet();
        opSet.add("+");
        opSet.add("-");
        opSet.add("*");
        opSet.add("/");
        
        if (opSet.contains(s)) {
            retVal = true;
        }
        
        return retVal;
    }
    
    //use a stack ex: AB+CD-* is equiv to (A=B)*(C-D)
    public static String postToInfix(String exp) {
        String infixStr = "";
        String revPreStr = "";
        
        Stack<String> holdStack = new Stack<>();
        String holdOperator;
        String holdOperandFirstIn;
        String holdOperandLastIn;
        String expressionPart;
        
        Stack<String> expStack = new Stack<>();
        //push each string element onto the stack
        for (int i = 0; i < exp.length(); i++) {
            expStack.push(exp.substring(i, i+1));  
        }
        
        try {
             //rev the order of the prefix string
            while(!expStack.empty()) {   
                revPreStr += expStack.pop();  
            }
            for (int i = 0; i < revPreStr.length(); i++) {
                expStack.push(revPreStr.substring(i, i+1));  
            }

            System.out.println("expSt: " + expStack);
            System.out.println("revPreStr; " + revPreStr);

            while(!expStack.empty()) {
                String temp = expStack.pop();

                if (isOperator(temp)) {
                    holdOperator = temp;
                    holdOperandLastIn = holdStack.pop();
                    holdOperandFirstIn = holdStack.pop();
                    expressionPart = "(" + holdOperandFirstIn + holdOperator + holdOperandLastIn + ")";
                    holdStack.push(expressionPart);         

                } else {
                   holdStack.push(temp);
                }
            } 
        } catch (EmptyStackException e) {
                System.out.println("Empty Exception Error");
                return null;
        }
       
        System.out.println("holdstack: " + holdStack);
        
        while(!holdStack.empty()) {
            infixStr += holdStack.pop();
        }
        
        System.out.println("infixStr; " + infixStr);
        return infixStr;
    }
    
    //use a stack ex: *+AB-CD is equiv to (A=B)*(C-D)
    public static String preToInfix(String exp) {
        String infixStr = "";

        
        Stack<String> holdStack = new Stack<>();
        String holdOperator;
        String holdOperandFirstIn;
        String holdOperandLastIn;
        String expressionPart;
        
        Stack<String> expStack = new Stack<>();
        
        //push each string element onto the stack
        for (int i = 0; i < exp.length(); i++) {
            expStack.push(exp.substring(i, i+1));  
        }
        
        System.out.println("expSt: " + expStack);

        try {
            while(!expStack.empty()) {
                String temp = expStack.pop();

                if (isOperator(temp)) {
                    holdOperator = temp;
                    holdOperandLastIn = holdStack.pop();
                    holdOperandFirstIn = holdStack.pop();
                    expressionPart = "(" + holdOperandLastIn + holdOperator + holdOperandFirstIn + ")";
                    holdStack.push(expressionPart);         

                } else {
                   holdStack.push(temp);
                }
            }
            
        }  catch (EmptyStackException e) {
                System.out.println("Empty Exception Error");
                return null;
        }
        
        
        System.out.println("holdstack: " + holdStack);
        

        while(!holdStack.empty()) {
            infixStr += holdStack.pop();
        }
        
        System.out.println("infixStr; " + infixStr);
        return infixStr;
    }
    
}
