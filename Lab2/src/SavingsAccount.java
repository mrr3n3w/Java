/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class SavingsAccount extends BankAccount 
{ 
   private static double interestRate = 0.04; 
   public SavingsAccount(String name) 
   { 
      super(name); 
   } 
   public String toString() 
   { 
	      return super.toString() + "Type: Savings\n"; 
   }
   public String report()
   {
	   return "S" + accountNumber + ": $" + balance;
   }
}