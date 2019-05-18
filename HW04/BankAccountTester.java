/**
 *  A bank account tester class.
 *
 * @author Ellie Parobek
 * @version 9/27/17
*/
public class BankAccountTester{  
   public static void main(String args[]){
      System.out.println("Set up new account with $1000, 5 free transactions and $2 per transaction above 5");
      BankAccount acc = new BankAccount(1000.00);
      acc.setTransFee(2.00);
      acc.setNumFreeTrans(5);
      
      System.out.println("Starting Balance: " + acc.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200 - 4 transactions");
      acc.deposit(1000);
      acc.withdraw(500);
      acc.withdraw(400);
      acc.deposit(200);
      System.out.println("Balance: " + acc.getBalance());
      System.out.println("Expected: 1300.0");
      System.out.println("Apply Monthly Charge");
      acc.deductMonthlyCharge();
      System.out.println("Ending Balance Month 1: " + acc.getBalance());
      System.out.println("Expected: 1300.0");
      System.out.println("");
    
      System.out.println("Starting Balance: " + acc.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500 - 5 transactions");
      acc.deposit(1000);
      acc.withdraw(500);
      acc.withdraw(400);
      acc.deposit(200);
      acc.deposit(500);
      System.out.println("Balance: " + acc.getBalance());
      System.out.println("Expected: 2100.0");
      System.out.println("Apply Monthly Charge");
      acc.deductMonthlyCharge();
      System.out.println("Ending Balance Month 1: " + acc.getBalance());
      System.out.println("Expected: 2100.0");
      System.out.println("");
      
      System.out.println("Starting Balance: " + acc.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000 - 6 transactions");
      acc.deposit(1000);
      acc.withdraw(500);
      acc.withdraw(400);
      acc.deposit(200);
      acc.deposit(500);
      acc.withdraw(1000);
      System.out.println("Balance: " + acc.getBalance());
      System.out.println("Expected: 1900.0");
      System.out.println("Apply Monthly Charge");
      acc.deductMonthlyCharge();
      System.out.println("Ending Balance Month 1: " + acc.getBalance());
      System.out.println("Expected: 1898.0");
      System.out.println("");
      
      System.out.println("Starting Balance: " + acc.getBalance());
      System.out.println("deposit 1000, withdraw 500, withdraw 400, deposit 200, deposit 500, withdraw 1000, deposit 100 - 7 transactions");
      acc.deposit(1000);
      acc.withdraw(500);
      acc.withdraw(400);
      acc.deposit(200);
      acc.deposit(500);
      acc.withdraw(1000);
      acc.deposit(100);
      System.out.println("Balance: " + acc.getBalance());
      System.out.println("Expected: 1798.0");
      System.out.println("Apply Monthly Charge");
      acc.deductMonthlyCharge();
      System.out.println("Ending Balance Month 1: " + acc.getBalance());
      System.out.println("Expected: 1794.0");
   }
}