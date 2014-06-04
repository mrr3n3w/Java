/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan
 */
import java.util.Scanner;

public class LargeSmall {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner( System.in );
        
        int x;//first number
        int y;//second number
        int z;//thrid number
        int a;//fourth number
        int b;//fifth number
      
        System.out.print("Enter First Number: ");
        x = input.nextInt();//put first number in x
        
        System.out.print("Enter Second Number: ");
        y = input.nextInt();//put second number in y 
        
        System.out.print("Enter Third Number: ");
        z = input.nextInt();//put third number in z
        
        System.out.print("Enter Fourth Number: ");
        a = input.nextInt();//put fourth number in a
        
        System.out.print("Enter Fifth Number: ");
        b = input.nextInt();//put fifth number in b
        
        if(x < y && x < z && x < a && x < b)
            System.out.printf("%d is the least, " , x); // print x if less than any other
        
        if(y < x && y < z && y < a && y < b)
            System.out.printf("%d is the least, ", y);//print y if less than any other
        
        if(z < x && z < y && z < a && z < b)
            System.out.printf("%d is the least, ", z);//print if z is less than any other
        
        if(a < x && a < z && a < y && a < b)
            System.out.printf("%d is the least, ", a); // print a if less than any other
        
        if(b < x && b < a && b < y && b < z)
            System.out.printf("%d is the least, ", b); // print if b less than any other

        if(x > y && x > z && x > a && x > b)
            System.out.printf("%d is the greatest\n ", x);// print x if greatest
        
        if(b > x && b > a && b > y && b > z)
            System.out.printf("%d is the greatest\n" , b); //print if b is greatest
        
        if(y > x && y > z && y > a && y > b)
            System.out.printf("%d is the greatest\n " , y);//print y if greatest
        
        if(z > x && z > y && z > a && z > b)
            System.out.printf("%d is the greatest\n", z); //print if z is the greatest
        
        if(a > x && a < z && a < y && a < b)
            System.out.printf("%d is the greatest\n" , a); //print a if greatest
        
        
    }
}
