
/**
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boolOp
{
    //Put your data type declarations here - I have put bresult there to hold the results 
    // of your calculations (see the Boolbag example)
      boolean finished = false;
      int m = 3;
      int n = 8;


/* Put the code for your calculations in this method.
 * The result of the expression should be calculated and assigned to 'bresult'
 */
   void a_boolOperation()
   {
        boolean andFunction;
        andFunction = ((n > m) && (m < -2));
        boolean orFunction;
        orFunction = (( m > 5) || !(finished));
        boolean notFunction;
        notFunction = (!(n < 5) && !(finished));
        
        System.out.println("AND Function: " + andFunction);
        System.out.println("OR Function: " + orFunction);
        System.out.println("NOT Function: " + notFunction);
   }
    
	
}
