import java.util.Scanner;
import java.util.ArrayList;
public class Payroll{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      ArrayList<Company> list = new ArrayList<Company>();
      String menu = "What do you want to do?: \n\t1  Create a new employee \n\t2  Set pay \n\t3  Show weekly pay \n\t4  Show annual pay \n\t5  Show Summary \n\t6  Quit \nEnter Option: ";
      System.out.print(menu);  
      int input = sc.nextInt();
      int employee = 0;
      sc.nextLine();
      while(input != 1 && input != 6){
         System.out.println("ERROR Please create an employee first");
         System.out.print(menu);
         input = sc.nextInt();
         sc.nextLine();
      }
      while(input != 6){
         while(input < 1 || input > 6){
            System.out.println("ERROR Bad option, please try again");
            System.out.print(menu);
            input = sc.nextInt();
            sc.nextLine();
         }
         if(list.size() > 1 && input != 1){
            System.out.print("Which employee (1 - " + list.size() +") do you wish to use? ");
            employee = sc.nextInt() - 1;
            sc.nextLine();
         }
         if(input == 1){
            System.out.print("What type of employee would you like to create(Enter 1/2)?\n[1 = Salaried, 2 = Hourly] ");
            int type = sc.nextInt();
            sc.nextLine();
            while(type != 1 && type != 2){
               System.out.println("ERROR Invalid input");
               System.out.print("What type of account would you like to create(Enter 1/2)?\n[1 = Savings, 2 = CD] ");
               type = sc.nextInt();
               sc.nextLine();
            }
            if(type == 1){
               System.out.print("Please enter the name: ");
               String name = sc.nextLine();
               System.out.print("Please enter the social security number: ");
               String ssn = sc.nextLine();
               System.out.print("Please enter the annual pay: ");
               double pay = sc.nextDouble();
               sc.nextLine();
               while(pay <= 0){
                  System.out.println("Invalid ammount, must be greater than 0.");
                  System.out.print("Please enter the annual pay: ");
                  pay = sc.nextDouble();
                  sc.nextLine();
               }
               list.add(new Salaried(name, ssn, pay));
               System.out.println("Employee " + list.size() + " has been created.");
            }
            else{
               System.out.print("Please enter the name: ");
               String name = sc.nextLine();
               System.out.print("Please enter the social security number: ");
               String ssn = sc.nextLine();
               System.out.print("Please enter the annual pay: ");
               double pay = sc.nextDouble();
               sc.nextLine();
               while(pay <= 0){
                  System.out.println("Invalid amount, must be greater than 0.");
                  System.out.print("Please enter the annual pay: ");
                  pay = sc.nextDouble();
                  sc.nextLine();
               }
               System.out.print("Please enter the average number of hours worked per week: ");
               double hours = sc.nextDouble();
               sc.nextLine();
               while(hours <= 15 || hours >= 60){
                  System.out.println("Invalid amount, must be between 15 and 60 exclusively.");
                  System.out.print("Please enter the average number of hours worked per week: ");
                  hours = sc.nextDouble();
                  sc.nextLine();
               }
               list.add(new Hourly(name, ssn, pay, hours));
               System.out.println("Employee " + list.size() + " has been created.");
            }
         }
         else if(input == 2){
            System.out.print("How much money would you like to set the annual pay to? ");
            double pay = sc.nextDouble();
            sc.nextLine();
            while(pay <= 0){
                  System.out.println("Invalid amount, must be greater than 0.");
                  System.out.print("How much money would you like to set the annual pay to? ");
                  pay = sc.nextDouble();
                  sc.nextLine();
            }
            list.get(employee).setPay(pay);
         }
         else if(input == 3){
            System.out.printf("%s %.2f", "The weekly pay is $", list.get(employee).calcWeeklyPay());
            System.out.println("");
         }
         else if(input == 4){
            System.out.printf("%s %.2f", "The annual pay is $", list.get(employee).calcAnnualPay());
            System.out.println("");
         }
         else if(input == 5){
            System.out.println(list.get(employee).toString());
         }
         System.out.print(menu);
         input = sc.nextInt();
         sc.nextLine();
      }
   }      
}