
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight = 170;
	double kgWeight = 70;
	boolean smoker = false;
	int weeklyAlcholUnits = 15;
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 160;

	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}
	public void checkForGender()
	{
		char gender = 'M';
		System.out.println("Cheking gender...Hey hey there's no need to do that here, I trust you're a " + gender);
	}
	public void displayDetails()
	{
	   System.out.println("Hey Bruno! Your height is " + (cmHeight / 100.0) + "m");
	   System.out.println("And your weight is " + kgWeight + "kg");
	   System.out.println("Your Weekly Alcohol Units are " + weeklyAlcholUnits);
	   System.out.println("Your pulse is " + restPulse);
	}
	
}
