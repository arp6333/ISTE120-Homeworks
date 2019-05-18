import java.util.Scanner;
/*
* Ellie Parobek
* HW07
* Class HowHealthy prints information based on scanned user input using the Healthy class.
*/
public class HowHealthy{
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     char answer = 0;
     String name = "";
     char gender = 0;
     double weight = 0;
     double height = 0;
     int age = 0;
     int activity = 0;
     do{
        // Create new Healthy object 'user'.
        Healthy user = new Healthy();
        // Get users name.
        System.out.print("Person's name: ");
        name = sc.nextLine();
        // Check for valid input.
        while(user.setName(name) == false){
           System.out.println("Invalid name: must be at least one character.");
           System.out.print("Person's name: ");
           name = sc.nextLine();
        }
        user.setName(name);
        // Get users gender.
        System.out.print(name + ", are you male or female (M/F): ");
        gender = sc.next().charAt(0);
        // Check for valid input.
        while(user.setGender(gender) == false){
           System.out.println("Invalid gender: must be M or F (uppercase or lowercase).");
           System.out.print(name + ", are you male or female (M/F): ");
           gender = sc.next().charAt(0);
        }
        user.setGender(gender);
        // Get users weight in pounds.
        System.out.print(name + "'s weight (pounds): ");
        weight = sc.nextDouble();
        // Check for valid input.
        while(user.setWeight(weight) == false){
           System.out.println("Invalid weight: must be at least 100 pounds.");
           System.out.print(name + "'s weight (pounds): ");
           weight = sc.nextDouble();
        }
        user.setWeight(weight);
        // Get users height in inches.
        System.out.print(name + "'s height (inches): ");
        height = sc.nextDouble();
        // Check for valid input.
        while(user.setHeight(height) == false){
           System.out.println("Invalid height: must be between 60-84 inches inclusive.");
           System.out.print(name + "'s height (inches): ");
           height = sc.nextDouble();
        }
        user.setHeight(height);
        // Get users age.
        System.out.print(name + "'s age (years): ");
        age = sc.nextInt();
        // Check for valid input.
        while(user.setAge(age) == false){
           System.out.println("Invalid age - must be at least 18 years old.");
           System.out.print(name + "'s age (years): ");
           age = sc.nextInt();
        }
        user.setAge(age);
        // Get users activity level.
        System.out.println("");
        System.out.println("Activity Level: Use these categories:");
        System.out.println("\t1 - Sedentary (little or no exercise, desk job)");
        System.out.println("\t2 - Lightly active (light exercise/sports 1-3 days/week)");
        System.out.println("\t3 - Moderately active (moderate exercise/sports 3-5 days/week)");
        System.out.println("\t4 - Very active (hard exercise/sports 6-7 days/week)");
        System.out.println("\t5 - Extra active (hard daily exercise/sports & physical job or 2x day training i.e marathon, contest, etc.)");
        System.out.println("");
        System.out.println("How active are you?");
        activity = sc.nextInt();
        // Check for valid input.
        while(user.setActivityLevel(activity) == false){
           System.out.println("Invalid activity level: must be between 1-5 inclusive.");
           System.out.println("How active are you?");
           activity = sc.nextInt();
        }
        user.setActivityLevel(activity);
        System.out.println("");
        // Print 'user' information using methods from class 'Healthy'.
        System.out.println(user.getName() + "'s information:");
        System.out.println("Weight: " + user.getWeight() + " pounds.");
        System.out.println("Height: " + user.getHeight() + " inches.");
        System.out.println("Age: " + user.getAge() + " years.");
        System.out.println("These are for a " + user.getGender() + ".");
        System.out.println("");
        System.out.println("BMR: " + user.getBMR() + ".");
        System.out.println("BMI: " + user.getBMI() + ".");
        System.out.println("TDEE: " + user.getTDEE() + ".");
        System.out.println("Your BMI classifies you as " + user.getWeightStatus() + ".");
        System.out.println("");
        // Ask if the user wants to check another person.
        System.out.println("Do you wish to do another calculation (Yes/No)?");
        answer = sc.next().charAt(0);
        sc.nextLine();
     // If the user enters a 'y', start the program again.
     }while(Character.toLowerCase(answer) == 'y');
     System.out.println("Have a good day");
  }
}
