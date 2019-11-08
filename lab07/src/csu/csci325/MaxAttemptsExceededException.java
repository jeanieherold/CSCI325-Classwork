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
public class MaxAttemptsExceededException extends Exception {
    
    //fields
    
    //no arg constructor
    public MaxAttemptsExceededException() {
        super("Maximum attempts exceeded.");
    }
    //constructor
    public MaxAttemptsExceededException (String s) {
        super(s);
    }
    
}
