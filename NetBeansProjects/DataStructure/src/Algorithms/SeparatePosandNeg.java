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
public class SeparatePosandNeg
{
    private static void Segarate(int arr[]){
        int temp[] = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 0){
                temp[j++] = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                temp[j++] = arr[i];
            }
        }
        for(int k: temp)
            System.out.print(k+" ");
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1 ,-1 ,-3 , -2, 7, 5, 11, 6};
        Segarate(arr);
    }
    
}
