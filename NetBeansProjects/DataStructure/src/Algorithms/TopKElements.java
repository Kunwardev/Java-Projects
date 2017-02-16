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
public class TopKElements
{
    private static ArrayList<Integer> Function(int[] arr, int k){
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int j=0;j<k;j++){
            int max = arr[0];
            int max_i = 0;
            for(int i=1;i<n-j&&j<k;i++){
                if(arr[i] > max){
                    max = arr[i];
                    max_i = i;
                }
            }
            int temp = arr[n-j-1];
            arr[n-j-1] = arr[max_i];
            arr[max_i] = temp;
            al.add(max);
        }
        return al;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,23,12,9,30,2,50};
        int k = 3;
        ArrayList<Integer> al = new ArrayList<>();
        al = Function(arr, k);
        System.out.println(al);
    }
    
}
