/*
* Name: Ellie Parobek
* Course ISTE-120-04-17
* HW: #06
* NewCar class that calculates car purchase information
*/  
public class NewCar{
   private String year, make, model, desc, abbr;
   private double price, discount, salesTax, finalPrice, monthPay;
   private int months;
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
   public double calcFinalPrice(double pr, double dis, double tax){
      price = pr;
      discount = dis;
      salesTax = tax/100;
      finalPrice = (price - discount)*salesTax + (price - discount);
      return finalPrice;
   }
   public double calcZeroPctMonPayt(int mon){
      months = mon;
      monthPay = finalPrice / months;
      return monthPay;
   }
   public String toString(){
      return ("You want to purchase a \"" + desc + "\" Abbreviation: \"" + abbr + "\"");
   }
}
  