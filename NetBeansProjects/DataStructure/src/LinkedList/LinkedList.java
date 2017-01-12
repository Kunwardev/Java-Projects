/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */

class List{
    int data;
    List next;
    List(){
        this.next = null;
    }
    List(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList
{

    public static int LengthIterative(List head){
        int k=0;List temp = head;
        while(temp != null){
            k++;
            temp = temp.next;
        }
        return k;
    }
    
    public static int LengthRecursive(List head){
        if(head == null){
            return 0;
        }else{
            return LengthRecursive(head.next)+1;
        }
    }
    
  public static List RemoveDuplicates(List head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
   List current = head;
    List nextNode;
    while(current.next != null)
        {
        nextNode = current.next;
        if(current.data == nextNode.data)
           current.next = nextNode.next;
        else
            current = current.next;
    }
    return head;
    
}
    
    public static void search(List head,int data)
    {
        List temp = head;
        int pos = 0;
        if(head.data == data)
            System.out.println(data+" is positioned at index Number "+pos);
        else
        {
            while(temp.next!=null)
            {
                temp = temp.next;
                if(temp.data == data)
                {
                    pos++;
                    System.out.println(data+" is positioned at index Number "+pos);
                    break;
                }
            }
        }
    }
    
    public static List reverse(List head)
    {
        List prevNode = null;
        List nextNode;
        while(head!=null)
        {
            nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
    public static void delete(List head,int data)
    {
        
        if(head.data == data)
        {
            head = head.next;
            return;
        }
        else{
            List temp = head;
            while(temp.next!=null)
            {
                if(temp.next.data == data)
                {
                    temp.next = temp.next.next;
                    break;
                }
                else
                    temp = temp.next;
            }
        }
    }
    
    public static void main(String[] args)
    {
        
        List head = new List();
    
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        head.data = data;
        List current = head;
        while(true)
        {
            data = sc.nextInt();
            if(data == 0)
                break;
            else
            {
                List temp = new List();
                temp.data = data;
                head.next = temp;
                head = temp;
            }
        }
        head = current;
        List temp = head;
        while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
        System.out.println("null");
        
        delete(head,2);
        search(head,5);
        List newtemp = head;
        newtemp = RemoveDuplicates(head);
        while(newtemp!=null)
    {
        System.out.print(newtemp.data+"->");
        newtemp = newtemp.next;
    }
        
        System.out.println(LengthRecursive(head));
    }
    
}
