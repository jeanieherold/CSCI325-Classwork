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
public class InvalidAddressException extends Exception {
    
    //fields
    
    //no arg constructor
    public InvalidAddressException() {
        super("Invalid Address.");
    }
    //constructor
    public InvalidAddressException (String s) {
        super(s);
    }
    
}
