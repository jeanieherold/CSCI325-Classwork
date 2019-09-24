/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;

/**
 *
 * @author jeanieherold
 */
public class ArrayUtil {
    
    
//constructor
    private ArrayUtil() {
    }
    //public constructor
    public ArrayUtil(ArrayList<Integer> origList) {

    }
    
    //methods
    public ArrayList remove(ArrayList<Integer> origList, int n) {
        //create an array to hold the new array with every nth removed
        ArrayList<Integer> nRemList = new ArrayList();
        
        //loop through and remove nth elements
        for (int i = 1; i < origList.size() + 1; i++) {
            if (i % n != 0) {
                nRemList.add(origList.get(i - 1));
            }   
        }

        return nRemList;
    }
    
}
