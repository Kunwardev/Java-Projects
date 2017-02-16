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
public class LeftArrayRotation
{
    private static int GCD(int x,int y){
        if(y == 0)
            return x;
        else
            return GCD(y,x%y);
    }
    
    private static void LeftRotate(int[] arr,int d){
        int n = arr.length,i,j,k;
        for(i=0;i<GCD(n,d);i++){
            int temp = arr[i];
            j = i;
            while(true){
                k = j+d;
                if(k >= n)
                    k = k - n;
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    
    private static void rightRotate(int[] arr,int d){
        int n = arr.length,i,j,k;
        for(i=n-1;i>=n-GCD(n,d);i--){
            int temp = arr[i];
            j = i;
            while(true){
                k = j-d;
                if(k<0)
                    k = k+n;
                if(k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5,6,7};
        rightRotate(arr, 2);
        LeftRotate(arr, 2);
        for(int i: arr)
            System.out.print(i+" ");
    }
    
}
