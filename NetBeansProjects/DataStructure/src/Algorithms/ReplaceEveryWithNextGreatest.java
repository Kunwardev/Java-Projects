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
public class ReplaceEveryWithNextGreatest
{
    private static void Function(int [] arr){
        int right[] = new int[arr.length];
        right[arr.length-1] = -1;
        int max = arr[arr.length-1];
        for(int i=arr.length-2;i >= 0;i--){
            right[i] = max;
            if(max < arr[i])
                max = arr[i];
        }
    
        for(int i:right){
            System.out.print(i+" ");
        }
    
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        Function(arr);
    }
    
}
