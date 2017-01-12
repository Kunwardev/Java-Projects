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
public class LoopDetectAndRemoval
{
    
    public static int LengthRecursive(List head){
        if(head == null){
            return 0;
        }else{
            return LengthRecursive(head.next)+1;
        }
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
        head.next.next.next.next.next.next.next = head.next.next.next;
        
        List slowptr = head;
        List fastptr = head;
        int k = 0;
        do{
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
            k++;
        }while(slowptr != fastptr);
        //System.out.println(k);
        slowptr = head;
        while(slowptr != fastptr){
            slowptr = slowptr.next;
            fastptr = fastptr.next;
        }
        for(int i=0;i<k-1;i++)
            slowptr =  slowptr.next;
        slowptr.next = null;
        List temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(LengthRecursive(head));
    }
}
