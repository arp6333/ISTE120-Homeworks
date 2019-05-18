/**
* Ellie Parobek
* ISTE-120 HW 11
* Student class which takes name, id, and credits to create Student objects.
*/

public class Student{
   private String name, id;
   private int numCredits;
   
   /**
   * Constructor to set name, id, and credits.
   * @param: String newName - the name to be set, String newId - the id to be set, int credits - the credits to be set.
   */
   public Student(String newName, String newId, int credits){
      setName(newName);
      setId(newId);
      setNumCredits(credits);
   }
   
   /**
   * Default constructor which calls the param constructor with default values.
   */
   public Student(){
      this("", "", 0);
   }
   
   /**
   * Mutator for name.
   * @param: the name to be set.
   */
   public void setName(String newName){
      name = newName;
   }
   
   /**
   * Mutator for id.
   * @param: the id number to be set.
   */
   public void setId(String newId){
      id = newId;
   }
   
   /**
   * Mutator for numCredits.
   * @param: the number of credits to be set.
   */
   public void setNumCredits(int credits){
      numCredits = credits;
   }
   
   /**
   * Accessor for name.
   * @return: the name.
   */
   public String getName(){
      return name;
   }
   
   /**
   * Accessor for id.
   * @return: the id.
   */
   public String getId(){
      return id;
   }
   
   /**
   * Accessor for numCredits.
   * @return: number of credits.
   */
   public int getNumCredits(){
      return numCredits;
   }
   
   /**
   * Calculate tuition in the Student class so it does not cause error when Undergrad and Grad get called in StudentTest.
   * @return: nothing.
   */
   public double calcTuition(){
      return 0.0;
   }
   
   /**
   * Create a String output for the variables.
   * @return: the variables formated as a string
   */
   public String toString(){
      String text = String.format("%-20s %s %-20s %s %-20s %d", "\n\tName: ", getName(), "\n\tId: ", getId(), "\n\tCredits: ", getNumCredits());
      return text;
   }
}