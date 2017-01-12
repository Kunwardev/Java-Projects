/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch2Question2
{
    private static int NthFromLast(List head,int n){
        int x = -1;
        
        if(head == null || n<1)
            return x;
        List p1 = head;
        List p2 = head;
        for(int i=0;i<n-1;i++){
            if(p1 == null){
                return x;
            }
            p1 = p1.next;
        }
        while(p1.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        x = p2.data;
        return x;
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);
        head.next.next.next = new List(4);
        head.next.next.next.next = new List(5);
        head.next.next.next.next.next = new List(6);
        head.next.next.next.next.next.next = new List(7);
        int p = NthFromLast(head, 3);
        System.out.println(p);
    }
    
    
}
