/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

/**
 *
 * @author Kunwar
 */
public class ReversingLinkedList
{
    private static LIST reverse(LIST head){
        LIST prev = null;
        LIST current = head;
        LIST next;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public static void main(String[] args)
    {
        LIST head = new LIST(4);
        head.next = new LIST(3);
        head.next.next = new LIST(2);
        head.next.next.next = new LIST(1);
        head = reverse(head);
        while(head!= null){
            System.out.print(head.data+" ");
            head = head.next;
        }   
    }
}
