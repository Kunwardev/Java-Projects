/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class BinomialCoefficient
{
    public static int Function(int n,int k)
    {
        int sol[][] = new int[n+1][k+1];
        int i,j;
        if(k > n)
            return -1;
        else
        {
            for (i = 0; i <= n; i++)
    {
        for (j = 0; j <= Math.min(i, k); j++)
        {
            // Base Cases
            if (j == 0 || j == i)
                sol[i][j] = 1;
      
            // Calculate value using previosly stored values
            else
                sol[i][j] = sol[i-1][j-1] + sol[i-1][j];
          }
     }
            }
    return sol[n][k];    
    }
    
    public static void main(String[] args)
    {
        System.out.println(Function(5,2));
    }
    
}
