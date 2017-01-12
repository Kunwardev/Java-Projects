/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
/**
 *
 * @author Kunwar
 */
public class ch2Question1
{
    private static class List{
        int data;
        List next;
        
        List(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    
    private static void RemoveDuplicateswithoutSpace(List head){
        if (head == null) return;
 List previous = head;
 List current = previous.next;
 while (current != null) {
 List runner = head;
 while (runner != current) { // Check for earlier dups
 if (runner.data == current.data) {
 List tmp = current.next; // remove current
 previous.next = tmp;
 current = tmp; // update current to next node
 break; // all other dups have already been removed
 }
 runner = runner.next;
 }
 if (runner == current) { // current not updated - update now
 previous = current;
 current = current.next;
 }
 }
 while(head!= null)
 {
     System.out.println(head.data);
     head = head.next;
 }
            
}
    
    static Map<List,Integer> mp = new HashMap<>();
    
    private static void RemoveDuplicateswithSpace(List n){
        
 Hashtable table = new Hashtable();
 List previous = null;
 while (n != null) {
 if (table.containsKey(n.data)) previous.next = n.next;
 else {
 table.put(n.data, true);
 previous = n;
 }
 n = n.next;
 }
}
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(2);
        head.next.next.next = new List(3);
        head.next.next.next.next = new List(4);
        head.next.next.next.next.next = new List(3);
        RemoveDuplicateswithSpace(head);
        List temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}