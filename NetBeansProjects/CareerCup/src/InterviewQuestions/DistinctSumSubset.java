/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InterviewQuestions;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Kunwar
 */
public class DistinctSumSubset
{
    private static int Travers(int[] arr,boolean[] check){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(check[i] == true)
                sum+=arr[i];
        }
        return sum;
    }
    static HashSet<Integer> ans = new HashSet<>();
    private static void Function(int [] arr,boolean[] check,int i){
        if(i == arr.length-1){
            check[i] = false;
            ans.add(Travers(arr,check));
            check[i] = true;
            ans.add(Travers(arr,check));
        }else{
            check[i] = false;
            Function(arr,check,i+1);
            check[i] = true;
            Function(arr, check, i+1);
        }
    }
    
    private static void FunctionOptimized(int[] arr,int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        boolean[][] check = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
            Arrays.fill(check[i], false);
        for(int i=0;i<n;i++){
            check[i][0] = true;
            //check[i][sum] = true;
        }
        for(int i=1;i<=n;i++){
            check[i][arr[i-1]] = true;
            for(int j=1;j<=sum;j++){
                if(check[i-1][j] == true){
                    check[i][j] = true;
                    check[i][j+arr[i-1]] = true;
                }
            }
        }
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(check[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<=sum;i++){
            if(check[arr.length][i] == true)
                System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args)
    {
        int [] arr = new int[]{2,4,5};
        //boolean[] check = new boolean[3];
        //Function(arr, check, 0);
        FunctionOptimized(arr, arr.length);
        //System.out.println(ans);
    }
    
}
