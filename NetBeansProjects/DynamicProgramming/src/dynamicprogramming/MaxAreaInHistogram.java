/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dynamicprogramming;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class MaxAreaInHistogram
{
    public static int maxHistogram(int input[]){
        Deque<Integer> dq = new LinkedList<>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0;i<input.length;){
            if(dq.isEmpty() || input[dq.peekFirst()] <= input[i])
                dq.offerFirst(i++);
            else{
                int top = dq.pollFirst();
                if(dq.isEmpty()){
                    area = input[top] * i;
                }else{
                    area = input[top] * (i - dq.peekFirst()-1);
                }
                if(area > maxArea)
                    maxArea = area;
            }
        }
        while(!dq.isEmpty()){
            int top = dq.pollFirst();
            if(dq.isEmpty())
                area = input[top] * i;
            else
                area = input[top] * (i - dq.peekFirst() - 1);
            if(area > maxArea)
                maxArea = area;
        }
    return maxArea;
    }
    
    public static void main(String[] args)
    {
        int[] input = new int[]{1,2,3,4,5,5};
        System.out.println(maxHistogram(input));
    }
    
}
