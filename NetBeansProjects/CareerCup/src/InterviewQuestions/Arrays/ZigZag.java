/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions.Arrays;

/**
 *
 * @author Kunwar
 */
public class ZigZag
{
    private static void ZigZag(int arr[]){
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n-2;i++){
            if(flag){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            flag = !flag;
        }
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{4,3,7,8,6,2,1};
        ZigZag(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
