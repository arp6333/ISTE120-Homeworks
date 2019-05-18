import java.util.ArrayList;
/*
* Name: Ellie Parobek
* Course ISTE-120-04-17
* HW: #09
* NewCarList that creates and holds a carList of all NewCar objects.
*/ 
public class NewCarList{
   // Instantiate ArrayList carList to hold the NewCar objects.
   private static ArrayList<NewCar> carList = new ArrayList<NewCar>();
   /**
   * Adds a NewCar to carList.
   * @param - car: the NewCar object to be added.
   */
   public static void add(NewCar car){
      carList.add(car);
   }
   /**
   * Print the information of each NewCar object in carList.
   */
   public static void display(){
      for(int i = 0; i < carList.size(); i++){
         System.out.println(carList.get(i).toString());
         System.out.println("Final Price: " + carList.get(i).getFinalPrice());
      }
   }
   /**
   * Print the information of each NewCar object in carList that is less than or equal to maxPrice entered.
   * @param - maxPrice: maximum price for each car displayed.
   */
   public static void select(double maxPrice){
      for(int i = 0; i < carList.size(); i++){
         if(carList.get(i).getFinalPrice() <= maxPrice){
            System.out.println(carList.get(i).toString());
            System.out.println("Final Price: " + carList.get(i).getFinalPrice());
         }
      }
   }
   /**
   * Remove a NewCar object from carList in the index entered.
   * @param - index: index of NewCar object we want removed.
   */
   public static void drop(int index){
      carList.remove(index);
   }
}
   