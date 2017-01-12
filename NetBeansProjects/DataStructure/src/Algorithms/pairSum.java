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
public class pairSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> pairer = new HashMap<>();
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
            pairer.put(arr[i],arr[i]);
        }
        int sum = sc.nextInt();
        int res = 0;
        for(int x:arr)
        {
            res = (sum - x);
            if((pairer.containsKey(res) == true) && res != x && res>x)
            {
                System.out.println(x+" "+(sum-x));
            }
        }
    }
}
