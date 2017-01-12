package Algorithms;

import java.util.Random;

public class Generate01with2575prob
{
    
    public static int rand50()
    {
        Random r = new Random();
        int x = r.nextInt();
        x = x&1;
        
        return x;
    }
    
    public static void main(String[] args)
    {
        for(int i=0;i<20;i++)
        {
            int y = rand50();
            System.out.print(y);
        }
    }
}
