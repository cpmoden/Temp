/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author Moden
 */
public class Student {
    private String name;
    private double gpa;
    private ArrayList<String> courses;
   
    
    public Student(String nm, double gpa){
        name = nm;
        this.gpa = gpa;
        courses = new ArrayList<String>();
        
    }
    
    public Student (){
        name = "";
        gpa = 0;
        courses = new ArrayList<String>();
    }
    
    public void setGPA(double g){
        gpa = g;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<String> getCourses(){
        return courses;
    }
    
    //This is used to add 3 courses
    //This is arbitrary but could be possible when students are first creating their schedules
    public void addCourses(String c1, String c2, String c3){
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
    }
    
    //This is used to add 1 course
    //For example if students want to modify their schedule
    public void addCourses(String c){
        courses.add(c);
    }
    
    
}
