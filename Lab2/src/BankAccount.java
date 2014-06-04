/**
 * @author Jordan
 * 300219995
 */

public class BankAccount implements BalanceReportable
{ 
   protected int accountNumber; 
   protected double balance; 
   protected String name; 
   private static int count = 0; 
   private static int newAccountNo = 1000001; 
   public BankAccount(String name) 
   { 
      this.name = name; 
      balance = 0.0; 
      count++; 
      setAccountNo(); 
   } 
   public int getAccountNumber() 
   { 
	   return accountNumber; 
   } 
   public String getName() 
   { 
	   return name; 
   } 
   public double getBalance() 
   { 
	   return balance; 
   } 
   private void setAccountNo() 
   { 
      accountNumber = newAccountNo; 
      newAccountNo += (int)(Math.random()*89)+10; 
   } 
   public double deposit(double amt) 
   { 
      if(amt > 0) 
      { 
    	  balance = balance + amt; 
      }
      return balance; 
   } 
   public double withdraw(double amt) 
   { 
      if(amt > 0 && amt < balance) 
    	  {
    	  	balance = balance - amt; 
    	  }
      return balance; 
   } 
   public String toString() 
   { 
      return "\nAccount: " + name + ", " + accountNumber + 
             "\nBalance: " + balance + "\n"; 
   } 
   public String report()
   {
	   return null;
   }
}

