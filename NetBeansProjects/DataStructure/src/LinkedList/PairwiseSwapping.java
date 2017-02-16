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
public class PairwiseSwapping
{
    private static LIST Reverse(LIST head){
        LIST temp = head;
        while(head.next!=null && head!=null){
            int p = head.data;
            head.data = head.next.data;
            head.next.data = p;
            if(head.next.next == null)
                break;
            head = head.next.next;
        }
        return temp;
    }
        
    public static void main(String[] args)
    {
        LIST head = new LIST(1);
        head.next = new LIST(2);
        head.next.next = new LIST(3);
        head.next.next.next = new LIST(4);
        head.next.next.next.next = new LIST(5);
        LIST temp = Reverse(head);
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}
