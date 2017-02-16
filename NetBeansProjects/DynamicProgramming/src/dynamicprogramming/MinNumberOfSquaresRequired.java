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
public class MinNumberOfSquaresRequired
{
    private static int getMinSquares(int n){
        int temp[] = new int[n+1];
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 2;
        temp[3] = 3;
        for(int i=4;i<=n;i++){
            temp[i] = i;
            for(int p = 1;p<=i;p++){
                int x = p*p;
                if(x > i)
                    break;
                else
                    temp[i] = Math.min(temp[i],1+temp[i-x]);
            }
        }
        return temp[n];
    }
    
    public static void main(String[] args)
    {
        int x = 6;
        System.out.println(getMinSquares(x));
    }
    
}
