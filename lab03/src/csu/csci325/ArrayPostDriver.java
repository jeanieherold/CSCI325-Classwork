/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jeanieherold
 */
public class ArrayPostDriver {
    
    public static void main(String[] args) {
        
        //1. test ArrayPost class          
        //empty arraylist
        ArrayList<Integer> testNums = new ArrayList<Integer>(Arrays.asList());
        //testing various arrays
        ArrayList<Integer> testNums2 = new ArrayList<Integer>(Arrays.asList(10, 1, 10, 2));
        ArrayList<Integer> testNums3 = new ArrayList<Integer>(Arrays.asList(10, 10, 1, 2, 3));
        
        ArrayPost post1 = new ArrayPost(testNums);
        ArrayPost post2 = new ArrayPost(testNums2);
        ArrayPost post3 = new ArrayPost(testNums3);

        System.out.println(post1.post10(testNums));
        System.out.println(post2.post10(testNums2));
        System.out.println(post3.post10(testNums3));
        
        //2. test Arrayutil class
        
        //testing lists
        ArrayList<Integer> testList1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
        ArrayList<Integer> testList2 = new ArrayList<Integer>(Arrays.asList(1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1));
        ArrayList<Integer> testList3 = new ArrayList<Integer>(Arrays.asList(3, 24, 32, 55, 43, 66, 71, 111, 234, 321, 77));
        
        ArrayUtil list1 = new ArrayUtil(testList1);
        System.out.println("The Original list with every 3rd item removed is: ");
        System.out.println(list1.remove(testList1, 3));
        
        ArrayUtil list2 = new ArrayUtil(testList2);
        System.out.println("The Original list with every 2nd item removed is: ");
        System.out.println(list2.remove(testList2, 2));
        
        ArrayUtil list3 = new ArrayUtil(testList3);
        System.out.println("The Original list with every 4th item removed is: ");
        System.out.println(list3.remove(testList3, 4));
        
        
        
    }
    
}
