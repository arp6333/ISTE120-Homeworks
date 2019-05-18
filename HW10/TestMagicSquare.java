import java.util.Scanner;
/**
* Ellie Parobek
* ISTE-120-03 
* HW 10
* This is the tester class for the Square class to obtain user input.
*/
public class TestMagicSquare{
   /**
   * Main method to get user input, set up Square object, and call methods from Square class.
   */
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = 0;
      // Create new Square object
      Square square = new Square();
      boolean quit = false;
      do{
         System.out.print("Enter an integer(x to exit): ");
         // If input was a number:
         if(sc.hasNextInt() && quit == false){
            // Add the number to square.
            num = sc.nextInt();
            square.add(num);
            num = 0;
            sc.nextLine();
         }
         else{
            // If input was not a number:
            String line = sc.nextLine();
            // If input was x, then know to exit the do-while.
            if(line.equals("x") || line.equals("X")){
               quit = true;
               break;
            }
            // If invalid input then ask again
            else{
               System.out.println("");
               System.out.println("*** Invalid data entry ***");
            }
         }
      }while(quit == false);
      // Run isSquare.
      boolean isSquare = square.isSquare();
      System.out.println("");
      // If isSquare() is false, it is not a perfect square, else it is a perfect square.
      if(isSquare == false){
         System.out.println("\tStep 1. Numbers do not make a square: Program Stopped");
         System.exit(1);
      }
      System.out.println("\tStep 1. Numbers make a square ***\n");
      // Run isUnique().
      boolean isUnique = square.isUnique();
      // If isUnique() is false, it does not have unique numbers, else it does.
      if(isUnique == false){
         System.out.println("\tStep 2. Numbers are not unique: Program Stopped");
         System.exit(1);
      }
      System.out.println("\tStep 2. Numbers are unique ***\n");
      // Run isMagic().
      boolean isMagic = square.isMagic();
      // If isMagic() is false, it is not a magic square, else it is a magic square.
      if(isMagic == false){
         System.out.println("\tStep 3. But it is NOT a magic square.");
         System.exit(1);
      }
      System.out.println("\tStep 3. Yes it is a Magic Square!");
   }
}
      
         