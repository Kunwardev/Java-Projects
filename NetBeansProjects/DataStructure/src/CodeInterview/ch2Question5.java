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
public class ch2Question5
{
    private static void detectAndRemoveLoop(List head){
        List slow = head;
        List fast = head;
        int k = 0;
        do{
            slow = slow.next;
            fast = fast.next.next;
            k++;
        }while(slow != fast);
        
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        for(int i=0;i<k-1;i++)
            slow = slow.next;
        slow.next = null;
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
        head.next.next.next.next.next.next.next =  head.next.next.next;
        
        detectAndRemoveLoop(head);
        while(head!=null){
            System.out.print(head.data);
            head = head.next;
        }
    }
}
