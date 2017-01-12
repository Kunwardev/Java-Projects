/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class LongestBitonicSequence
{
    private static int LBS(int arr[],int n){
        int i,j;
        
        int lis[] = new int[n];
        Arrays.fill(lis,1);
        for(i=1;i<n;i++){
            for(j=0;j<i;j++){
                if(arr[i] > arr[j] && lis[i] < lis[j]+1)
                    lis[i] = lis[j] + 1;
            }
        }
        
        int lds[] = new int[n];
        Arrays.fill(lds,1);
        for(i=n-2;i>=0;i--){
            for(j=n-1;j>i;j--){
                if(arr[i] > arr[j] && lds[i] < lds[j]+1)
                    lds[i] = lds[j] + 1;
            }
        }
        int max = lis[0]+lds[0] - 1;
        for(i=1;i<n;i++)
        {
            if(lis[i]+lds[i]-1 > max)
                max = lis[i]+lds[i]-1;
    }
        return max;
}
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5,
              13, 3, 11, 7, 15};
        int n = arr.length;
        int answer = LBS(arr, n);
        System.out.println(answer);
    }
    
}