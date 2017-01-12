
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kunwar
 */
public class FindName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] names = {{"Mickey", "Mouse"},
            {"Donald", "Duck"},
            {"Goofy", "Pluto"},
            {"Snow", "White"},
            {"James", "Bond"},
            {"Doc", "Sneezy"},
            {"Scotty", "Jimmy"},
            {"Peggy", "Sandy"},
            {"Joe", "Sean"},
            {"Alice", "Mackenzie"},
            {"Reshmi", "Vasant"},
            {"Steve", "Rae"}};
        //ask the user to enter a name, then pass the name and array to 
        //the method to search for that name. 
        Scanner in = new Scanner(System.in);
       char response = 'y';
       while(response == 'y')
       {
        System.out.println("Enter the name that you want to Guess: ");
        String name = in.nextLine();
        boolean result = Match(name,names);
        if(result == true)
        {
            System.out.println(name +" is present in the List");
        }
        else
        System.out.println(name+" is not present in the List");
        
        System.out.println("Want to Try Again (y/n)");
        response = in.nextLine().charAt(0);
    }
    }
    public static boolean Match(String a,String[][]b)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                if(b[i][j].equalsIgnoreCase(a))
                {
                    return true;
                }
            }
        }
        return false;
    }
}