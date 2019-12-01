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
    public Qtime() {
        
        qtimeNotes = new LinkedList(); 
        qNoteListSize = qtimeNotes.size();
       
    }
    
    //methods
    public LinkedList getNoteList() {
        return qtimeNotes;
    }

    public int getNoteListSize() {
        return qtimeNotes.size();
    }
    
    public void setNote(QtimeNote qtimeNote) {
        
        qtimeNotes.add(qtimeNote);
        
    }

    public void removeNotes(String book) {
        
        Iterator<QtimeNote> iter = qtimeNotes.iterator();
        while(iter.hasNext()){
            QtimeNote note = iter.next();
            String bookofbible = note.getBookOfBible();
            if(bookofbible.equals(book)){
                iter.remove();
            }
        }
                    
    }

    public void updateUserNote(QtimeNote qtimeNote, String userNotes) {
        
        for (QtimeNote note : qtimeNotes) {
            if (note.toString().equals(qtimeNote.toString())) {
                note.updateUserNotes(userNotes);
            }
        }

    }
    
    public void sortNotes() {

        Collections.sort(qtimeNotes);
       
    }
    
    
}
