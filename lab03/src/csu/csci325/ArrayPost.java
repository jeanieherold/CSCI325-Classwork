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
    public ArrayPost(ArrayList<Integer> list) {

    }
    
    //methods
    
    public ArrayList<Integer> post10 (ArrayList<Integer> array) {
        ArrayList<Integer> post10Array = new ArrayList();
        int last10Index = -1;
        
        //loop thru ArrayList and find location of last 10
        for (int i = 0; i < array.size(); i++) {
            int number = array.get(i);
            if (number == 10) {
                last10Index = i;
            }     
        }
        //create an ArrayList of the integers after the last 10
        for (int i = last10Index + 1; i < array.size(); i++) {
            post10Array.add(array.get(i));
            
        }
        System.out.println(post10Array.size());
        
        return post10Array;
    }
    
    
}
