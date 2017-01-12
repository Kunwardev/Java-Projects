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
public class CountInversions
{
    
    static int count = 0;
    
    private static void Merge(int arr[],int l,int mid,int r){
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = arr[i+l];
        }
        
        for(int j=0;j<n2;j++){
            R[j] = arr[j+mid+1];
        }
        int i=0,j=0,k = l;
        
        while(i < n1 && j < n2){
            if(L[i] > R[j]){
                arr[k] = R[j];
                j++;
                count++;
            }else
            {
                arr[k] = L[i];
                i++;
            }
            k++;
        }
        
        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
        
    }
    
    public static void Divide(int arr[],int l,int r){
        if(l < r){
            int mid = (r+l)/2;
            Divide(arr,l,mid);
            Divide(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{2,4,1,3,5};
        Divide(arr,0,4);
        for(int i:arr)
        System.out.println(i);
        System.out.println("");
        System.out.println(count);
    }
    
}
