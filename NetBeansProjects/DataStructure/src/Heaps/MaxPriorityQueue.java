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
public class MaxPriorityQueue
{
    private static void Function(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        pq.add(3);
        pq.add(7);
        pq.add(8);
        System.out.println(pq);
    }
    
    public static void main(String[] args)
    {
        Function();
    }
    
}
