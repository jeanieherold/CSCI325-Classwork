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
public class Palindrome {
    
    //fields
    
    //constructor
    public Palindrome() {
    
    }
    
    //methods
    
    public static boolean isIt(String s) {
        boolean itIs = false;
        String first;
        String last;
            
        if(s.length() == 0) {
            itIs = true;
        } else if (s.length() == 1) {
            itIs = true;
        } else {

            first = Character.toString(s.charAt(0));
            last = Character.toString(s.charAt(s.length() - 1));
            
            if (first.equals(last)) {
                s = s.substring(1, s.length()-1);
                itIs = isIt(s);
            } else {
                itIs = false;
            }
            
        }

        return itIs;
    }
    
    public static boolean checkPal(String s) {
        boolean isPalindrome = false;
        
        s = s.toLowerCase();
        s = s.replaceAll("\\s", "");
        s = s.replaceAll("\\p{P}", "");
        System.out.println("lowercase-nospace: " + s);
        
        isPalindrome = isIt(s);
        
        return isPalindrome;
    }
    
}
