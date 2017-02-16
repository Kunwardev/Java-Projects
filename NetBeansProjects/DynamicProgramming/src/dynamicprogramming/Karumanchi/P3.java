/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming.Karumanchi;

/**
 *
 * @author Kunwar
 */
public class P3
{
    private static int Max(int[] arr){
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            int currentSum= 0;
            for(int j=i;j<arr.length;j++){
                currentSum += arr[j];
                if(currentSum > maxSum)
                    maxSum = currentSum;
            }
        }
        return maxSum;
    }

    private static int MaxDp(int[] arr){
        int[] Ma = new int[arr.length];
        if(arr[0] < 0)
            Ma[0] = 0;
        else
            Ma[0] = arr[0];
        int maxSum = 0;
        for(int i=1;i<arr.length;i++){
            if(Ma[i-1] + arr[i] > 0){
                Ma[i] = Ma[i-1] + arr[i];
            }else
                Ma[i] = 0;
        }
        for(int i:Ma)
        {
            if(i > maxSum)
                maxSum = i;
        }
        return maxSum;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{-2,11,-4,13,-5,2};
        int  p = MaxDp(arr);
        System.out.println(p);
    }
    
}
