/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_loop;

import java.util.Scanner;

/**
 *
 * @author M1902580
 */
public class While_Loop {

    static Scanner Fred = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Answer1 = "";
        String Answer2 = "";
        String Answer3 = "";
        String answer1 = "middlesbrough";
        String answer2 = "libby";
        String answer3 = "lemontop";

        
        while(!answer1.equals(Answer1)) {
            System.out.println("Who are the best football team?");
            Answer1 = Fred.next().toLowerCase();
            
            
        }
        
        while(!answer2.equals(Answer2)) {
            System.out.println("Who is my bestie?");
            Answer2 = Fred.next().toLowerCase();
            
            
        }
        
        while(!answer3.equals(Answer3)) {
            System.out.println("What is my favorite type of Ice-cream?");
            Answer3 = Fred.next().toLowerCase();
            
            
        }
        

    }

}
