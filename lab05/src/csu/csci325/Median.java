/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jeanieherold
 */
public class Median {
    
    //fields
    private ArrayList<Double> list;
    private ArrayList<Double> median;
    
    //constructor
    public Median(ArrayList<Double> array) {
        list = new ArrayList<>(array);
    }
    
    //methods
    public ArrayList<Double> calculateMedian() {
        median = new ArrayList<>();
        
        //sort list lowest to highest
        Collections.sort(list);
        
        if (list.size() % 2 == 0) {
            int first = (list.size() / 2) - 1;
            int second = (list.size() / 2);
            median.add(list.get(first));
            median.add(list.get(second));
            
        } else {
            int only = list.size() / 2;
            median.add(list.get(only));
        }
        
        return median;
        
    }

    //getters & setters
    public ArrayList<Double> getList() {
        return list;
    }

    public void setList(ArrayList<Double> arr) {
        list.clear();
        for (int i = 0; i < arr.size(); i++) {
            list.add(arr.get(i));         
        }
    }
    
    
}
