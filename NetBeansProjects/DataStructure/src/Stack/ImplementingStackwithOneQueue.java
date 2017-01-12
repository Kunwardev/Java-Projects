/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Kunwar
 */
public class ImplementingStackwithOneQueue
{

    private static void push(int i)
    {
        int size = q.size();
        q.offer(i);
        while((size--) != 0)
        {
            int ele = q.poll();
            q.offer(ele);
        }
    }

    private static int peek()
    {
        return q.peek();
    }

    private static void pop()
    {
        if(q.isEmpty())
            System.out.println("Stack is Empty");
        else
            System.out.println("Element popped is "+q.poll());
    }
    static Queue<Integer> q = new LinkedList();
    public static void main(String[] args)
    {
        push(4);
        push(6);
        push(8);
        System.out.println(peek());
        pop();
        System.out.println(peek());
    }
}
