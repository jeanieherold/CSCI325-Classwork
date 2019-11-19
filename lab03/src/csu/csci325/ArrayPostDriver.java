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
//        //empty arraylist
//        ArrayList<Integer> testNums = new ArrayList<Integer>(Arrays.asList());
//        //testing various arrays
//        ArrayList<Integer> testNums2 = new ArrayList<Integer>(Arrays.asList(10, 1, 10, 2));
//        ArrayList<Integer> testNums3 = new ArrayList<Integer>(Arrays.asList(10, 10, 1, 2, 3));
        
//        ArrayPost post1 = new ArrayPost(testNums);
//        ArrayPost post2 = new ArrayPost(testNums2);
//        ArrayPost post3 = new ArrayPost(testNums3);
//
//        System.out.println(post1.post10(testNums));
//        System.out.println(post2.post10(testNums2));
//        System.out.println(post3.post10(testNums3));
        
        //2. test Arrayutil class
        
        //testing lists
//        ArrayList<Integer> testList1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
//        ArrayList<Integer> testList2 = new ArrayList<Integer>(Arrays.asList(1, 5, 1, 5, 1, 5, 1, 5, 1, 5, 1));
//        ArrayList<Integer> testList3 = new ArrayList<Integer>(Arrays.asList(3, 24, 32, 55, 43, 66, 71, 111, 234, 321, 77));
        
//        ArrayUtil list1 = new ArrayUtil(testList1);
//        System.out.println("The Original list with every 3rd item removed is: ");
//        System.out.println(list1.remove(testList1, 3));
//        
//        ArrayUtil list2 = new ArrayUtil(testList2);
//        System.out.println("The Original list with every 2nd item removed is: ");
//        System.out.println(list2.remove(testList2, 2));
//        
//        ArrayUtil list3 = new ArrayUtil(testList3);
//        System.out.println("The Original list with every 4th item removed is: ");
//        System.out.println(list3.remove(testList3, 4));
        
        //test Questions
        Question q1 = new Question("From which language is the word \'ketchup\' derived?", "Chinese");
        Question q2 = new Question("Who portrayed Edward Scissorhands?", "Johnny Depp");
        Question q3 = new Question("What are made and repaired by a cobbler?", "Shoes");
        Question q4 = new Question("Which English football team plays its home matches at Old Trafford?", "Manchester United");
        Question q5 = new Question("What is an endoscope used to examine?", "The inside of the body");
        Question q6 = new Question("Maris Piper and King Edward are varieties of what?", "Potato");
        Question q7 = new Question("H2O is the chemical formula for what?", "Water");
        Question q8 = new Question("In the medical profession, what do the initials \'GP\' stand for?", "General practitioner");
        Question q9 = new Question("Which English king married six times?", "Henry VIII");
        Question q10 = new Question("Complete the title of the play by Shakespeare \'The Merchant of \'?", "Venice");
        
        System.out.println(q1.isCorrect("Chinese"));
        System.out.println(q1.isCorrect("chinese"));
        System.out.println(q1.isCorrect("USA"));
        //print question 1
        System.out.println(q1.getQuestion());
        
        System.out.println("");
        
        //test Quiz
        Quiz quiz1 = new Quiz();
        //print q2
        System.out.println(q2.getQuestion());
        
        //get all non null questions in the quiz array
        //no questions added yet so should be empty array
        System.out.println(quiz1.getQuestions());
        
        //set question at various indices in quiz
        quiz1.setQuestion(5, q3);
        quiz1.setQuestion(7, q8);
        quiz1.setQuestion(9, q10);
        quiz1.setQuestion(-1, q9);
        System.out.println("");
        quiz1.setQuestion(25, q9);
        System.out.println("");
        quiz1.setQuestion(8, q9);
        
        
        System.out.println("");
        //check student answer for q6
        System.out.println(q6.isCorrect("potato"));
        
        //print all non null question in quiz
        System.out.println(quiz1.getQuestions());
        
        String[] studentAnswers = new String[4];
        studentAnswers[0] = "shoes";
        studentAnswers[1] = "general practitioner";
        studentAnswers[2] = "henry VIII";
        studentAnswers[3] = "venice";
        
        System.out.println(quiz1.gradeAnswers(studentAnswers));
        
    }
    
}
