/* Name: Ellie Parobek
 * Course ISTE-120
 * HW: #2-2
 * Description: A class to test the BankAccount class
 */
public class BankTransactions
{  private BankAccount account1;
   private BankAccount account2;
   private BankAccount account3;
   public void run()
   {
       //Account 1 is Jim's savings with $0 initially
       account1 = new BankAccount("Jim's Savings");
       account1.deposit(3000);
       account1.printBalance();
       account1.printLineA();
       //Account 2 is Jim's Checking with $0 initially
       account2 = new BankAccount("Jim's Checking");
       account2.printBalance();
       account2.transfer(account1, 500);
       account2.printBalance();
       account2.withdraw(500);
       account2.printBalance();
       account1.printBalance();
       account1.printLineA();
       //Account 3 is Jen's Checking with $500 initially.
       account3 = new BankAccount("Jen's Checking", 500);
       account3.printBalance();
       account3.transfer(account1, 500);
       account3.printBalance();
       account3.withdraw(50);
       account3.printBalance();
       account3.printLineA();
       account1.printBalance();
       
       
       

   }
}
