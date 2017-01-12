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
public class KnapSackProblem
{
    int max(int a,int b)
    {
        return (a > b)?a:b;
    }
    int knapSack(int W, int wt[], int val[], int n)
    {
         int i, w;
     int K[][] = new int[n+1][W+1];
      
     for (i = 0; i <= n; i++)
     {
         for (w = 0; w <= W; w++)
         {
             if (i==0 || w==0)
                  K[i][w] = 0;
             else if (wt[i-1] <= w)
                   K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
             else
                   K[i][w] = K[i-1][w];
         }
      }
        i = n;int j = W;
        int sum = 0;
        while(true)
        {
            if(K[i-1][j] > K[i][j-1])
            {
                i--;
            }
            else
            {
                i--;j = j - wt[i];
                System.out.println(wt[i]+" "+val[i]);
                sum += wt[i];
            }
            if(K[i][j] == 0)
            {
                System.out.println("---");
                System.out.print(sum+" ");
                break;
            }
        }
      return K[n][W];
    }
    
    public static void main(String[] args)
    {
        int val[] = {60,100,120,220};
        int wt[] = {10,20,30,40};
        int W = 50;
        KnapSackProblem kp = new KnapSackProblem();
        int x = kp.knapSack(W, wt, val, wt.length);
        System.out.println(x);
    }
    
}
