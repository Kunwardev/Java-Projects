/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BinaryIndexTree;

/**
 *
 * @author Kunwar
 */
public class BIT
{
    private static void Update(int[] arr,int i, int x){
        int diff = x - arr[i];
        int j = i+1;
        while(j < BIT.length){
            BIT[j] += diff;
            j = j + (j & -j);
        }
    }
        static int[] BIT;
    private static int[] Function(int []arr){
        BIT = new int[arr.length+1];
        BIT[0] = 0;
        for(int i=0;i<arr.length;i++){
            int j = i+1;
            while(j < BIT.length){
                BIT[j] += arr[i];
                j = j + (j & -j);
            }
        }
        return BIT;
    }
    
   // private static void sum(int )
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2,1,1,3,2,3,4,5,6,7,8,9};
        int[] BIT = Function(arr);
        //Update(arr, 3, 9);
        
        for(int i: BIT){
            System.out.print(i+" ");
        }
    }
    
}
