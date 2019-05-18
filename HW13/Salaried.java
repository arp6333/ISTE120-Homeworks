public class Salaried implements Company{
   private String NAME = "Super Employer Inc.";
   private String ADDRESS = "Rochester, NY";
   private int WEEKS = 52;
   private String name, ssn;
   private double hourlyRate;
   private double healthInsDeduction = 125.50;
   
   public Salaried(){
      name = "";
      ssn = "";
      hourlyRate = 0;
   }
   
   public Salaried(String newName, String newSsn, double newPay){
      name = newName;
      ssn = newSsn;
      hourlyRate = newPay;
   }
   
   public void setPay(double newPay){
      hourlyRate = newPay;
   }
   
   public double calcAnnualPay(){
      return (double)(hourlyRate - (WEEKS * healthInsDeduction));
   }
   
   public double calcWeeklyPay(){
      return (double)((hourlyRate / WEEKS) - healthInsDeduction);
   }
   public double getPay(){
      return hourlyRate;
   }
   public void setName(String newName){
      name = newName;
   }
   public String getName(){
      return name;
   }
   public void setSsn(String newSsn){
      ssn = newSsn;
   }
   public String getSsn(){
      return ssn;
   }
   public String toString(){
      String text = String.format("%-20s %s \n%-20s %s \n%-20s %.2f \n%-20s %.2f \n%-20s %.2f","Name:", name, "SSN:", ssn, "Annual Salary: $", hourlyRate, "Annual Pay: $", calcAnnualPay(), "Weekly Pay: $", calcWeeklyPay()); 
      return text;
   }
}