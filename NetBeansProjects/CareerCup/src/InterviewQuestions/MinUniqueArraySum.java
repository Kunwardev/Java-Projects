/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class MinUniqueArraySum
{
    private static int Sum(int[] arr){
        int total = 0;
        HashSet<Integer> mp = new HashSet<>();
        int i=0;
        while(i < arr.length){
            if(mp.contains(arr[i])){
                arr[i]++;
            }else{
                mp.add(arr[i]);
                total += arr[i];
                i++;
            }
        }
        return total;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,1,2};
        System.out.println(Sum(arr));
    }
    
}
