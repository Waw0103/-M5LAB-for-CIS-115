/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m5lab2_whitt;
import java.util.Scanner;
/**
 *
 * @author whittw2071
 */
public class M5LAB2_Whitt {
    
    
    // PSV(Public static void) for greetUser
    public static void greetUser() {
        // ask for their name
        // say hi to them by name
        System.out.println("TODO: greet the user");
    }
    
    
    // PSV for doubleNumber() 
    public static void doubleNumber() {
        // ask for a number
        // double it
        // print that out
        System.out.println("TODO: double a number");
    }
    
    // PSV for takeTenPercent()
    public static void takeTenPercent() {
        // ask for a number
        // find out 10% of that number
        // print that value
        System.out.println("TODO: take 10%");
    }
    
    // PSV for grossPay()
    public static void grossPay(){
        // not sure where to start here
        System.out.println("TODO: FIgure out Gross Pay (???)");
        }
    // ^ grossPay is the end of the menu prompts
    
    
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

