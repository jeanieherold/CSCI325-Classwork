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
public class Student {
    
    private int mId;
    private String mName;
    
    //to overwrite the constructor autocreated by java - create an empty PRIVATE constructor for Student with no params so no one can use that
    private Student() {    
    }
    
    //create a constructor for Student instatiation with params
    public Student (String name, int id) {
        mName = name;
        mId = id;
    }

    //getters
    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    //setters
    public void setId(int mId) {
        this.mId = mId;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
    
    
    
}
