package Learn;

import java.util.Scanner;

public class Matchstickgame
{
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int i=21,j,k;
        while(i>=0)
        {
            if(i>0){
            System.out.println("Player's Turn");
            j = num.nextInt();
            if(j>4)
            {
                System.out.println("Invalid Matchsticks chosen, Choose Again");
            }
            else{
            
            k = 5 - j;
            System.out.println("Computer choose "+k);
            i = i - 5;
            if(i>0)
            System.out.println("Matchsticks Left: "+i);
            }
            }
    }
        System.out.println("Computer Wins");

    }
}