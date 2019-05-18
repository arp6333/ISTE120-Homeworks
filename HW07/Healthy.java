/*
* Ellie Parobek
* HW07
* Class Healthy calculates BMR, BMI, and TDEE based on input and returns all information.
*/
public class Healthy {
    private String name;
    private int age, activity;
    private char gender;
    private double weight, height, bmr, bmi, newHeight, newWeight, tdee;
    /*
    * Constructor for Healthy.
    * @param: name, age, gender, weight, height, and activity level from user input.
    */
    public Healthy(String n, int a, char g, double w, double h, int act){
        name = n;
        age = a;
        gender = g;
        weight = w;
        height = h;
        activity = act;
        bmr = 0;
        bmi = 0;
        newWeight = 0;
        newHeight  = 0;
        tdee = 0;
    }

    /*
    * Converts weight to metric.
    * @return: newWeight which is 'weight' in metric units.
    */
    private double metricWeight(){
        // Weight conversion from lbs to kg.
        newWeight = weight * 0.45359237;
        return newWeight;
    }

    /*
    * Converts height to metric.
    * @return: newHeight which is 'height' in metric units.
    */
    private double metricHeight(){
        // Height conversion from in to cm.
        newHeight = height * 2.54;
        return newHeight;
    }

    /*
    * Calculates BMR based on gender, weight (metric units), and height (metric units).
    * @return: calculated BMR.
    */
    public double calcBMR(){
        // If male then use male formula, else use female formula.
        if(Character.toUpperCase(gender) == 'M'){
            // Male BMR formula taking the metric height and weight.
            bmr = 66 + (13.7 * metricWeight()) + (5 * metricHeight()) - (6.8 * age);
        }
        else{
            // Female BMR formula taking the metric height and weight.
            bmr = 655 + (9.6 * metricWeight()) + (1.8 * metricHeight()) - (4.7 * age);
        }
        return bmr;
    }

    /*
    * Calculates BMI based on weight and height.
    * @return: calculated BMI.
    */
    public double calcBMI(){
        // BMI formula using non-metric weight and height
        bmi = (weight / (height * height)) * 703;
        return bmi;
    }

    /*
    * Calculates TDEE based on activity level and BMR.
    * @return: calculated TDEE.
    */
    public double calcTDEE(){
        // Based on activity number, calculate the TDEE from BMR * indicated value for activity level.
        if(activity == 1){
            tdee = calcBMR() * 1.2;
        }
        else if(activity == 2){
            tdee = calcBMR() * 1.375;
        }
        else if(activity == 3){
            tdee = calcBMR() * 1.55;
        }
        else if(activity == 4){
            tdee = calcBMR() * 1.725;
        }
        else{
            tdee = calcBMR() * 1.9;
        }
        return tdee;
    }

    /*
    * Get the users name.
    * @return: entered name.
    */
    public String getName(){
        return name;
    }

    /*
    * Get the users age.
    * @return: entered age.
    */
    public int getAge(){
        return age;
    }

    /*
    * Get the users activity level.
    * @return: entered activity level.
    */
    public int getActivity(){
        return activity;
    }

    /*
    * Get the users gender.
    * @return: entered gender as a full String rather than a char.
    */
    public String getGender(){
        // If entered gender (to uppercase incase entered as lowercase) is 'M', return gender as 'male', else return gender as 'female'.
        if(Character.toUpperCase(gender) == 'M'){
            return "male";
        }
        else{
            return "female";
        }
    }

    /*
    * Get the users weight.
    * @return: entered weight.
    */
    public double getWeight(){
        return weight;
    }

    /*
    * Get the users weight status based on BMI.
    * @return: String of weight status.
    */
    public String getWeightStatus(){
        // Return the weight status based on the value of users BMI
        if(getBMI() < 18.5){
            return "underweight";
        }
        else if((getBMI() >= 18.5) && (getBMI() < 25)){
            return "normal weight";
        }
        else if((getBMI() >=25) && (getBMI() < 30)){
            return "overweight";
        }
        else{
            return "obese";
        }
    }

    /*
    * Get the users height.
    * @return: entered height.
    */
    public double getHeight(){
        return height;
    }

    /*
    * Get the users BMR.
    * @return: calculated BMR rounded to 2 decimals..
    */
    public double getBMR(){
        // Call calcBMR() to get BMR then round to 2 decimals.
        return Math.round(calcBMR() * 100.0) / 100.0;
    }

    /*
    * Get the users BMI.
    * @return: calculated BMI rounded to 2 decimals.
    */
    public double getBMI(){
        // Call calcBMI() to get BMI then round to 2 decimals.
        return Math.round(calcBMI() * 100.0) / 100.0;
    }

    /*
    * Get the users TDEE.
    * @return: calculated TDEE rounded to 2 decimals.
    */
    public double getTDEE(){
        // Call calcTDEE() to get TDEE then round to 2 decimals.
        return Math.round(calcTDEE() * 100.0) / 100.0;
    }
}
