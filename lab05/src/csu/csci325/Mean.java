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
public class Mean {
    
    private ArrayList<Double> list;
    private Double mean;
    
    //constructor
    public Mean(ArrayList<Double> arr) {
        list = new ArrayList<>(arr);
    }
    
    //methods
    public Double calculateMean() {
        
        Double sum = 0.0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        
        mean = sum/list.size();
        
        return mean;
    }
    
    //getters & setters
    public Double getMean() {
        return mean;
    }

    public void setMean(Double mean) {
        this.mean = mean;
    }
    
    
    
}
