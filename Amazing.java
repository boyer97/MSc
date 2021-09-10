
/**
 * A class to hold the declarations and Expressions 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amazing
{
   //Put your data type declarations below. Here is an example
    double x = 2.5;
    double y = -1.5;
    int m = 18;
    int n = 4;

     

//Put the code for your calculations in this method.   
   void doCalculations()
   {   double f1 = (x+n*y-(x+n)*y) ;
       System.out.println("If x=" + x + ",n=" + n + ",y=" + y + " and f1= x+n*y-(x+n)*y, then f1= " + f1);
       double f2 = (m/n+m%n);
       System.out.println("If m=" + m + ",n=" + n + " and f2= m/n+m%n, then f2= " + f2);
       double f3 = (5*x-n/5);
       System.out.println("If x=2.5, n=4 and f3= 5*x-n/5, then = " + f3);

   }//End of doCalculations
}
