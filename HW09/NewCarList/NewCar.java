/*
* Name: Ellie Parobek
* Course ISTE-120-04-17
* HW: #09
* NewCar class that calculates car purchase information from HW #06.
*/  
public class NewCar{
   private String year, make, model, desc, abbr;
   private double price, discount, salesTax, finalPrice, monthPay;
   private int months;
   /**
   * Constructor to initialize variables and get year, make, and model from user.
   * @param - year: year of car, mk: make of car, md: model of car.
   */
   public NewCar(String yr, String mk, String md){
      year = yr;
      make = mk;
      model = md;
      desc = year + " "+ make + " " + model;
      abbr = year.substring(2) + make.charAt(0) + model.charAt(0);
      price = 0;
      discount = 0;
      salesTax = 0;
      finalPrice = 0;
      months = 0;
      monthPay = 0;
   }
   /**
   * Calculate the final price of the car based on price, discount, and tax on the car.
   * @param - pr: price of car, dis: discount on car, tax: tax on car.
   * @return - finalPrice: the final price of the car.
   */
   public double calcFinalPrice(double pr, double dis, double tax){
      price = pr;
      discount = dis;
      salesTax = tax/100;
      finalPrice = (price - discount)*salesTax + (price - discount);
      return finalPrice;
   }
   /**
   * Calculate the monthly pay of the car based on entered months.
   * @param - mon: months entered.
   * @return - monthPay: calculated monthly pay.
   */
   public double calcZeroPctMonPayt(int mon){
      months = mon;
      monthPay = finalPrice / months;
      return monthPay;
   }
   /**
   * Print the information of each NewCar.
   * @return - A string of the informaton of the car.
   */
   public String toString(){
      return ("You want to purchase a \"" + desc + "\" Abbreviation: \"" + abbr + "\"");
   }
   /**
   * Get and return the final price of the car.
   * @return - finalPricce: the final price of the car.
   */
   public double getFinalPrice(){
      return finalPrice;
   }
}
  