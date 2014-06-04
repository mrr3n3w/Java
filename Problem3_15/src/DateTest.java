//300219995
//Jordan Rowe


import java.util.Scanner;

public class DateTest {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date date1 = new Date( 2013 , 10 , 02);
        int date;
        
               
        date1.printDate();
        System.out.print("Please enter digits only\n");
        System.out.print("What day is it: ");
        date = input.nextInt();
        date1.setDay(date);
        
        System.out.print("Thank You\n");
        System.out.print("What month is it: ");
        date = input.nextInt();
        date1.setMonth(date);
        
        System.out.print("Thank You\n");
        System.out.print("What year is it:");
        date = input.nextInt();
        date1.setYear(date);
        
        System.out.print("Thank You\n");
        
        System.out.printf("The current Date is %d//%d//%d", 
                date1.getDay(), 
                date1.getMonth(), 
                date1.getYear());
        
    
    
    
    }

}
