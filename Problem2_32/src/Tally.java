//300219995
//Jordan Rowe

import java.util.Scanner;


public class Tally {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        int c;
        int d;
        int e;
        int countpos = 0;
        int countneg = 0;
        int countzer = 0;
        
        System.out.println("Enter an Integer: ");
        a = input.nextInt();
        
        System.out.println("Enter an Integer: ");
        b = input.nextInt();
        
        System.out.println("Enter an Integer: ");
        c = input.nextInt();
        
        System.out.println("Enter an Integer: ");
        d = input.nextInt();
        
        System.out.println("Enter an Integer: ");
        e = input.nextInt();
        
        if(a < 0){
            countneg++;
        }
        if (a >= 1){
            countpos++;
        }
        if (a == 0){
            countzer++;
        }
        
        if(b < 0){
            countneg++;
        }
        if (b >= 1){
            countpos++;
        }
        if (b == 0){
            countzer++;
        }
        
        if(c < 0){
            countneg++;
        }
        if (c >= 1){
            countpos++;
        }
        if (c == 0){
            countzer++;
        }
        
        if(d < 0){
            countneg++;
        }
        if (d >= 1){
            countpos++;
        }
        if (d == 0){
            countzer++;
        }
        if(e < 0){
            countneg++;
        }
        if (e >= 1){
            countpos++;
        }
        if (e == 0){
            countzer++;
        }
        
        System.out.printf("There are %d positive(s)\nThere are %d negitive(s)"
                + "\nAnd there are %d zero(s)\n"
                ,countpos , countneg , countzer);
        
        }

    }