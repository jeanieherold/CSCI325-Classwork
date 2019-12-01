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
public class lab09Test {
    
    public static void main(String[] args) {
        
       System.out.println("--------- Convert Expression -------------");
        
        ConvertExp exp = new ConvertExp();

        System.out.println("s is op? : " + exp.isOperator("s"));
        System.out.println("+ is op? : " + exp.isOperator("+"));
        System.out.println("- is op? : " + exp.isOperator("-"));
        System.out.println("* is op? : " + exp.isOperator("*"));
        System.out.println("/ is op? : " + exp.isOperator("/"));
        System.out.println("j is op? : " + exp.isOperator("j"));

        exp.preToInfix("*+AB-CD");
        exp.preToInfix("*-A/BC-/AKL");

        exp.postToInfix("AB+CD-*");
        exp.postToInfix("abc++");
        
        System.out.println("--------- Compress Code -------------");

        Compress secretCode = new Compress();
        secretCode.compress("AAAABBBCCDE");
        secretCode.compress("XYZZZZZZZZZQQ");
        secretCode.compress("");
        
        System.out.println("--------- Is Palindrome -------------");
        
        //paindrome testing
        Palindrome p = new Palindrome();
        
        p.checkPal("Sally Samson.Welcome home!*numbers@24");
        p.isIt("s");
        p.isIt("");
        p.isIt("salls");
        p.isIt("level");
        p.isIt("racecar");
        p.isIt("bob");

        System.out.println("ISIT-racecar: " + p.isIt("racecar"));
        System.out.println("ISIT-racear: " + p.isIt("racear"));
        System.out.println("ISIT-A nut for a jar of tuna: " + p.isIt("A nut for a jar of tuna"));
        System.out.println("ISIT-Are we not drawn onward, we few, drawn onward to new era?: " + p.isIt("Are we not drawn onward, we few, drawn onward to new era?"));

        System.out.println("CHECK-racecar: " + p.checkPal("racecar"));
        System.out.println("CHECK-racear: " + p.checkPal("racear"));
        System.out.println("CHECK-A nut for a jar of tuna: " + p.checkPal("A nut for a jar of tuna"));
        System.out.println("CHECK-Are we not drawn onward, we few, drawn onward to new era?: " + p.checkPal("Are we not drawn onward, we few, drawn onward to new era?"));
        System.out.println("CHECK-Are wee not drawn onward, we few, drawn onward to new era?: " + p.checkPal("Are wee not drawn onward, we few, drawn onward to new era?"));
 
    }
    
}
