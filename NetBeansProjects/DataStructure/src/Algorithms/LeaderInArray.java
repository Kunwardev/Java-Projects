/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class LeaderInArray
{
    public void Function(int arr[])
    {
        int n = arr.length;
        int max = arr[n-1];
        System.out.print(max + " ");
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] >= max)
            {
                System.out.print(arr[i]+" ");
                max = arr[i];
            }
        }
    }
    
    public static void main(String[] args)
    {
        LeaderInArray l = new LeaderInArray();
        int arr[] = new int[]{16,17,4,3,5,2};
        l.Function(arr);
    }
    
}
