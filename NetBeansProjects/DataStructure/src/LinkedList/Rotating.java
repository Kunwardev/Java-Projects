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
public class Rotating
{    
    private static LIST rotateOne(LIST head,int d){
        int k = 1;
        LIST last = head;
        LIST kthNode = head;
        while(k<d){
            kthNode = kthNode.next;
            k++;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = head;
        head = kthNode.next;
        kthNode.next = null;
        return head;
    }
    
    public static void printList(LIST head){
        LIST temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args)
    {
        LIST head = new LIST(1);
        head.next = new LIST(2);
        head.next.next = new LIST(3);
        head.next.next.next = new LIST(4);
        head = rotateOne(head,1);
        printList(head);
    }
    
}
