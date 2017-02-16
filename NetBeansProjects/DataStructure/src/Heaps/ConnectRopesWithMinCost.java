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
public class ConnectRopesWithMinCost
{
    private static int Cost(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: arr)
            pq.add(i);
        int sum = 0;
        System.out.println(pq);
        while(pq.size()!=1){
            int a = pq.remove();
            int b = pq.remove();
            sum += (a+b);
            pq.add(a+b);
            System.out.println(pq);
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,2,10};
        System.out.println(Cost(arr));
    }
    
}
