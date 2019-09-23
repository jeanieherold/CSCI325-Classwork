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
public class Building {
    private String mName;
    private ClassRoom[] mClassRooms;
    
    private Building() {
        
    }
    
    public Building(String name, int numClassRooms) {
        mName = name;
        mClassRooms = new ClassRoom[numClassRooms];
    }
    
    //methods
    public void setClassRoom(int pos, ClassRoom classRoom) {
        //If pos is out of bounds
        if (pos < 0 || pos >= mClassRooms.length) {
            //get out
            return;
        } 
        mClassRooms[pos] = classRoom;
    }
    
    //get classroom of student in building
    public ClassRoom getClassRoom(Student student) {
        ClassRoom retVal = null;
        
        for (int i = 0; i < mClassRooms.length; i++) {
            if (mClassRooms[i] != null && mClassRooms[i].getStudent(student.getName()) != null) {
                retVal = mClassRooms[i];
            }
            
        }
        return retVal;
    }
    
    //note we are creating a second method of same name - java will know which method to use based on the arg passed in
    //get classroom name based on its name
    public ClassRoom getClassRoom(String classRoomName) {
        ClassRoom retVal = null;
        
        for (int i = 0; i < mClassRooms.length; i++) {
            if(mClassRooms[i] != null && mClassRooms[i].getName().equals(classRoomName)) {
                retVal = mClassRooms[i];
            }
            
        }
        return retVal;
    }
    
}
