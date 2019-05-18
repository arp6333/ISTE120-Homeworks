/**
* Ellie Parobek
* ISTE-120 HW 11
* Grad class which extends the Student class.
*/

public class Grad extends Student{
   private String researchArea;
   private double COST_PER_CREDIT_HOUR = 713;
   
   /**
   * Default constructor which calls Student and sets research area to default.
   */
   public Grad(){
      super();
      setResearchArea("");
   }
   
   /**
   * Mutator for researchArea.
   * @param: String area - the new research area to be set.
   */
   public void setResearchArea(String area){
      researchArea = area;
   }
   
   /**
   * Accessor for researchArea.
   * @return: research area
   */
   public String getResearchArea(){
      return researchArea;
   }
   
   /**
   * Calculate tuition using numCredits and the COST_PER_CREDIT_HOUR.
   * @return: numCredits multiplied by COST_PER_CREDIT_HOUR.
   */
   public double calcTuition(){
      return super.getNumCredits() * COST_PER_CREDIT_HOUR;
   }
   
   /**
   * Create a String output for the variables.
   * @return: the variables formated as a string
   */
   public String toString(){
      String text = String.format("%-20s %s %-20s %s", "Grad Student: ", super.toString(), "\n\tResearch Area:", getResearchArea());
      return text;
   }
}