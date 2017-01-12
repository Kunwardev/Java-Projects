
package Algorithms;

import java.util.Arrays;

public class PerrinSequence
{
    public static int Perrin(int n)
    {
        int P[] = new int[n+1];
        P[0] = 3;P[1] = 0;P[2] = 2;
        
        for(int i=3;i<=n;i++)
        {
            P[i] = P[i-2] + P[i-3];
            //System.out.println(P[i]);
        }
        return P[n];
    }
    
    public static void main(String[] args)
    {
        int x = Perrin(10);
        System.out.println(x);
    }
    
}
