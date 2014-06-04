/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan
 */
import java.util.Scanner;

public class OddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner ( System.in );
        
        int x;//input number
        int divid;//remainder
        
        System.out.print("Enter a Number: ");//prompt for any number
        x = input.nextInt();//put the number in int x
        
        divid = x % 2;//do the math and put the remainder in divid
        
        if(divid > 0)
            System.out.println("The number is Odd");//if divid is greater print
        
        if(divid == 0)
            System.out.println("The number is Even");//if divid is equal print
        
    }
}
