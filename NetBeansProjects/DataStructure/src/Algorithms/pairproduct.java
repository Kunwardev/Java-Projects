/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class pairproduct
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> pairer = new HashMap<>();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            pairer.put(arr[i], arr[i]);
        }
        int prod = sc.nextInt();
        for(int x:arr)
        {
            if(prod%x==0)
            {
                if((pairer.containsKey(prod/x)==true) && x!=(prod/x) && x > prod/x)
                    System.out.println(x+" "+pairer.get(prod/x));
            }
        }
    }
}
