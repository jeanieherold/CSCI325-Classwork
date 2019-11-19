/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Date;

/**
 *
 * @author jeanieherold
 */
public class QtimeNote implements Comparable <QtimeNote>{
    
    private Date mDate;
    private String mBook;
    private String mVerse;
    private String mNotes;
    
    public QtimeNote (String book, String verse, String note) {
        
        mDate = new Date();
        mBook = book;
        mVerse = verse;
        mNotes = note;
        
    }
    
    //methods
    public int compareTo(QtimeNote n) {
        
        String compareStr = mBook + mVerse;
        int retVal = compareStr.compareTo(n.toString());
        
        return retVal;
    }

    public Date getDate() {
        return mDate;
    }

    public String getBookOfBible() {
        return mBook;
    }

    public String getVerseRef() {
        return mVerse;
    }

    public String getUserNotes() {
        return mNotes;
    }
    
    public void updateUserNotes(String userNotes) {
        mNotes += userNotes;
    }
    
    @Override
    public String toString() {
        
        String bookAndVerseString = mBook + mVerse;
        
        return bookAndVerseString;
    }
    
    
}
