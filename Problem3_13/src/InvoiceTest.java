//300219995
//Jordan Rowe

import java.util.Scanner;
        
public  class InvoiceTest {

    
    public static void main(String[] args) 
    {
        

     Scanner input = new Scanner(System.in);
     Invoice invoice1 = new Invoice("P001" , "Name" , 0.00 , 0 );

     
     invoice1.printInvoice();
     
     System.out.print("Enter a part number:");
     String name = input.nextLine();
     invoice1.setPartN(name);
     
     System.out.print("Enter a part discription:");
     String descrip = input.nextLine();
     invoice1.setPartD(descrip);
     
     System.out.print("Enter an amount of units: ");
     int units = input.nextInt();
     invoice1.setUnits(units);
     
     System.out.print("Enter a cost per unit:");
     double pricePer = input.nextDouble();
     invoice1.setCost(pricePer);
     
     invoice1.printInvoice();
     
    }
}

