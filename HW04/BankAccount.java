/**
 *  A bank account has a balance that can be changed by 
 *  deposits and withdrawals.
 *
 * @author Ellie Parobek
 * @version 2135
*/
public class BankAccount   //Student Starter File
{  
   private double balance;
   private double fee;
   private int freeTransactions;
   private int transactions;

  /**
   * Constructs a bank account with a zero balance
   */
   public BankAccount()
   {   
      balance = 0;
      fee = 0;
      freeTransactions = 0;
      transactions = 0;
   }

  /**
   * Constructs a bank account with a given balance
   * @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }
   
   /**
   * Set the transaction fee.
   * @param f - the transaction fee
   */
   public void setTransFee(double f){
      fee = f;
   }
   
   /**
   * Set the number of free transactions.
   * @param trans - the number of free transactions
   */
   public void setNumFreeTrans(int trans){
      freeTransactions = trans;
   }
   
   /**
   * Deduct monthly charge from balance based on number of free transactions left.
   */
   public void deductMonthlyCharge(){
      balance = balance - (Math.max(transactions, freeTransactions) - freeTransactions) * fee;
      transactions = 0;
   }
   
  /**
   * Deposits money into the bank account.
   * @param amount the amount to deposit
   */
   public void deposit(double amount)
   {  
      double newBalance = balance + amount;
      balance = newBalance;
      transactions ++;
   }

   /**
   * Withdraws money from the bank account.
   * @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {   
      double newBalance = balance - amount;
      balance = newBalance;
      transactions ++;
   }

  /**
   * Gets the current balance of the bank account.
   * @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}