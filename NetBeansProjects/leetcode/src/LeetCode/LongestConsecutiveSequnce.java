/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
public class LongestConsecutiveSequnce
{
    public static  int longest(int[] nums){
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: nums){
            pq.add(i);
        }
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        return count;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{100,4,200,1,2,3};
        longest(arr);
        
    }
    
}
