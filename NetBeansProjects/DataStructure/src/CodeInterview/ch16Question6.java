/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class ch16Question6
{
    private static int[] findPair(int[] arr1, int[] arr2){
        int[] answer = new int[2];
        int min_i = 0,min_j = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0,j = 0,diff = Integer.MAX_VALUE;
        while((i<arr1.length && j<arr2.length)){
            if(diff > Math.abs(arr1[i] - arr2[j])){
                min_i = i;
                min_j = j;                
                diff = Math.abs(arr1[i] - arr2[j]);
            }
            if(arr1[i] > arr2[j])
                j++;
            else
                i++;
        }
        answer[0] = min_i;
        answer[1] = min_j;
        return answer;
    }
    
    public static void main(String[] args)
    {
        int[] arr1 = new int[]{1,3,5,11,2};
        int[] arr2 = new int[]{23,127,235,19,8};
        int[] ans = findPair(arr1, arr2);
        System.out.println("( "+arr1[ans[0]]+" , "+arr2[ans[1]]+" )");
    }
    
}
