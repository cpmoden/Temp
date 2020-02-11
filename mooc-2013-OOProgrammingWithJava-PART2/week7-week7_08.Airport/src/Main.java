import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = "";
        while (!input.equals("x")){
            System.out.println("Airport Panel");
            System.out.println("--------------------");

            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");
            System.out.print("> ");
            input = reader.nextLine();

            if (input.equals("1")){
                addPlane();
            }
            else if (input.equals("2")){

            }
        }
        
            
        
    }
    public static void addPlane(){
        
    }
    
}
