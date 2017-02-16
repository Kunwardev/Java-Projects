/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch10Question1
{
    private static void Merge(int[] A,int[] B,int m,int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while( i >= 0 && j>=0 ){
            if(A[i] > B[j]){
                A[k] = A[i];
                i--;
            }else{
                A[k] = B[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            A[k] = A[i];
            k--;
            i--;
        }
        while(j>=0){
            A[k] = B[j];
            k--;
            j--;
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[15];
        for(int i=0;i<9;i++){
            arr[i] = i+3;
        }
        int[] b = new int[6];
        for(int i=0;i<6;i++){
            b[i] = i+5;
        }
        Merge(arr, b, 9, 6);
        for(int i:arr)
            System.out.print(i+" ");
    }
    
}
