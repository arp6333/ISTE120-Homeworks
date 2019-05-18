/**
* Ellie Parobek
* ISTE 120 - HW12
* Cd1Yr class which extends Account class to manage CD accounts.
*/

public class Cd1Yr extends Account{
   // Constants for term and rate.
   private int TERM = 12;
   private double RATE = 3.5;
   
   /**
   * Increase balance by amount specified.
   * @param: amt - the amount to increase balance by.
   */
   public void deposit(int amt){
      super.deposit(amt);
   }
   
   /**
   * Reduce balance by amount specified, and return the new amount.
   * @param: amt - amount to reduce balance by.
   * @return: amount - new amount from balance.
   */
   public double withdraw(double amt){
      double amount = super.withdraw(amt);
      return amount;
   }
   
   /**
   * Get the current account balance without interest.
   * @return: balance - current account balance.
   */
   public double getBalance(){
      double balance = super.getBalance();
      return balance;
   }
   
   /**
   * Calculate and return the total interest compounded monthly.
   * @return: interest - getBalance() - the interest to be paid.
   */
   public double calcInterest(){
      // Calculate the account with interest.
      double interest = getBalance() * Math.pow((1 + ((RATE/100)/12)), 12);
      // Subtract account with interest from account without interest for interest to be paid.
      return interest - getBalance();
   }
   
   /**
   * Creates a formatted string output summary.
   * @return: text - formated summary.
   */
   public String toString(){
      // Formated string output.
      String text = String.format("%-20s %s \n%-20s %s \n%-20s %s \n%-20s $s %.2f \n%-20s %s","Investment type:", "CD 1 Yr", "Held By:", BANK_NAME, "", BANK_ADDRESS, "Balance:", "$", getBalance(), "Annual Int. Rate:", RATE + "%"); 
      return text;
   }
}