/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun;

import java.util.Scanner;

/**
 *
 * @author jeanieherold
 */
public class ArrayFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUM_EMPLOYEES = 3; //num employees
        
        //create an array to hold employee hours
        double[] hours = new double[NUM_EMPLOYEES];
        
        //create a scanner object for keyboard im=nput to ask for employee hours
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the hours worked by " + 
                                NUM_EMPLOYEES + " employees");
        
//        //get employee 1's hours
//        System.out.println("Employee 1: ");
//        hours[0] = keyboard.nextDouble();
//        
//        //get employee 2's hours
//        System.out.println("Employee 2: ");
//        hours[1] = keyboard.nextDouble();
//        
//        //get employee 3's hours
//        System.out.println("Employee 3: ");
//        hours[2] = keyboard.nextDouble();
        
        //loop through the NUM_EMPLOYEES to DRY out the code above
        for(int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Employee " + (i+1) + ": ");
            hours[i] = keyboard.nextDouble();
        }
        
        
        //user will probably hit enter after the put in the number - the following reads to the end of the line
        keyboard.nextLine();
        
        //display the values in the array
//        System.out.println(hours[0]);
//        System.out.println(hours[1]);
//        System.out.println(hours[2]);
        
        //create a loop to DRY out the print code above (could have used NUM_EMPLOYEES to loop through but I am using the array hours since we just filled that)
        System.out.println("The hours you entered are:");
        for (int i = 0; i < hours.length; i++) {
            System.out.println(hours[i]);
            
        }
    }
    
}
