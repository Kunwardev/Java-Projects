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
public class MaxValueContigous
{
    public static int Function(int arr[])
    {
        int n = arr.length;
        int maxSum = 0;
        int m[] = new int [n];
            if(arr[0] > 0)
                m[0] = arr[0];
            else
                m[0] = 0;
            for(int i=1;i<n;i++){
                if(m[i-1]+arr[i] > arr[i])
                    m[i] = m[i-1]+arr[i];
                else
                {m[i] = arr[i];}
        }
            for(int i=0;i<n;i++)
                if(maxSum < m[i])
                    maxSum = m[i];
            return maxSum;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{-2,11,-4,13,-5,2};
        int y = Function(arr);
        System.out.println(y);
    }
    
}
