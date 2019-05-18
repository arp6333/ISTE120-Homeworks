import java.util.Scanner;
import java.util.ArrayList;
public class AccountTest{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      ArrayList<Account> list = new ArrayList<Account>();
      String menu = "What do you want to do?: \n\t1  Create a new account \n\t2  Deposit funds \n\t3  Withdraw funds \n\t4  Show Balance \n\t5  Show Interest \n\t6  Show Summary \n\t7  Quit \nEnter Option: ";
      System.out.print(menu);  
      int input = sc.nextInt();
      int account = 0;
      sc.nextLine();
      while(input != 1 && input != 7){
         System.out.println("ERROR Please creat an account first");
         System.out.print(menu);
         input = sc.nextInt();
         sc.nextLine();
      }
      while(input != 7){
         while(input < 1 || input > 7){
            System.out.println("ERROR Bad data entry");
            System.out.print(menu);
            input = sc.nextInt();
            sc.nextLine();
         }
         if(list.size() > 1 && input != 1 && input != 6){
            System.out.print("Which account (1 - " + list.size() +") would you like to access? ");
            account = sc.nextInt() - 1;
            sc.nextLine();
         }
         if(input == 1){
            System.out.print("What type of account would you like to create(Enter 1/2)?\n[1 = Savings, 2 = CD] ");
            int type = sc.nextInt();
            sc.nextLine();
            while(type != 1 && type != 2){
               System.out.println("ERROR Invalid input");
               System.out.print("What type of account would you like to create(Enter 1/2)?\n[1 = Savings, 2 = CD] ");
               type = sc.nextInt();
               sc.nextLine();
            }
            if(type == 1){
               list.add(new Savings());
               System.out.println("Account " + list.size() + " has been created.");
            }
            else{
               list.add(new Cd1Yr());
               System.out.println("Account " + list.size() + " has been created.");
            }
         }
         else if(input == 2){
            System.out.print("How much money would you like to deposit? ");
            int deposit = sc.nextInt();
            sc.nextLine();
            list.get(account).deposit(deposit);
         }
         else if(input == 3){
            System.out.print("How much money would you like to withdraw? ");
            int withdraw = sc.nextInt();
            sc.nextLine();
            list.get(account).withdraw(withdraw);
         }
         else if(input == 4){
            System.out.printf("The balance is $%.2f\n", list.get(account).getBalance());
         }
         else if(input == 5){
            System.out.printf("The interest is $%.2f\n", list.get(account).calcInterest());
         }
         else if(input == 6){
            for(int i = 0; i < list.size(); i++){
               System.out.println(list.get(i).toString());
               System.out.println("");
            }
         }
         System.out.print(menu);
         input = sc.nextInt();
         sc.nextLine();
      }
   }
}