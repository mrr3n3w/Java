/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan
 */
public class Date {
    
   int day;
   int month;
   int year;
    
    public Date(int dayin, int monthin, int yearin)
    {
        day = dayin;
        month = monthin;
        year = yearin;
    }
    
    public void printDate()
    {
        System.out.printf("Todays Date is %d//%d//%d\n",
                getYear(), getMonth(), getDay() );
    }
    public void setDay(int dayin)
    {
        day = dayin;   
    }
    public void setMonth(int monthin)
    {
        month = monthin;
    }
    public void setYear(int yearIn)
    {
        year = yearIn;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }

    
}
