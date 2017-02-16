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
public class RemoveElementRecursion
{
    private static LIST remove(LIST head,int x){
        if(head == null)
            return null;
        head.next = remove(head.next, x);
        return (head.data == x) ? head.next : head;
    }
    
    public static void main(String[] args)
    {
        LIST head = new LIST(1);
        head.next = new LIST(2);
        head.next.next = new LIST(3);
        head.next.next.next = new LIST(6);
        head.next.next.next.next = new LIST(6);
        head.next.next.next.next.next = new LIST(4);
        head = remove(head, 6);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
