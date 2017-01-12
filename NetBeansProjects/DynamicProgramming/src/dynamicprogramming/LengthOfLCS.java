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
public class LengthOfLCS
{
    public static int Length(int p[],int n)
    {
        int lis[] = new int[n];
        for(int i=0;i<n;i++)
            lis[i] = 1;
        int i,j,max=0;
        for(i = 1;i<n;i++)
        {
            for(j=0;j<i;j++)
            {
                if(p[i] > p[j] && lis[i] < lis[j]+1)
                    lis[i] = lis[j]+1;
            }
        }
        for(i=0;i<n;i++)
        {
            if(max < lis[i])
                max = lis[i];
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        int p = Length(arr,n);
        System.out.println(p);
    }
    
}
