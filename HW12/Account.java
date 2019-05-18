/**
 * HW #12 Problem #1 Abstract Class
 * Student Starter File
 */

public abstract class Account
{
// attributes
   private double balance;
   public static final String BANK_NAME = "First Rochester Bank";
   public static final String BANK_ADDRESS = "Rochester, NY";

/** Default constructor
 * @param amnt
 */
   public Account() {
      balance = 0;
   }

/** 
 * deposit method
 * @param amnt amount deposited
 */
   public void deposit(double amt) {
      balance += amt;
   }

 /** method to decrease account balance
 * Withdraw method
 * @param amnt amount to be withdrawn
 * @return amount new balance value
 */
   public double withdraw(double amt) {
      balance -= amt;
      return amt;
   }

/**
 * getBalance method
 * @return balance access balance value (not including interest)
 */
   public double getBalance() {
      return balance;
   }

/** 
 * abstract calcInterest method 
 * @return interest calculation of interest (account type dependent)
 */
   public abstract double calcInterest();
}

