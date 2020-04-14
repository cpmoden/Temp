/*
 Your name: WRITE YOUR NAME HERE

Use this main class to test your code. Sample code has already been written.
 */

/**
 *
 * @author Moden
 */
public class Main {
    public static void main(String[] args){
        Registrar registrar = new Registrar();
        
        Student kevin = new Student("Kevin", 4.0);
        Student steve = new Student("Steve", 3.6);
        Student ryan = new Student("Ryan", 2.2);
        Student paul = new Student("Paul", 3.1);
        
        kevin.addCourses("Economics", "Psychology", "Calculus");
        steve.addCourses("Comparative Govt", "Geometry", "Physics");
        ryan.addCourses("Physics", "Economics", "Geometry");
        paul.addCourses("Psychology", "Biology", "Chemistry");
       
        registrar.addStudent(kevin);
        registrar.addStudent(steve);
        registrar.addStudent(ryan);
        registrar.addStudent(paul);
       
        registrar.printStudents();
        
        System.out.println(""); //Added for formatting
        
        //This should print out all registered courses 
        for (String s : registrar.getAllCourses()){
            System.out.print(s + " ");
        }
        //Output: Economics Psychology Calculus Comparative Govt Geometry Computer Science Biology Chemistry
        
        //Test for highest GPA
        System.out.println("\n" + registrar.getHighestGPA());
        //Output: Kevin
        
        //Test for Average GPA
        System.out.println(registrar.getAverageGPA());
        //Output: 3.225
        
        //Test for Adding Courses to all students
        registrar.addCoursesToAll("Computer Science");
        for (String s: kevin.getCourses()){
            System.out.print(s + " ");
        }
        //Output: Economics Psychology Calculus Computer Science
        System.out.println(""); //Added for formatting
        
        for (String s: ryan.getCourses()){
            System.out.print(s + " ");
        }
        //Output: Physics Economics Geometry Computer Science
        
        System.out.println(""); //Added for formatting
        
        //Test for setMaxSize method
        registrar.setMaxSize(3);        
        registrar.printStudents();
        //Output: Kevin Steven Ryan
       
        System.out.println(""); //Added for formatting
        
        registrar.addStudent(new Student("Chris", 1.1));
        registrar.printStudents();
        //Output Kevin Steven Ryan
        
        System.out.println(""); //Added for formatting
        
        
    }
    
    }
