/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class PairWithGivenSum
{
    static HashMap<Integer, Integer> hm;
    public static int[] Function(int arr[],int sum)
    {
        hm = new HashMap<>();
        int arr1[] = new int[]{-1,-1};
        for(int i=0;i<arr.length;i++)
            hm.put(arr[i],arr[i]);
        for(int i=0;i<arr.length;i++)
        {
            int sum2 = sum - arr[i];
            if(hm.containsValue(sum2) && hm.containsValue(sum2) != hm.containsValue(arr[i]))
            {
                arr1[0] = arr[i];
                arr1[1] = sum - arr[i];
            }
        }
        return arr1;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        int arr2[] = Function(arr, 18);
        System.out.println(arr2[0]+" "+ arr2[1] );
    }
    
}
