/*
* Name: Ellie Parobek
* Course ISTE-120-04-17
* HW: #09
* NewCarListTester to test NewCarList.
*/ 
public class NewCarListTester{
   /**
   * Main method to instantiate NewCar objects and create NewCarList.
   */
   public static void main(String args[]){
      // Instantiate 5 new cars and call calcFinalPrice for each.
      NewCar car1 = new NewCar("2010", "Kia", "Rio");
      car1.calcFinalPrice(11000, 1000, 8);
      NewCar car2 = new NewCar("2007", "Kia", "Rio");
      car2.calcFinalPrice(9000, 0, 8);
      NewCar car3 = new NewCar("2004", "Honda", "Civic");
      car3.calcFinalPrice(6000, 0, 8);
      NewCar car4 = new NewCar("2002", "Honda", "Civic");
      car4.calcFinalPrice(6000, 0, 8);
      NewCar car5 = new NewCar("2010", "Chevrolet", "Cobalt");
      car5.calcFinalPrice(12000, 2000, 8);
      // Add all 5 cars to NewCarList.
      NewCarList.add(car1);
      NewCarList.add(car2);
      NewCarList.add(car3);
      NewCarList.add(car4);
      NewCarList.add(car5);
      // display() list of cars in NewCarList.
      System.out.println("*** List of cars");
      NewCarList.display();
      System.out.println("");
      // select() display with cars under $9720 in NewCarList.
      System.out.println("*** List of cars under $9720");
      NewCarList.select(9720);
      // Instantiate 3 new cars and call calcFinalPrice for each.
      NewCar car6 = new NewCar("2000", "Honda", "Accord");
      car6.calcFinalPrice(3000, 0, 8);
      NewCar car7 = new NewCar("2009", "Subaru", "Forester");
      car7.calcFinalPrice(22000, 0, 8);
      NewCar car8 = new NewCar("2000", "Chevrolet", "Malibu");
      car8.calcFinalPrice(22000, 0, 8);
      // Add the 3 new cars to the list.
      NewCarList.add(car6);
      NewCarList.add(car7);
      NewCarList.add(car8);
      System.out.println("");
      // New display() with added 3 cars.
      System.out.println("*** Add three more cars to list");
      NewCarList.display();
      // Delete second item (index 1) in NewCarList.
      NewCarList.drop(1);
      System.out.println("");
      // New display() with deleted item.
      System.out.println("*** Delete second item in the list");
      NewCarList.display();
   }
}