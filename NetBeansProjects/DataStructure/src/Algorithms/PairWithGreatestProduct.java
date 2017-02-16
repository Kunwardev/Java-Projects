/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class PairWithGreatestProduct
{
    private static int Function(int[] arr){
        int x;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(i, arr[i]);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            
            for(int j=0;j<i && arr[j] <= (int)Math.sqrt(arr[i]);j++){
                int result = arr[i]/arr[j];
                if((result != arr[j]) && (hs.containsValue(result))){
                    return arr[i];
                }
                if(result == arr[j] && result == arr[j+1])
                    return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int arr[] = {2,5,7,8};
        System.out.println(Function(arr));
    }
    
}
