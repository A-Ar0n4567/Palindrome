/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome;

/**
 *
 * @author aamir7110
 */
import java.util.ArrayList;
import javax.swing.*;

public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame;
        
        String input;
        String revString;
        String output;
        
        frame = new JFrame();
        
        ArrayList<Character> characters = new ArrayList<Character>();
        
        ArrayList<Character> reverse = new ArrayList<Character>();
        
        input = JOptionPane.showInputDialog("Enter A Word To Determine If It Is A Palindrome");
        
        for(int i = 0; i<input.length(); i++){
            
            characters.add(input.charAt(i));
        }
        
        for(int i = characters.size()-1; i>=0;i--){
            reverse.add(characters.get(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(Character ch:reverse){
            sb.append(ch);
        }
        revString = sb.toString();
        
        if(input.equals(revString)){
            JOptionPane.showMessageDialog(frame, "This is a palindrome");
            System.out.println("This is a palindrome");
        }else{
            JOptionPane.showMessageDialog(frame, "This is not a palindrome");
            System.out.println("This is not a palindrome");
        }
    }
}
