
package Algorithms;

import java.util.Scanner;

public class SubStringMultipleof11
{
    public static long toNumber(String x)
    {
        long number = 0;
        for(int i=0;i<x.length();i++)
        {
            number = number * 10 + (x.charAt(i) - '0');
        }
        return number;
    }
    
    public static void main(String[] args)
    {
        String x,y;
        Scanner in = new Scanner(System.in);
        x = in.next();
        int rangel,rangeh;
        rangel = in.nextInt();
        rangeh = in.nextInt();
        y = x.substring(rangel, rangeh+1);
        long z= toNumber(y);
        System.out.println(z);
        if(z%11 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
