/*
 * Put your name here: YOUR NAME HERE
 */


import java.util.*;

/**
 *
 *
 */


public class Registrar {
    //These are the only variables you need. Do not add any variables here.
    private ArrayList<Student> registrar;
    private int maxSize;

    //Complete this constructor, where maxSize is defaulted to 10
    public Registrar() {
        maxSize 
        registrar = new ArrayList<Student>();
    }

    //Complete this constructor, where maxSize is defined by the user when creating a Registrar object
    public Registrar(int s) {
        maxSize 
        registrar = new ArrayList<Student>();
    }

    //set the maximum number of students that can be registered.
    //if current enrolled size is greater than new max size, remove the students who were added last
    //For example, if 3 students are enrolled but the max size is changed to 2 then the last student added should be removed
    public void setMaxSize(int size) {
        
    }

    //Returns the average GPA of all students saved in the registrar
    public double getAverageGPA() {
        
    }
  
    //Returns the name of the student with the highest GPA
    public String getHighestGPA() {
        
    }

    //Returns  the lowest GPA
    public double getLowestGPA() {
        
    }
    
    //This returns an ArrayList of all the courses that students are enrolled in 
    //There should be no repeats! If two students are both enrolled in the same course, the course should appear once in the ArrayList
    public ArrayList<String> getAllCourses() {
        
    }
    //Adds a course to all students stored within the registrar list
    public void addCoursesToAll(String course) {
        
    }

    //Adds student to the registrar list if there is room
    public void addStudent(Student s) {
        
    }

    //Prints all students in the registrar
    public void printStudents() {
        
    }
}
