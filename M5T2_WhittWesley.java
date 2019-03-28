/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m5t2_whittwesley;

/**
 *
 * @author whittw2071
 */
import java.util.Scanner;
public class M5T2_WhittWesley {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // This program will say hello to the user
        System.out.println("Hello");
        
        
       // Then ask for their name
        String name;
        Scanner keyb = new Scanner (System.in);
        System.out.println("What's your name? ");
        name = keyb.next();
        
        
        //Then ask for their age
        System.out.println("How old are you?");
        int age = keyb.nextInt();
        
        //Finally, it will repeat those back
        System.out.println("Nice to meet you, " + name);
        System.out.println("I'm much younger than " + age);
        
        
        
        
        
    }
    
}
