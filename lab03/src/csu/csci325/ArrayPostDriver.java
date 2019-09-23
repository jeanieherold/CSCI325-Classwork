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
public class ArrayPostDriver {
    
    public static void main(String[] args) {
        
        int[] testNums = {43, 10, 102, 77, 33, 33, 55, 17};
        int[] testNums2 = {43, 10, 102, 77, 33, 33, 10, 17};
        int[] testNums3 = {10, 102, 77, 10, 33, 55, 17};
        int[] testNums4 = {10, 102, 77, 10, 33, 55, 10};
        
        ArrayPost list = new ArrayPost(testNums);

        System.out.println(list.post10(testNums));
        System.out.println(list.post10(testNums2));
        System.out.println(list.post10(testNums3));
        System.out.println(list.post10Index(testNums4));
        System.out.println(list.post10(testNums4));
    }
    
}
