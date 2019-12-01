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
public class TestDemo {
    
    public static void main(String[] args) {
        
        QtimeNote testnote = new QtimeNote("John", "3", "3:16");
        QtimeNote testnote2 = new QtimeNote("Psalms", "23", "Though I know...");
        QtimeNote testnote3 = new QtimeNote("Revelation", "7", "Look up");
        QtimeNote testnote4 = new QtimeNote("Genesis", "5", "Look up");
        QtimeNote testnote5 = new QtimeNote("Psalms", "46", "Be Still");
        QtimeNote testnote6 = new QtimeNote("Psalms", "118", "Look Up");
        QtimeNote testnote7 = new QtimeNote("Psalms", "7", "Look up");
        QtimeNote testnote8 = new QtimeNote("Psalms", "14", "Look up");
        Qtime qtime = new Qtime();
        
        //testing to string
        System.out.println("testnote as string: " + testnote.toString());
        
        //testing update user note in QtimeNote
        testnote2.updateUserNotes("I walk through the valley of the shadow of doubt, I will fear no evil");
        System.out.println("User note: " + testnote2.getUserNotes());
        
        //testing compare
        System.out.println("comare: " + testnote.compareTo(testnote2));
       
        //testing to Qtime getNoteList
        System.out.println(qtime.getNoteList());
        qtime.setNote(testnote2);
        qtime.setNote(testnote);
        qtime.setNote(testnote3);
        qtime.setNote(testnote4);
        qtime.setNote(testnote5);
        qtime.setNote(testnote6);
        qtime.setNote(testnote7);
        qtime.setNote(testnote8);
        System.out.println(qtime.getNoteList());
        
        //testing update user note in Qtime
        qtime.updateUserNote(testnote, "...words to live by.");
        System.out.println("User note in qtime: " + testnote.getUserNotes());
        
        
        //testing list size
        System.out.println("qtime size: " + qtime.getNoteListSize());
        
        //testing remove
        qtime.removeNotes("Psalms");
        System.out.println(qtime.getNoteList());
        
        //testing sort
        qtime.sortNotes();
        System.out.println("sorted notes: " + qtime.getNoteList());
        
        
    }
    
}
