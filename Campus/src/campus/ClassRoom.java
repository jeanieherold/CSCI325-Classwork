/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campus;

/**
 *
 * @author jeanieherold - following class video example
 */
public class ClassRoom {
    
    private String mName;
    private Student[] mSeats;
    private int mNumDoors, mNumWindows, mFloor;
    
    //overwrite public no param auto java generated constructor with PRIVATE empty no param constructor so no one can use that
    private ClassRoom() {
    
    }
    
    //create our own public constructor
    public ClassRoom (String name, int numSeats) {
        mName = name;
        mSeats = new Student[numSeats];
    }

    //getters / setters
    public void setSeat(int pos, Student student) {
        mSeats[pos] = student;
    }
    
    public Student getSeat(int pos) {
        return mSeats[pos];
    }
    
    public String getName() {
        return mName;
    }
    
    public Student getStudent(String studentName) {
        Student retVal = null;
        
        for (int i = 0; i < mSeats.length; i++) {
            if (mSeats[i] != null && mSeats[i].getName().equals(studentName)) {
                retVal = mSeats[i];
            }
        }
        return retVal;
    }
    
    
    
}
