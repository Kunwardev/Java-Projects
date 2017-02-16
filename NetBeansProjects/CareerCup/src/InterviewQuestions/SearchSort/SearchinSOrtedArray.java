/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.SearchSort;

/**
 *
 * @author Kunwar
 */
public class SearchinSOrtedArray
{
    private static int binary(int [] arr,int x,int first,int end){
        if(first<end){
        int mid = (first+end)/2;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid]>x)
            return binary(arr,x,first,mid);
        else
            return binary(arr,x,mid+1,end);
        }
        return -(first + 1);
    }
    
    private static int findPivot(int[] arr,int low,int high){
        if(high < low)
            return -1;
        if(high == low)
            return low;
        int mid = (low + high)/2;
        if(mid<high && arr[mid] > arr[mid+1])
            return mid;
        if(mid>low && arr[mid] < arr[mid-1])
            return (mid-1);
        if(arr[low] >= arr[mid])
            return findPivot(arr, low, mid-1);
        return findPivot(arr, mid+1, high);
    }
    
    private static int Function(int[] arr,int x){
        int p = findPivot(arr, 0, arr.length);
        if(p == -1)
            return binary(arr, x, 0, arr.length);
        if(arr[p] == x)
            return p;
        if(arr[0]<=x)
            return binary(arr, x, 0, p-1);
        return binary(arr, x, p+1, arr.length-1);
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{12,13,15,4,8,10};
        System.out.println(Function(arr, 13));
    }
    
}
