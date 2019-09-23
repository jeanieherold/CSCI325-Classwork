/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeanieherold
 */
public class ArrayPost {
    
    //fields
    private int[] numbers;
   
    //constructor
    private ArrayPost() {
    }
    //public constructor
    public ArrayPost(int[] list) {
        
        numbers = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            numbers[i] = list[i];
        } 
    }
    
    //methods

    public int[] getNumbers() {
        return numbers;
    }

    
    // Function to find the index of an element in a primitive array in Java
    public int post10Index(int[] numbers) {
        
        int lastPost10Index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 10) {
                lastPost10Index = i;  
            }
        }
        
        return lastPost10Index;
    }
    
    public ArrayList post10 (int[] numbers) {
        
        ArrayList post10Numbers = new ArrayList();
        int last10index = post10Index(numbers);
        
        for (int i = last10index + 1; i < numbers.length; i++) {
            post10Numbers.add(numbers[i]);  
        }
        
        return post10Numbers;
        
    }
    
}
