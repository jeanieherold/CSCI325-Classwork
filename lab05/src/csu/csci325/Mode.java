/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author jeanieherold
 */
public class Mode {
    
    private ArrayList<Double> list;
    private Double mode;
    
    //constructor
    public Mode(ArrayList<Double> arr) {
        list = new ArrayList<>(arr);
    }
    
    //method    
    public Double calculateMode() {
        
        Double tempNum;
        mode = 0.0;
        int occurence = 0;
        
        //sort list lowest to highest
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            tempNum = list.get(i);

            int tempCount = 0;
            for (int j = 0; j < list.size(); j++) {
                if (Objects.equals(list.get(j), tempNum)) {
                    tempCount++;
                    if (tempCount > occurence) {
                        mode = tempNum;
                        occurence = tempCount;
                    }
                }
            }

        }
        
        return mode;
    }
    
    //getters & setters
    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> arr) {
        list.clear();
        list = new ArrayList<>(arr);
    }
    
}
