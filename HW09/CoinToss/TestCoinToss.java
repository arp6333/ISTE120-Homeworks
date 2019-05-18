import java.util.Scanner;
public class TestCoinToss{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num = 0;
      do{
         System.out.print("Enter an integer number (>=2) coin tosses or 0 to exit: ");
         num = sc.nextInt();
         if(num == 0){
            System.out.println("End of Program");
            System.exit(0);
         }
         while(num < 2){
            System.out.println("Number must be an integer >=2.");
            System.out.print("Enter integer number ( >=2) coin tosses or 0 to exit: ");
            num = sc.nextInt();
            if(num == 0){
               System.out.println("End of Program");
               System.exit(0);
            }
         }
         CoinToss toss = new CoinToss(num);
         toss.flip();
         System.out.println("Number of Coin Tosses = " + toss.getTosses());
         System.out.printf("Fraction of Heads = %.3f", toss.getNumHeads());
         System.out.println("");
         System.out.printf("Fraction of Tails = %.3f", toss.getNumTails());
         System.out.println("");
         System.out.println("Longest run is " + toss.longestRun() + " " + toss.getBestRun());
      }while(num !=0);
   }  
}  
      
      