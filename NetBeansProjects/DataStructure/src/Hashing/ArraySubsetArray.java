/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Kunwar
 */
public class ArraySubsetArray
{
    static HashMap<Integer, Integer> hmap = new HashMap<>();

      /*Adding elements to HashMap*/
    public static int Function(int arr1[],int arr2[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            hmap.put(i, arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(!hmap.containsValue(arr2[i]))
                return 1;
        }
        return 0;
    }
    
    public static void main(String[] args)
    {
        int arr1[] = new int[]{1,2,3,4,5,6,7,8,9,0};
        int arr2[] = new int[]{1,4,6,8,9,10};
        int x = Function(arr1, arr2);
        if(x == 0)
            System.out.println("Yes, Worked");
        else
            System.out.println("No, Worked");
    }
    
}
