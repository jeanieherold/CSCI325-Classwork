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
public class Quiz {
    
    //fields
    ArrayList<String> mQuestions;
    
    //constructor
    public Quiz(ArrayList<String> questions) {
        if (questions.size() > 25) {
            System.out.println("You have entered more than 25 questions - Enter no more than 25.");
        } else {
            for(int i = 0; i < questions.size(); i++) {
                mQuestions.add(questions.get(i));
            }
        }
    }
    
    //methods
    public ArrayList<String> getQuestions() {
        return mQuestions;
    }
    
    public int gradeAnswers(String[] answers) {
        int correctAnswers = 0;
        
        return correctAnswers;
    }
    
    public boolean setQuestion(int index, Question question) {
        if(0 <= index && index <=24) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
