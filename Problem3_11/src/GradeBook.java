/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan
 */
public class GradeBook
{
   private String courseName;
   private String instructorName;// course name for this GradeBook

   // constructor initializes courseName with String argument
   public GradeBook( String name , String instructor ) // constructor name is class name
   {
      courseName = name;
      instructorName = instructor;
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
	  } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   public void setInstructorName ( String instructor )
   {
       instructorName = instructor; 
   }
   public String getInstructorName ()
   {
       return instructorName;
   }
   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\nThis course is Presented by: %s!\n", 
         getCourseName() , getInstructorName() );
   } // end method displayMessage
} // end class GradeBook