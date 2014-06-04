 /**
 * @author Jordan
 * 300219995
 */

public class ChequeAccount extends BankAccount 
{ 
   private static double interestRate = 0.02; 
   private String design; 
   public ChequeAccount(String name, String design) 
   { 
      super(name); 
      this.design = design; 
   } 
   public double writeCheque(double amt) 
   { 
      if(amt > 0 && amt < balance)
    	  {
    	  	balance = balance - amt; 
    	  }
      return balance; 
   } 
   public String toString() 
   { 
      return super.toString() + "Type: Chequing\n"; 
   } 
   
   public String report()
   {
	   return "C" + accountNumber + ": $" + balance;
   }
}