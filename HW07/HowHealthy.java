import java.util.Scanner;
/*
* Ellie Parobek
* HW07
* Class HowHealthy prints information based on scanned user input using the Healthy class.
*/
public class HowHealthy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Get users name.
        System.out.print("Person's name: ");
        String name = sc.nextLine();
        // Get users gender.
        System.out.print(name + ", are you male or female (M/F): ");
        char gender = sc.next().charAt(0);
        // Get users weight in pounds.
        System.out.print(name + "'s weight (pounds): ");
        double weight = sc.nextDouble();
        // If weight is not within range, exit the program.
        if(weight < 100){
            System.out.println("Invalid weight - must be at least 100 pounds.");
            System.exit(1);
        }
        // Get users height in inches.
        System.out.print(name + "'s height (inches): ");
        double height = sc.nextDouble();
        // If height is not within range, exit the program.
        if((height < 60) || (height > 84)){
            System.out.println("Invalid height - must be 60-84 inclusive.");
            System.exit(1);
        }
        // Get users age.
        System.out.print(name + "'s age (years): ");
        int age = sc.nextInt();
        // If age is not within range, exit the program.
        if(age < 18){
            System.out.println("Invalid age - must be at least 18 years old.");
            System.exit(1);
        }
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
        int activity = sc.nextInt();
        System.out.println("");
        // Create new Healthy object 'user' based on entered information.
        Healthy user = new Healthy(name, age, gender, weight, height, activity);
        // Print users information using Healthy's methods.
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
    }
}
