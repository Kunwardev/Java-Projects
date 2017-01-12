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
public class MaxSumArrayWithTwist
{
    private static int Function(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>0 && arr[i+1]>0){
                sum+=arr[i]+arr[i+1];
                i++;
            }
            else if(arr[i]<0 && arr[i+1]>0){
                sum+=arr[i+1];
                i++;
            }
            else if(arr[i]>0 && arr[i+1]<0){
                sum+=arr[i];
            }
            else if(arr[i]<0 && arr[i+1]<0){
                int x = Math.abs(arr[i]);
                int y = Math.abs(arr[i+1]);
                if(x > y){
                    sum-=y;
                    i++;
                }else
                    sum-=x;
            }
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{10,20,30,-10,-50,40,-50,-1,-3};
        int sum = Function(arr);
        System.out.println(sum);
    }
    
}
