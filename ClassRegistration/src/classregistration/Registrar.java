/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * 
 */
public class Registrar {
    private ArrayList<Student> registrar;
    private int maxSize;
    
    //Complete this constructor, where maxSize is defaulted to 10
    public Registrar(){ 
        maxSize = 10;
        registrar = new ArrayList<Student>();
    }
    
    //Complete this constructor, where maxSize is defined by the user when creating a Registrar object
    public Registrar(int s){ 
        maxSize = s;
        registrar = new ArrayList<Student>();
    }
    
    //set the maximum number of students that can be registered.
    //if current enrolled size is greater than new max size, remove the students who were added last
    //For example, if 3 students are enrolled but the max size is changed to 2 then the last student added should be removed
    public void setMaxSize(int size){ 
        maxSize = size;
        while (registrar.size() > maxSize){
            registrar.remove(registrar.size() - 1);
        }
    }
    
    //Returns the average GPA of all students saved in the registrar
    public double getAverageGPA(){
        double averageGPA = 0;
        for (Student s : registrar){
            averageGPA += s.getGPA();
        }
        averageGPA /= registrar.size();
        return averageGPA;
    }
    
    //This returns an ArrayList of all the courses that students are enrolled in 
    //There should be no repeats! If two students are both enrolled in the same course, the course should appear once in the ArrayList
    public ArrayList<String> getAllCourses(){ 
        ArrayList<String> courses = new ArrayList<String>();
        for (Student s: registrar){
            for (String t : s.getCourses()){
                if (!courses.contains(t)){
                    courses.add(t);
                }                                
            }                        
        }
        return courses;
    }
    
    //Returns the name of the student with the highest GPA
    public String getHighestGPA(){ 
        double highGPA = registrar.get(0).getGPA();
        String highGPAName = registrar.get(0).getName();
        for (Student s : registrar){
            if (s.getGPA() > highGPA){
                highGPA = s.getGPA();
                highGPAName = s.getName();
            }
        }
        return highGPAName;
    }
    
    //Returns  the lowest GPA
    public double getLowestGPA(){
        double lowestGPA = 0;
        for (Student s: registrar){
            if(s.getGPA() < lowestGPA){
                lowestGPA = s.getGPA();
            }
        }
        return lowestGPA;   
    }
    //Adds a course to all students stored within the registrar list
    public void addCoursesToAll(String course){
        for (Student s : registrar){
            s.addCourses(course);
        }
        
    }
    
    //Adds student to the registrar list if there is room
    public void addStudent(Student s){ 
        if(registrar.size() < maxSize - 1){
            registrar.add(s);
        }        
    }
    
    public void printStudents(){
        for (Student s : registrar){
            System.out.print(s.getName() + " ");
        }
    }
}
