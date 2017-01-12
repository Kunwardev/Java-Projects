/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class PermutationofNumber
{
    public static int changetoNumber(int[] arr)
    {
        int n = 0;
        int y = arr[n];
        while(n+1 != arr.length)
        {
            y = y*10+arr[n+1];
            n++;
        }
        
        return y;
    }
    
    public static int[] changetoArray(int x)
    {
        int p = Integer.toString(x).length();
        int arr[] = new int[p];
        int num = x;
        int i=p-1;
        while(num!=0)
        {
            arr[i] = num%10;
            num/=10;
            i--;
        }
        return arr;
    }
    static int truecount = 0;
    public static void Permute(int arr[],int l,int r)
    {
        int i;
        if(l == r)
        {
            int k = changetoNumber(arr);
            System.out.println(k);
            if(k%8 == 0 )
            {
                truecount++;
            }
        }
        else
        {
            for(i=l;i<=r;i++)
            {
                {
                    int temp = arr[l];
                    arr[l] = arr[i];
                    arr[i] = temp;
                }
                Permute(arr, l+1, r);
                {
                    int temp = arr[l];
                    arr[l] = arr[i];
                    arr[i] = temp;
                }
            }
            
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = changetoArray(x);
        Permute(arr, 0, arr.length-1);
        if(truecount > 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
