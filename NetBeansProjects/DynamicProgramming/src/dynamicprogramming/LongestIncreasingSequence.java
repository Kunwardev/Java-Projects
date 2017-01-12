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
public class LongestIncreasingSequence
{
    private int LIS(int arr[]){
        int lis[] = new int[arr.length];
        Arrays.fill(lis, 1);
        
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && lis[i] < lis[j]+1){ 
// If change the sign of the first condition, you will get the longest 
                    //decreasing subsequence            
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = 0;
        for(int i = 0;i < arr.length;i++ ){
            if(max < lis[i]){
                max = lis[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        LongestIncreasingSequence lis = new LongestIncreasingSequence();
        int arr[] = new int[]{ 10, 22, 9, 33, 21, 50, 41, 60 };
        int p = lis.LIS(arr);
        System.out.println(p);
    }
    
}
