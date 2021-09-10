
/**
 * Write a description of class Exciting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
 public class Exciting
{
    //Put your declarations for a) beneath here 
     double z ;

    //Put your declarations and initialisations to b) beneath here 
    
    
   public void doit()
   {
     double x = 3.0;
     double y = 4.0;
     z = 2.0 * y + x/4.0 - (x + y ) ;
   }    
   
   public void displayDetails() 
   {
	   System.out.print("z= ");
	   System.out.println (z);
   }
   
   public void displayParta()
   {
	   //display the details for the variables you declared in a)
      int count = 0;
      double cost = 3.45;
      char choice = 'X';
      boolean goodChoice = true;
      int lowest = 5;

      System.out.println("THIS IS PART A");
      System.out.println(count);
      System.out.println(cost);
      System.out.println(choice);
      System.out.println(goodChoice);
      System.out.println(lowest);
   }
     
   public void displayPartb()
   {
	   //display the details for the variables you declared in b)
      double room = 25.0;
      int jackpot = 7;
      int population = 1398000000;
      boolean game = true;
      int distance = 48000000;
      char grade = 'A';

      System.out.println("THIS IS PART B");
      System.out.println("This room is currently at " + room + " degrees");
      System.out.println("Your lucky number for the jackpot is " + jackpot + " Good Luck!");
      System.out.println("China's population is around " + population + " people");
      System.out.println("Has the match between Liverpool and Everton finished? " + game);
      System.out.println("The distance between Mercury and the Earth is near to " + distance + " miles");
      System.out.println("If you pay attention and study hard, you'll get straight " + grade + "'s");
   }


	   
   }
    


	   
    
 