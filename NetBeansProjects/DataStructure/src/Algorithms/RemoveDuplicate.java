/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class RemoveDuplicate
{
    int arr[];
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int l=0;l<n;l++)
        {
            if(hm.containsValue(arr[l]) == false)
                hm.put(l, arr[l]);
        }
        System.out.println(hm.values());
    }
}
