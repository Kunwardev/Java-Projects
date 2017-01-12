package Learn;

import java.util.Random;

public class Randomnu
{
    public static void main(String[] args)
    {
        Random dice = new Random();
        for(int i=0;i<5;i++)
        {
            int number = dice.nextInt(6)+1;
            System.out.println(number);
        }
    }
}
