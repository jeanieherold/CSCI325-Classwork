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
public class Campus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //scaffolding code - not needed for task of program but for exercising paths of the program (test the classes access methods)
        Student bob = new Student("Bob", 1234);
        Student alice = new Student("Alice", 5678);
        
        System.out.println(bob.getName());
        System.out.println(bob.getId());
        //the following will prin the package name then a dot then the object address location in memory
        System.out.println(bob); // prints campus.Student@7852e922 (for my system) 
        
        //create some classrooms to test the ClassRoom class
        ClassRoom ah208 = new ClassRoom("AH208", 24);
        System.out.println(ah208.getSeat(0)); //prints null since we have not put a Student obj at that seat yet
        
        ah208.setSeat(2, new Student("Tyler", 2345));
        ah208.setSeat(0, new Student("Steven", 5426));
        ah208.setSeat(3, new Student("Jane", 4545));
        ah208.setSeat(5, new Student("Harold", 9856));
        
        System.out.println(ah208.getSeat(0));  //this will print the place/address in memory of the Student object at seat pos 0
        System.out.println(ah208.getSeat(0).getName());  //this will print the student name
        System.out.println(ah208.getSeat(2).getName());  //this will print the student name
        System.out.println(ah208.getSeat(3).getName());  //this will print the student name
        System.out.println(ah208.getSeat(5).getName());  //this will print the student name
        
        //tests Building class
        Building jmhBuilding = new Building("JMH Building", 6);
        jmhBuilding.setClassRoom(0, createAH207());
        jmhBuilding.setClassRoom(1, ah208);
        
        System.out.println(jmhBuilding.getClassRoom("AH207"));
        //will print what classroom jimmybob is in
        System.out.println("Jimmybob is in: " + jmhBuilding.getClassRoom(new Student("Jimmybob", 3243)).getName());
        //will print what classroom tyler is in
        System.out.println("Tyler is in: " + jmhBuilding.getClassRoom(new Student("Tyler", 2345)).getName());
        
    }
    
    public static ClassRoom createAH207() {
        ClassRoom ah207 = new ClassRoom("AH207", 15);
        ah207.setSeat(0, new Student("Bob", 3423));
        ah207.setSeat(2, new Student("Jimmybob", 3243));
        ah207.setSeat(6, new Student("Amy", 3455));
        ah207.setSeat(1, new Student("Billy Bob", 3568));
        return ah207;
    }
    
}
