/*
* @author Bruno Boyer.
* @version 2021.09.22
*/
import java.util.ArrayList;
public class Shopping 
{

    private ArrayList shoppingList;

    public Shopping()
    {
        shoppingList = new ArrayList();
    }

    public void addItem(String shoppingItem)
    {
        shoppingList.add(shoppingItem);
    }

    public int numberOfItems()
    {
        return shoppingList.size();
    }

    public void showItem(int itemNumber)
    {
        if (itemNumber < 0)
        {
            //Not a valid number
        }
        else if (itemNumber < numberOfItems())
        {
            System.out.println(shoppingList.get(itemNumber));
        }
        else {
            //Not a valid number
        }
    }
    public void listItems()
    {
        int index = 0;
        while (index < shoppingList.size())
        {
            System.out.println(shoppingList.get(index));
            index++;
        }
    }
    public static void main(String[] args)
    {
        Shopping sh=new Shopping();
        
        sh.addItem("Milk");
        sh.addItem("Chcolates");
        sh.addItem("Bread");
        sh.addItem("IceCream");
        System.out.println("How many articles have we added to the shopping car? " + sh.numberOfItems());
    }
}