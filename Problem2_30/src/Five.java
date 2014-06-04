//300219995
//Jordan Rowe


import java.util.Scanner;
   

public class Five{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int inputnumber; //5 digit number
        int a;// ten thousand column
        int b;// thousand column
        int c;// hundreds column
        int d;// tens column
        int e;//ones column
        int divid;//number less the last
        
        System.out.println("Enter a 5 digit number:");//asking for the number
        inputnumber = input.nextInt();

        e = inputnumber % 10;
        divid = inputnumber /10;
        
        d = divid % 10;
        divid = divid / 10;
        
        c = divid % 10;
        divid = divid / 10;
        
        b = divid % 10;
        divid = divid /10;
        
        a = divid % 10;
        
        
        
        System.out.printf("%d   %d   %d   %d   %d", a , b , c, d, e);
        
        
                
        
    }
}
