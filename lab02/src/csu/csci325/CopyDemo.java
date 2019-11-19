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
public class CopyDemo {
    
    public static void main(String[] args) {
        //This is the driver - the main class for the project to test the other classes CopyManager, Paper and Toner
        
        System.out.println("This is my Copier testing");
        CopyManager manager = new CopyManager();
        
        System.out.println("Before any copies made on new copier - Total copies made: " + manager.getTotalCopiesMade());
        System.out.println("Toner level: " + manager.getToner());
        System.out.println("Paper level: " + manager.getPaper());

        while (manager.copyIt() == -1) {
            manager.copyIt();
        }
        
        System.out.println("Total copies made after print: " + manager.getTotalCopiesMade());
        System.out.println("Total copies since last toner: " + manager.getTotalCopiesSinceLastToner());
        
        //fill toner
        manager.fillToner();
        
        while (manager.copyIt() == -1) {
            manager.copyIt();
        }
        
        System.out.println("Total copies made after print: " + manager.getTotalCopiesMade());
        System.out.println("Total copies since last toner: " + manager.getTotalCopiesSinceLastToner());
        
        //test paper
        Paper papertest = new Paper(300);
        System.out.println(papertest.getAmount());
        
        papertest.setAmount(200);
        System.out.println(papertest.getAmount());
        
        papertest.decrementPaper();
        System.out.println(papertest.getAmount());
        papertest.incrementPaper(20);
        System.out.println(papertest.getAmount());
        
        //test toner
        Toner tone = new Toner();
        System.out.println(tone.getAmount());
        
        while(tone.incrementByOne()) {
            System.out.println("incremeneted toner.");
            tone.incrementByOne();
        }
        while(tone.decrementAmt()) {
            System.out.println("decremented toner.");
            tone.decrementAmt();
        }
        while(tone.incrementByOne()) {
            System.out.println("incremeneted toner.");
            tone.incrementByOne();
        }
        
    }
    
}
