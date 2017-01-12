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
public class ch2Question4
{
    private static List Add(List a,List b){
        List c = new List();
        List head = c;
        int carry = 0;
        while(a!= null && b!= null){
            int sum = a.data + b.data;
            c.data = (sum + carry)%10;
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            c.next = new List();
            c = c.next;
            a = a.next;
            b = b.next;
        }
        while(a!=null){
            int sum = a.data + carry;
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            c.data = sum%10;
            c.next = new List();
            a = a.next;
            c = c.next;
            if(a == null){
                c.data = carry;
                c.next = new List();
                c = c.next;
            }
        }
        while(b!=null){
            int sum = b.data + carry;
            if(sum > 9)
                carry = 1;
            else
                carry = 0;
            c.data = sum%10;
            c.next = new List();
            b = b.next;
            c = c.next;
            if(a == null){
                c.data = carry;
                c.next = new List();
                c = c.next;
            }
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        List a = new List(6);
        a.next = new List(9);
        a.next.next = new List(2);
        
        List b = new List(3);
        b.next = new List(1);
        b.next.next = new List(5);
        
        List head = Add(a, b);
        while(head!=null){
            if(head.next == null && head.data == 0)
                break;
            System.out.print(head.data);
            head = head.next;
        }
    }
    
}
