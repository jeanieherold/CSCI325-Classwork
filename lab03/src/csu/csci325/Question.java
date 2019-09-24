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
public class Question {
    
    //fields
    String mQuestion;
    String mAnswer;
    
    //constructor
    public Question(String question, String answer) {
        
        mQuestion = question;
        mAnswer = answer;
        
    }
    
    //methods

    public String getQuestion() {
        return mQuestion;
    }
    
    public boolean isCorrect(String studentAnswer) {
        
        if(studentAnswer.toLowerCase().equals(mAnswer.toLowerCase())) {
            return true;
        } else {
            return false;
        }
        
    }
    
    
}
