import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * HW3 - This class will do date calculations.
 *
 * @author Ellie Parobek
 * @version 9/20/17
 */
public class TodaysCalendar
{
    public static void main(String args[])
    {
        //Making today's date as an object and printing it.
        GregorianCalendar today = new GregorianCalendar();
        System.out.println("Today's date is " + (today.get(Calendar.MONTH) + 1) + "/" + today.get(Calendar.DAY_OF_MONTH)+ "/" + today.get(Calendar.YEAR) + " which is day " + today.get(Calendar.DAY_OF_WEEK) + " of the week.");
        
        //Changing to 100 days from today and printing it
        today.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println("In 100 days it will be " + (today.get(Calendar.MONTH) + 1) + "/" + today.get(Calendar.DAY_OF_MONTH)+ "/" + today.get(Calendar.YEAR) + " which is day " + today.get(Calendar.DAY_OF_WEEK) + " of the week.");
        
        //Making my birthday an object and printing it.
        GregorianCalendar birthday = new GregorianCalendar(1998, Calendar.APRIL, 14);
        System.out.println("My Birthday is " + (birthday.get(Calendar.MONTH) + 1) + "/" + birthday.get(Calendar.DAY_OF_MONTH)+ "/" + birthday.get(Calendar.YEAR) + " which is day " + birthday.get(Calendar.DAY_OF_WEEK) + " of the week.");
        
        //Changing to 10,000 days from my birthday and printing it.
        birthday.add(Calendar.DAY_OF_MONTH, 10000);
        System.out.println("The date 10,000 days after my birthday is "+ (birthday.get(Calendar.MONTH) + 1) + "/" + birthday.get(Calendar.DAY_OF_MONTH)+ "/" + birthday.get(Calendar.YEAR) + " which is day " + birthday.get(Calendar.DAY_OF_WEEK) + " of the week.");
    }
}
