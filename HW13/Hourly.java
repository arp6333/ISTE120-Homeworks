public class Hourly implements Company{
   private String NAME = "Super Employer Inc.";
   private String ADDRESS = "Rochester, NY";
   private int WEEKS = 52;
   private String name, ssn;
   private double hourlyRate;
   private double avgHoursPerWeek;
   private int STANDARD_HOURS = 40;
   private double OVERTIME_RATE = 1.5;
   
   public Hourly(){
      name = "";
      ssn = "";
      hourlyRate = 0;
      avgHoursPerWeek = 0;
   }
   
   public Hourly(String newName, String newSsn, double newPay, double newHours){
      name = newName;
      ssn = newSsn;
      hourlyRate = newPay;
      avgHoursPerWeek = newHours;
   }
   
   public void setPay(double newPay){
      hourlyRate = newPay;
   }
   
   public double calcAnnualPay(){
      return (hourlyRate * WEEKS * STANDARD_HOURS);
   }
   
   public double calcWeeklyPay(){
      if(avgHoursPerWeek > STANDARD_HOURS){
         return ((STANDARD_HOURS * hourlyRate) + ((avgHoursPerWeek - STANDARD_HOURS) * hourlyRate * OVERTIME_RATE));
      }
      else{
         return (hourlyRate / WEEKS);
      }
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
   public void setHours(double newHours){
      avgHoursPerWeek = newHours;
   }
   public double getHours(){
      return avgHoursPerWeek;
   }
   public String toString(){
      String text = String.format("%-20s %s \n%-20s %s \n%-20s %.2f \n%-20s %.2f \n%-20s %.2f \n%-20s %.2f","Name:", name, "SSN:", ssn, "Average Hours Worked: ", avgHoursPerWeek, "Annual Salary: $", hourlyRate, "Annual Pay: $", calcAnnualPay(), "Weekly Pay: $", calcWeeklyPay()); 
      return text;
   }
}