/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csu.csci325;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author jeanieherold
 */
public class Qtime {
    
    LinkedList<QtimeNote> qtimeNotes;
    int  qNoteListSize;
    
    //constructor
    public Qtime(QtimeNote listnotes) {
        
        qtimeNotes = new LinkedList(); 
        qNoteListSize = 0;
       
    }
    
    //methods
    public LinkedList getNoteList() {
        return qtimeNotes;
    }

    public int getNoteListSize() {
        return qNoteListSize;
    }
    
    public void setNote(QtimeNote qtimeNote) {
        
        qtimeNotes.add(qtimeNote);
        
    }

    public void removeNotes(String book) {
        Iterator<QtimeNote> iter = qtimeNotes.iterator();
        
        if (iter.next().getBookOfBible().equals(book)) {
            iter.remove();
        }
    }
    
    public void updateUserNote(QtimeNote qtimeNote, String userNotes) {
        Iterator<QtimeNote> iter = qtimeNotes.iterator();
        
        if (iter.next().equals(qtimeNote)) {
            iter.next().updateUserNotes(userNotes);
        }     
    }
    
    public void sortNotes() {

        Collections.sort(qtimeNotes);
  
        
    }
    
    
}
