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
public class PartitionUsingGivenValue
{
    private static LIST partition(LIST head,int x){
        LIST prev = null;
        LIST prevs = null;
        LIST that = null;
        LIST thats = null;
        LIST next = null;
        LIST nexts = null;
        
        while(head!=null){
            if(head.data < x){
                if(prev == null){
                    prev = new LIST(head.data);
                    prevs = prev;
                }else{
                    prev = new LIST(head.data);
                }
                prev = prev.next;
            }else if(head.data == x){
                if(that == null){
                    that = new LIST(head.data);
                    thats = that;
                }else{
                    that = new LIST(head.data);
                }
                that = that.next;
            }else{
                if(next == null){
                    next = new LIST(head.data);
                    nexts = next;
                }else{
                    next = new LIST(head.data);
                }
                next = next.next;
            }
            head = head.next;
        }
        prevs.next = thats;
        thats.next = nexts;
        return prevs;
    }
    
    public static void main(String[] args)
    {
        LIST head = new LIST(2);
        head.next = new LIST(3);
        head.next.next = new LIST(1);
        head.next.next.next = new LIST(5);
        head.next.next.next.next = new LIST(2);
        LIST text = partition(head, 2);
        while(text!=null)
        {
            System.out.println(text.data);
            text = text.next;
        }
    }
    
}
