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
public class RearrangePosAndNega
{
    private static void Function(int[] arr){
        int i=-1;
        int length = arr.length;
        for(int j=0;j<length;j++){
            if(arr[j] < 0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{-1, 2, -3, 4, 5, 6, -7, 8, 9};
        Function(arr);
        for(int i: arr)
            System.out.print(i+" ");
    }
    
}
