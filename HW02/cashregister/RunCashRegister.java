/* Name: Ellie Parobek
 * Course: ISTE-120 
 * HW: #2-1
 * Description: A class to test the CashRegister class
 */
public class RunCashRegister
{  
   private CashRegister customer1;
   private CashRegister customer2;
   public void run()
   {
     //Customer 1 who bought 2 items $49.95 and $20.40 and 
     //paid $80.
     customer1 = new CashRegister();
     customer1.recordPurchase(49.95);
     customer1.recordPurchase(20.40);
     customer1.enterPayment(80);
     customer1.printReceipt();
     //Customer 2 who bought 3 items $99.95, $35.15, and 
     //$50.00 and paid $180.
     customer2 = new CashRegister();
     customer2.recordPurchase(99.95);
     customer2.recordPurchase(35.15);
     customer2.recordPurchase(50.00);
     customer2.enterPayment(180);
     customer2.printReceipt();
     
   }
}
