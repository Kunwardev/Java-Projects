/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Queue;

import java.util.LinkedList;
import java.util.Deque;
/**
 *
 * @author Kunwar
 */
public class SumOfMinMaxOfSubArrayofSizek
{
    private static int Function(int[] arr, int k){
        Deque<Integer> dq = new LinkedList<>();
        int sum = 0;
        if(k >= arr.length){
            return Find(arr);
        }
        else{
            
            int i;
            for(i=0;i<k;i++)
                dq.offerFirst(arr[i]);
            sum += Find(dq);
            while(i < arr.length){
                dq.pollLast();
                dq.offerFirst(arr[i]);
                sum += Find(dq);
                i++;
            }
        }
        return sum;
    }

    private static int Find(Deque<Integer> dq){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int p: dq){
            if(p > max)
                max = p;
            if(p < min)
                min = p;
        }
        return max + min;
    }
    
    private static int Find(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int p: arr){
            if(p > max){
                max = p;
            }
            if(p < min){
                min = p;
            }
        }
        return max+min;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{2, 5, -1, 7, -3, -1, -2};
        int p = Function(arr, 4);
        System.out.println(p);
    }
    
}
