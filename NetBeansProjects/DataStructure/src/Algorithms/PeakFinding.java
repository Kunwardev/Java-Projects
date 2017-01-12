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
public class PeakFinding
{
    public static int Peak(int arr[],int low,int high)
    {
        int mid = low +(high-low)/2;
        if(mid == 0 || arr[mid] >= arr[mid-1] && mid == arr.length-1 || arr[mid+1] <= arr[mid])
        {
            return mid;
        }
        else if(arr[mid] >= arr[mid+1])
            return Peak(arr,low,mid-1);
        else
            return Peak(arr,mid+1,high);
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{2,4,7,8,9,1};
        int x = Peak(arr,0,arr.length-1);
        System.out.println(arr[x]);
    }
    
}
