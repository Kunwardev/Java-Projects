/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class Dequeues
{
    private static void MaxSum(int[] arr,int k){
        int max = 0;
        if(k >= arr.length){
            
            for(int p: arr)
                if(p > max)
                    max = p;
            System.out.println(max);
        }else{
            int i = 0;
            Deque<Integer> dq = new LinkedList<>();
            for(;i<k;i++){
                if(max < arr[i])
                    max = arr[i];
                dq.addFirst(arr[i]);
            }System.out.println(max);
            while(i < arr.length){
                dq.removeLast();
                dq.addFirst(arr[i++]);
                max = check(dq);
                System.out.println(max);
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{12, 1, 78, 90, 57, 89, 56};
        MaxSum(arr, 3);
        
    }

    private static int check(Deque<Integer> dq)
    {
        int max = 0;
        for(int p: dq){
            if(p > max)
                max = p;
        }
        return max;
    }
    
}
