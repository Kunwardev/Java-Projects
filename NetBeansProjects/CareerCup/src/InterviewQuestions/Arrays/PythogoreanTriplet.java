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
public class PythogoreanTriplet
{
    private static boolean Find(int arr[]){
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        //for(int j:arr)
          //  System.out.print(j+"  ");
        for(int i=arr.length-1;i>=2;i--){
            int start = 0,end = i-1;
            while(start < end){
                //System.out.println(arr[i]+" "+arr[start]+" "+arr[end]);
                if(arr[end]+arr[start] == arr[i])
                    return true;
                else if(arr[end]+arr[start] < arr[i]){
                    start++;
                }else if(arr[end]+arr[start] > arr[i])
                    end--;
                
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,4,6,12,5};
        System.out.println(Find(arr));
    }
    
}
