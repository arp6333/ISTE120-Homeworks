import java.util.Calendar;
import java.util.Scanner;
/**
* Name: Ellie Parobek
* Course ISTE-120-04-17
* HW: #06
* NewCar testing class to do calculations on cars using scanners.
*/
public class NewCarTester
{
    public static void main(String args[]){
        //Create Scanner
        Scanner sc = new Scanner(System.in);
        //Get car's year
        System.out.print("Enter the car's Year: ");
        String year = sc.nextLine();
        //Get car's make
        System.out.print("Enter the car's Make: ");
        String make = sc.nextLine();
        //Get car's model
        System.out.print("Enter the car's Model: ");
        String model = sc.nextLine();
        //Get Sticker Price
        System.out.print("Enter the Sticker Price: ");
        double price = Double.parseDouble(sc.nextLine());
        //Get Discount
        System.out.print("Enter the Discount: ");
        double discount = Double.parseDouble(sc.nextLine());
        //Get Sales Tax Rate
        System.out.print("Enter the Sales Tax Rate: ");
        double tax = Double.parseDouble(sc.nextLine());
        //Get Number of Months at Zero Percent Interest
        System.out.print("Enter the Number of Months at Zero Percent Interest: ");
        int months = Integer.parseInt(sc.nextLine());
        System.out.println("");
        //Create NewCar object 'car'
        NewCar car = new NewCar(year, make, model);
        //Print info about car
        System.out.println(car.toString());
        System.out.println("Final Price: " + car.calcFinalPrice(price, discount, tax));
        System.out.println("Monthly Payment at Zero Percent Interest: " + car.calcZeroPctMonPayt(months));
    }
}
