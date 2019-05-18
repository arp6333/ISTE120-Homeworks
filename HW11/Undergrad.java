/**
* Ellie Parobek
* ISTE-120 HW 11
* Undergrad class which extends the Student class.
*/

public class Undergrad extends Student{
   private int yearLevel;
   private double COST_PER_CREDIT_HOUR = 517;
   
   /*
   * Constructor to set name, id, credits, and year level.
   * @param: String newName - the name to be set, String newId - the id to be set, int credits - the credits to be set, String newYearLevel - the year level to be set.
   */
   public Undergrad(String newName, String newId, int credits, int newYearLevel){
      super(newName, newId, credits);
      setYearLevel(newYearLevel);
   }
   
   /*
   * Mutator for yearLevel.
   * @param: int newYearLevel - the new year level to be set.
   */
   public void setYearLevel(int newYearLevel){
      yearLevel = newYearLevel;
   }
   
   /*
   * Accessor for yearLevel.
   * @return: year level
   */
   public int getYearLevel(){
      return yearLevel;
   }
   
   /**
   * Calculate tuition using numCredits and the COST_PER_CREDIT_HOUR.
   * @return: numCredits multiplied by COST_PER_CREDIT_HOUR.
   */
   public double calcTuition(){
      return getNumCredits() * COST_PER_CREDIT_HOUR;
   }
   
   /**
   * Create a String output for the variables.
   * @return: the variables formated as a string
   */
   public String toString(){
      String text = String.format("%-20s %s %-20s %d", "Undergrad Student: ", super.toString(), "\n\tYear level:", getYearLevel());
      return text;
   } 
}