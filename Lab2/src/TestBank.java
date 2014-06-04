/**
 * 
 */

/**
 * @author Jordan
 * 300219995
 */
public class TestBank 
{ 
   public static void main(String[] args) 
   { 
      BankAccount ba1 = new ChequeAccount("Jack Black", "Hockey"); 
      ChequeAccount ca1 = new ChequeAccount("Chris Weidman", "Bunnies"); 
      ChequeAccount ca2 = new ChequeAccount("Ross Geller", "Dinosaurs");

      ba1.deposit(100); 
      ((ChequeAccount)ba1).writeCheque(23);

      SavingsAccount sa1 = new SavingsAccount("David Letterman"); 
      SavingsAccount sa2 = new SavingsAccount("Jimmy Fallon"); 
      sa1.deposit(25); 
      System.out.println("" + ba1 + ca1 + ca2 + sa1 + sa2);

      BalancePrinter bp = new BalancePrinter(); 
      bp.reportPrinter(ba1); 
      bp.reportPrinter(ca1); 
      bp.reportPrinter(ca2); 
      bp.reportPrinter(sa1); 
      bp.reportPrinter(sa2); 
   } // main 
} // TestBank class