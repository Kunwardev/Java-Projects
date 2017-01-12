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
public class FindingADuplicateWithinKdistance
{
    static HashMap<Integer, Integer> hm;
    public static boolean checkDuplicate(int arr[],int k)
    {
        hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsValue(arr[i]))
                return true;
            hm.put(i, arr[i]);
            if(i >= k)
            {
                hm.remove(i-k);
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,5,3,4,7,6};
        if(checkDuplicate(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
