/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m5t3_whittwesley;

import java.util.Scanner;
/**
 *
 * @author whittw2071
 */

public class M5T3_WhittWesley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showMenu();
        // Get number
        int menu = getInt();
       
    }
   
    public static void showMenu(){
        System.out.println("Enter a number");
        System.out.println( "1.Greetings" );
        System.out.println( "2.Double a number" );
        System.out.println("3.Take 10%" );
        System.out.println("4.Gross pay" );
        System.out.println("5.Exit" );
     
    }
    public static int getInt() {
        int num;
        // get number here
        Scanner keyb = new Scanner (System.in);
        num =keyb.nextInt();
     
        
        
        
        return num;
        
    }
            
}
