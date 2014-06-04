//300219995
//Jordan Rowe

import java.util.Scanner;
        
public class EmployeeTest {


    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        Employee employee1 = new Employee("Name", 0.00 , 0.00);
        
        String namein;
        //String percent;
        double amount;
        
        employee1.print();
        
        System.out.println("Please Enter Employee name: ");
        namein = input.nextLine();
        employee1.setName(namein);
        
        System.out.print("Thank You!\n");
        System.out.printf("The Name Entered is: %s\n\n",
                employee1.getName());
        
        System.out.print("Please Enter A Pay Amount:$");
        amount = input.nextDouble();
        employee1.setPay(amount);
        
        System.out.print("Thank You!\n");
        System.out.printf("The Amount Entered is:$%.2f\n",
                employee1.getPay());
        
        System.out.print("How much is his/her raise\n");
        System.out.print("Please Just enter Digits: ");
        amount = input.nextDouble();
        employee1.setPercentRaise(amount);
        
        System.out.print("Thank You!\n");
        
        employee1.newPay();
        System.out.printf("The New Amount paid to %s is $%.2f\n", 
                employee1.getName(),
                employee1.displayPay());
        
        
        
        
    }

}
