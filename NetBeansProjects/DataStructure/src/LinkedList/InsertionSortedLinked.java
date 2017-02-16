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
public class InsertionSortedLinked
{
    private static LIST insert(LIST head, int x){
        LIST current;
        if(head == null){
            head = new LIST(x);
            return head;
        }else if(head.data > x){
            current = new LIST(x);
            current.next = head;
            return current;
        }
        else{
            current = head;
            LIST temp = new LIST(x);
            while(current.next != null && current.next.data < x){
                current = current.next;
            }
            
            temp.next = current.next;
            current.next = temp;
            return head;
        }
    }
    
    public static void main(String[] args)
    {
        LIST head = null;
        int[] arr= new int[]{1,3,4,2};
        head = insert(head, arr[2]);
        head = insert(head, arr[1]);
        head = insert(head, arr[0]);
        head = insert(head, arr[3]);
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    
}
