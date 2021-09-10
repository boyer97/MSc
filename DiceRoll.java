import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DiceRoll extends JPanel
{
    private int firstDice;		// to hold the value for the first dice
	private int secondDice;		// to hold the value for the second dice
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
		firstDice  = (int) (Math.random() * 6) + 1; // get a value for the first dice
		secondDice = (int) (Math.random() * 6) + 1; //get a value for the second dice
		// draw the dice squares
		g.setColor(Color.blue);
		g.fillRect(20, 20, 60, 60);
		g.setColor(Color.magenta);
		g.fillRect(120, 20, 60, 60);
		// put the values on the dice
		g.setColor(Color.white);
		g.drawString(" " + firstDice, 43, 54);
		g.drawString(" " + secondDice, 143, 54);
		// write the values under the dice
		g.setColor(Color.black);
		g.drawString("First dice = " + firstDice, 20, 100); 
		g.drawString("Second Dice = " + secondDice, 120, 100); // print out the dice values
		// OPERATOR function to see if the dices are equal
		if (firstDice == secondDice)
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Sorry, try again loser");
		}
		//AND Function to see if both dices are above 3
		if ((firstDice > 3) && (secondDice > 3))
		{
			System.out.println("You win again!");
		}
		else
		{
			System.out.println("Sorry loser, try again");
		}
		//OR Function to check if any of the dices =6
		if ((firstDice == 6) || (secondDice == 6))
		{
			System.out.println("You win! Roll them again");
		}
		else 
		{
			System.out.println("Sorry you lost... AGAIN");
		}
		//OPERATOR =7
		if ((firstDice + secondDice ) == 7)
		{
			System.out.println("Bonus throw! Roll again");
		}
		else
		{
			System.out.println("Sorry, too good to be true");
		}
   }
}


