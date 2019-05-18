public interface Company{
   String NAME = "Super Employer Inc.";
   String ADDRESS = "Rochester, NY";
   int WEEKS = 52;
   
   void setPay(double newPay);
   
   double calcAnnualPay();
   
   double calcWeeklyPay();
}