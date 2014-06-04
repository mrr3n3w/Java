//300219995
//Jordan Rowe

import java.util.Scanner;

public class GradeBookTest
{
   // main method begins program execution
   public static void main( String[] args )
   {
       
       Scanner input = new Scanner(System.in);

      GradeBook gradeBook1 = new GradeBook( 
        "COSC 101" , "Alan Kennedy" ); 
      GradeBook gradeBook2 = new GradeBook( 
        "COSC 102" , "Resa Abbasi");

       
       gradeBook1.displayMessage();
       gradeBook2.displayMessage();
       
       System.out.println();
              
       
       
       System.out.println("Enter Name For First Gradebook:");
       String book1 = input.nextLine();
       gradeBook1.setCourseName(book1);
       
       System.out.printf("Enter Name For Teacher of %s: ", book1);
       String teach1 = input.nextLine();
       gradeBook1.setInstructorName(teach1);
       
       System.out.println("Enter Name For Second Gradebook:");
       String book2 = input.nextLine();
       gradeBook2.setCourseName(book2);
       
       System.out.printf("Enter Name For Teacher of %s:", book2);
       String teach2 = input.nextLine();
       gradeBook2.setInstructorName(teach2);


       gradeBook1.displayMessage();
       gradeBook2.displayMessage();
       
   } // end main
} // end class GradeBookTest