/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jordan
 */
public class Employee 
{
    static String name;
    static double pay;
    static double newpay;
    static double percentR;
    
    public Employee( String namein, double payin, double percentRin)
    {
        name = namein;
        pay = payin;
        percentR = percentRin;
                
    }
    
    public void print()
    {
        System.out.printf("%s gets paid %.2f with an annual raise of %.2f\n\n",
                name , pay , percentR );
    }
    public void setName(String namein)
    {
        name = namein;
    }
    
    public void setPay(double payin)
    {
        pay = payin;
    }
    
    public void setPercentRaise(double percentin)
    {
        percentR = percentin /100;
    }
    
    public double getPercentRaise()
    {
        return percentR;
    }
    
    public void newPay()
    {
        newpay = pay * percentR;
        newpay = newpay + pay;
    }
    
    public double displayPay()
    {
        return newpay;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPay()
    {
        return pay;
    }
    
    public double getPercentR()
    {
            return percentR;    
    }
    
    /*public double convertP(String percent)
    {
        if ( !"10%".equals(percent) )
        {
            return .10;
        }
        
        if ( !"20%".equals(percent) )
        {
            return .20;
        }
        
        if ( !"30%".equals(percent) )
        {
            return .30;
        }
        if ( !"40%".equals(percent) )
        {
            return .40;
        }
        if ( !"50%".equals(percent) )
        {
            return .50;
        }
        if ( !"60%".equals(percent) )
        {
            return .60;
        }
        if ( !"70%".equals(percent) )
        {
            return .70;
        }
        if ( !"80%".equals(percent) )
        {
            return .80;
        }
        if ( !"90%".equals(percent) )
        {
            return .90;
        }
        if ( !"100%".equals(percent) )
        {
            return 1.00;
        }
        else 
            return 0.00;
           }
   */
}