/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class SumPresentInArray
{
    private static void Function(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr)
            hs.add(i);
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(hs.contains(arr[i]+arr[j])){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{10,4,8,13,5,14};
        Function(arr);
    }
    
}
