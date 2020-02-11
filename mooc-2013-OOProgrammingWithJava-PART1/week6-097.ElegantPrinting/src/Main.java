
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++){
            if (i < length - 1){
                System.out.print(array[i] + ", ");

            }
            else {
                System.out.print(array[i]);
            }
            }
        
    }
}
