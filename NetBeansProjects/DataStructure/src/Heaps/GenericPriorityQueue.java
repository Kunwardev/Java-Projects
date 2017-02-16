/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Heaps;

import java.util.PriorityQueue;

/**
 *
 * @author Kunwar
 */
public class GenericPriorityQueue
{
    public static void main(String[] args)
    {
        
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(100);
        pq.add(2);
        pq.add(4);
        pq.add(6);
        pq.add(8);
        System.out.println(pq);
        pq.remove(2);
        System.out.println(pq);
    }
}
