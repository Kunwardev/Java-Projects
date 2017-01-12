/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class KeithNumber
{
    
    public static void KeithArray()
    {
        //ArrayList<Integer> al = new ArrayList<>();
        for(int i=10;i<100000;i++)
        {
            int x = Keith(i);
            if(x != -1)
                System.out.println(x);
        }
    }
    
    public static int Keith(int n)
    {
        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        int x = n;
        int sum = 0;
        while(n!=0)
        {
            al.add(i, n%10);
            n = n/10;
            i++;
        }
        //System.out.println(al);
        int arr[] = new int[al.size()];
        for(int p=0;p<al.size();p++)
        {
            arr[p] = al.get(al.size()-1-p);
        }
        int k;int flag = 0;
        while(true)
        {
            for(int j=0;j<i;j++)
                sum += arr[j];
            for(k=0;k<i-1;k++)
            {
                arr[k] = arr[k+1];
              //  System.out.print(arr[k]+" ");
            }
            arr[k] = sum;
            sum = 0;
            //System.out.println(arr[k]+" ");
            if(arr[k] == x)
            {
                flag = 1;
                break;
            }
            else if(arr[k] > x)
            {
                break;
            }
            
        }
        if(flag == 0)
            return -1;
        return x;
    }
    
    public static void main(String[] args)
    {
        KeithArray();
    }
    
}
