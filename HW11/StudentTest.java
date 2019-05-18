import java.util.Scanner;
import java.util.ArrayList;
/**
* Ellie Parobek
* ISTE-120 HW 11
* StudentTest class to test the Student, Grad, and Undergrad classes.
*/

public class StudentTest{

   /**
   * Main method to get user input and create Student, Grad, and Undergrad objects.
   */
   public static void main(String args[]){
      // Create scanner.
      Scanner sc = new Scanner(System.in);
      // Create arraylist of Student objects
      ArrayList<Student> enrollment = new ArrayList<Student>();
      // Ask for user input for the choice of student.
      System.out.println("What type of student do you wish to enter?\n\t1. Undergrad \n\t2. Graduate \n\t3. Done"); 
      System.out.print("Choice: ");
      int choice = sc.nextInt();
      sc.nextLine();
      
      // Continue asking for students until 3 is entered.
      while(choice != 3){
         // Get student name.
         System.out.print("Student name: ");
         String name = sc.nextLine();
         // Get student id.
         System.out.print("Student id: ");
         String id = sc.nextLine();
         // Get number of credits.
         System.out.print("Number of credits: ");
         int credits = sc.nextInt();
         sc.nextLine();
         // If the user entered an Undergrad student:
         if(choice == 1){
            // Get the student level.
            System.out.print("Level: ");
            int level = sc.nextInt();
            sc.nextLine();
            // Create undergrad student based on input using the constructor.
            enrollment.add(new Undergrad(name, id, credits, level));
         }
         else{
            // If the user entered a Grad student, get research area.
            System.out.print("Research Area: ");
            String area = sc.nextLine();
            // Create new grad student.
            Grad student = new Grad();
            // Use the mutators to set all the inputs for the Grad student.
            student.setName(name);
            student.setId(id);
            student.setNumCredits(credits);
            student.setResearchArea(area);
            // Add this student to the arraylist.
            enrollment.add(student);
         }
         // Get user input for student type again or if they want to quit.
         System.out.println("\nWhat type of student do you wish to enter?\n\t1. Undergrad \n\t2. Graduate \n\t3. Done"); 
         System.out.print("Choice: ");
         choice = sc.nextInt();
         sc.nextLine();
      }
      
      // Run through the arraylist to print all of the Students.
      for(int i = 0; i < enrollment.size(); i++){
         System.out.printf("%s %-20s %.2f", enrollment.get(i).toString(), "\n\tTuition: ", enrollment.get(i).calcTuition());
         System.out.println("");
      }     
   }
}