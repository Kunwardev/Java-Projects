/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

/**
 *
 * @author Kunwar
 */
public class NUmberofStepstoreachEnd
{
    private static int Function(int arr[]){
        int n = arr.length;
        int jumps[] = new int[arr.length];
        int i,j;
        if(n == 0)
            return -1;
        if(arr[0] == 0)
            return -1;
        jumps[0] = 0;
        int INT_MAX = 100000;
        
        for(i = 1 ; i<n ; i++){
            jumps[i] = INT_MAX;
            for(j=0; j<i; j++){
                if(i <= j+arr[j] && jumps[j] != INT_MAX){
                    jumps[i] = min(jumps[i], jumps[j]+1);
                    break;
                }
            }
        }
        return jumps[n-1];
    }
    
    private static int min(int a, int b){
        if(a < b)
            return a;
        else
            return b;
    }
    
    public static void main(String[] args)
    {
        int arr[] = new int[]{1,3,6,1,0,9};
        int x = Function(arr);
        System.out.println(x);
    }
    
}
