/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.Arrays;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class CountTripletsWithLesserValue
{
    private static int Count(int arr[],int sum){
        int length = arr.length;
        Arrays.sort(arr);
        int count = 0;
        for(int start = 0;start<length-2;start++){
            int i = start+1;int j = length-1;
            while(i < j){
                if(arr[start]+arr[i]+arr[j] >= sum){
                    j--;
            }else{
                    count+=(j-i);
                    i++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[]{5,1,3,4,7};
        int  p = Count(arr, 12);
        System.out.println(p);
    }
}