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
public class ch2Question3
{
    private static void DeleteMiddle(List n){
        if(n == null || n.next == null){
            System.out.println("Not Working");
            return;
        }
        List temp = n.next;
        n.data = temp.data;
        n.next = temp.next;
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
        DeleteMiddle(head.next.next.next);
        List temp = head;
        while(temp!=null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
    }
}
