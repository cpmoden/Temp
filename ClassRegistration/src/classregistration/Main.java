/*
 Your name: WRITE YOUR NAME HERE

Use this main class to test your code. Some sample code has already been written.
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
        Student jacob = new Student("Jacob", 3.6);
        Student albert = new Student("Albert", 2.6);
        Student roger = new Student("Roger", 5.2);
        Student alvin = new Student("Alvin", 1.1);

      
        
        kevin.addCourses("Economics", "Psychology", "Calculus");
        steve.addCourses("Comparative Govt", "Geometry", "Physics");
        ryan.addCourses("Physics", "Economics", "Geometry");
        paul.addCourses("Psychology", "Biology", "Chemistry");
        
        jacob.addCourses("Chemistry", "Psychology", "Physics");
        albert.addCourses("Economics", "Geometry", "Economics");
        roger.addCourses("Comparative Govt", "Calculus", "Geometry");
        alvin.addCourses("Geometry", "Psychology", "Physics");
        
        
        
       
        registrar.addStudent(kevin);
        registrar.addStudent(steve);
        registrar.addStudent(ryan);
        registrar.addStudent(paul);
        registrar.addStudent(jacob);
        registrar.addStudent(albert);
        registrar.addStudent(roger);
        registrar.addStudent(alvin);

        System.out.print("Student output; ");
        registrar.printStudents();
        System.out.println("\nExpected output: Kevin Steve Ryan Paul Jacob Albert Roger Alvin");
        
        
        System.out.println(""); //Added for formatting
        System.out.print("Student output: ");
        //This should print out all registered courses 
        for (String s : registrar.getAllCourses()){
            System.out.print(s + " ");
        }
        System.out.println("\nOutput: Economics Psychology Calculus Comparative Govt Geometry Computer Science Biology Chemistry");
        
        //Test for highest GPA
        System.out.print("\nStudent response: " + registrar.getHighestGPA());
        System.out.println("\nExpected output: " + "Roger");
        
        //Test for Average GPA
        System.out.println("\nStudent output: " + registrar.getAverageGPA());
        System.out.println("Expected Output: 3.175\n");
        
        //Test for Adding Courses to all students
        registrar.addCoursesToAll("Computer Science");
        
        System.out.print("Student output: ");
        for (String s: kevin.getCourses()){
            System.out.print(s + " ");
        }
        
        System.out.println("\nOutput: Economics Psychology Calculus Computer Science\n"); //Added for formatting
        
        System.out.print("Student output: ");
        for (String s: ryan.getCourses()){
            System.out.print(s + " ");
        }
        System.out.println("\nExpected output: Physics Economics Geometry Computer Science");
        
        System.out.println(""); //Added for formatting
        
        //Test for setMaxSize method
        registrar.setMaxSize(5);        
        System.out.print("Student output: ");
        registrar.printStudents();
        System.out.println("\nExpect output: Kevin Steven Ryan Paul Jacob");
       
        
        System.out.print("\nStudent output: " + registrar.getHighestGPA());
        System.out.println("\nShould be: " + "Kevin");
        
        System.out.println(""); //Added for formatting
        
        registrar.addStudent(new Student("Chris", 1.1));
        System.out.print("Student output: ");
        registrar.printStudents();
        
        System.out.println("\nExpect output: Kevin Steven Ryan Paul Jacob");
        
        System.out.println(""); //Added for formatting
        
        
    }
    
    }
