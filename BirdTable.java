
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;
import javax.swing.JOptionPane;

public class BirdTable {


   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Declare and build an array interactively - see the Temperature Project
   
      int [] birdwatcher = new int[7];

      birdwatcher[0] = 19;
      birdwatcher[1] = 15;
      birdwatcher[2] = 7;
      birdwatcher[3] = 11;
      birdwatcher[4] = 9;
      birdwatcher[5] = 13;
      birdwatcher[6] = 5;

      //Display Output using a histogram of '*' - see Histogram Project
      String output = "Day\tNo.BlueTits\tHistogram";
      
      // for each array element, output a bar in histogram
      for (int i = 0; i < birdwatcher.length; i++){
         output +=
            "\n" + i + "\t" + birdwatcher[i] + "\t";

         // print bar of asterisks
         for (int asterix = 0; asterix < birdwatcher[i]; asterix++ )
            output += "*";
      }
       //Create a new text area object to hold the text
       JTextArea outputArea = new JTextArea();
       outputArea.setText( output );
 
       JOptionPane.showMessageDialog( null, outputArea,
          "Histogram Printing Program",JOptionPane.INFORMATION_MESSAGE );
 
   }
}