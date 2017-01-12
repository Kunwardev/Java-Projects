/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geeksforgeeks;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class countpairswithgivensum
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        String res="";
        int arr[] ={2,4,5,6,8,1,12,7,9,10};
        
        int first,target;
        Scanner s = new Scanner(System.in);
        int sum = s.nextInt();
        for(int i=0;i<10;i++)
        {
            map.put(arr[i], arr[i]);
        }
        for(int j=0;j<10;j++)
        {
            if(map.get(sum-arr[j])!=null)
                res +=arr[j]+","+(sum-arr[j])+"\n"; 
        }
        System.out.println(res);
    }
    
}
