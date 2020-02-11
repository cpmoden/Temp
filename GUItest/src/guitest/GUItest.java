/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;
import javax.swing.JFrame;



/**
 *
 * @author Moden
 */
public class GUItest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Other test = new Other();
        
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(350, 100);
        test.setVisible(true);
        
    }
    
}
