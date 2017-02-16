/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

/**
 *
 * @author Kunwar
 */
public class FB
{
    private static boolean Function(int[] arr,int SUM){
        int i=0,j=0,sum = arr[0];
        while(j<arr.length && sum != SUM && i < arr.length){
            
            if(sum < SUM){
                    sum += arr[j];
                    j++;
            }else if(sum > SUM){
                if(arr[i] < 0)
                    sum += arr[i];
                else
                    sum-=arr[i];
                i++;
                }
            else{
                break;
            };
            System.out.println(sum);
        }
        
        if(sum == SUM)
            return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{-1,3,-5,23};
        int SUM = 18;
        System.out.println(Function(arr, SUM));
    }
    
}
