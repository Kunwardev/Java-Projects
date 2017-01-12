/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class findingMaximuusingDP
{
    // Maximum value of arr[j]-arr[i]+arr[l]-arr[k] where i<j<k<l
    public static int Max(int arr[])
    {
        int n = arr.length;
        if(n<4)
        {
            System.out.println("Solution not possible");
            return -1;
        }
        int table1[] = new int[n+1];
        int table2[] = new int[n+1];
        int table3[] = new int[n+1];
        int table4[] = new int[n+1];
        Arrays.fill(table1,Integer.MIN_VALUE);
        Arrays.fill(table2,Integer.MIN_VALUE);
        Arrays.fill(table3,Integer.MIN_VALUE);
        Arrays.fill(table4,Integer.MIN_VALUE);
        for(int i=n-1;i>=0;i--)
        {
            table1[i] = Math.max(table1[i+1], arr[i]);
        }
        for(int l: table1)
            System.out.print(l+" ");
        System.out.println("");
        for(int i=n-1;i>=0;i--)
        {
            table2[i] = Math.max(table2[i+1], table1[i]-arr[i]);
        }
        for(int l: table2)
            System.out.print(l+" ");
        System.out.println("");
        for(int i=n-1;i>=0;i--)
        {
            table3[i] = Math.max(table3[i+1],table2[i]+arr[i]);
        }
        for(int l: table3)
            System.out.print(l+" ");
        System.out.println("");
        for(int i=n-1;i>=0;i--)
        {
            table4[i] = Math.max(table4[i+1], table3[i]-arr[i]);
        }
        for(int l: table4)
            System.out.print(l+" ");
        System.out.println("");
        int res = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            res = Math.max(res,table4[i]);
        }
        return res;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{4,8,9,2,20};
        int a = Max(arr);
        System.out.println(a);
    }
    
}
