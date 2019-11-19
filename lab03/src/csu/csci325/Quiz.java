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
    private String[] mQuestions;
    private ArrayList<Question> setQuestions;
    private ArrayList<String> nonNullQs;

    //constructor
    public Quiz() {
        //initalize to 25 null values
        mQuestions = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        setQuestions = new ArrayList();
    }

    //methods
    public ArrayList<String> getQuestions() {
        nonNullQs = new ArrayList();
        for (int i = 0; i < mQuestions.length; i++) {
            if (mQuestions[i] != null) {
                nonNullQs.add(mQuestions[i]);
            }
        }

        return nonNullQs;
    }

    public int gradeAnswers(String[] answers) {
        int correctAnswers = 0;
        int j = 0;
        //missing something here ?? thinking...
        for (int i = 0; i < answers.length; i++) {
            if(setQuestions.get(i).isCorrect(answers[i])) {
                correctAnswers++;
            }
           
        }
        
        return correctAnswers;
    }

    public boolean setQuestion(int index, Question question) {
        if (0 <= index && index <= 24) {
            mQuestions[index] = question.getQuestion();
            setQuestions.add(question);
            return true;
        } else {
            System.out.println(index + " is not a valid location for the question - Question locations from 0 to 24. Try again.");
            return false;
        }
    }

}
