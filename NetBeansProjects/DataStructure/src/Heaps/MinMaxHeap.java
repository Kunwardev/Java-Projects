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
public class MinMaxHeap
{
    PriorityQueue<Integer> min = new PriorityQueue<>();
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    
    public void findMax(){
        System.out.println(max.peek());
    }
    
    public void findMin(){
        System.out.println(min.peek());
    }
    
    public void insert(int data){
        min.add(data);
        max.add(data);
    }
    
    public void deleteMin(){
        int x = min.remove();
        max.remove(x);
    }
    
    public void deleteMax(){
        int x = max.remove();
        min.remove(x);
    }
    
    public boolean delete(int data){
        if(min.contains(data) && max.contains(data)){
            min.remove(data);
            max.remove(data);
            return true;
        }
        System.out.println("Element Not Found");
        return false;
    }
    
}

