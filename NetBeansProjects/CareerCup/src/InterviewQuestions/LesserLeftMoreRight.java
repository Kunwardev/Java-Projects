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
public class LesserLeftMoreRight
{
    private static int Function(int[] arr){
        int[][] minMax = new int[2][arr.length];
        minMax[0][0] = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > min)
            {
                min = arr[i];
            }
            minMax[0][i] = min;
        }
        int max = arr[arr.length-1];
        minMax[1][arr.length-1] = arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            if(arr[j] < max){
                max = arr[j];
            }
            minMax[1][j] = max;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= minMax[0][i] && arr[i] <= minMax[1][i])
                return arr[i];
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,4,3,7,4,1,2,8,10};
        System.out.println(Function(arr));
    }
    
}
