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
public class SortedSubsequenceOf3
{
    public static int Function(int arr[]){
        int count_so_far = 1,number_so_far = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(number_so_far < arr[i+1])
            {
                count_so_far++;
                number_so_far = arr[i+1];
            }
           // System.out.println(count_so_far);
            if(count_so_far == 3)
                return 1;
        }
        return 0;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,2,1};
        System.out.println(Function(arr));
    }
    
}
