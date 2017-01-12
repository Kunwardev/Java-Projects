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
public class SumSubsets
{
    private static void Function(int arr[],int l,int r,int sum){
        if(l > r){
            System.out.print(sum+" ");
            return;
        }
        Function(arr,l+1,r,sum+arr[l]);
        Function(arr,l+1,r,sum);
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,4,3};
        Function(arr,0,2,0);
    }
    
}
