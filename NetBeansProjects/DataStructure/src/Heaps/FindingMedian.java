/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
public class FindingMedian
{
    private static float Median(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int flag = 0;
        int x = arr.length/2;
        if(arr.length%2 == 1){
            flag = 1;
            while(x-- != 0)
                pq.remove();
        }else{
            while(x-- != 1)
                pq.remove();
        }
        float p;
        if(flag == 1)
            p = pq.remove();
        else{
            p = (float) ((pq.remove()+pq.remove())/2.0);
        }
        return p;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Median(arr));
    }
    
}
