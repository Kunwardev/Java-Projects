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

class newList{
    int data;
    newList next;
    newList()
    {
        this.next = null;
        this.data = -1;
    }
}

public class linkedlisttried
{
    public static boolean isEmpty(newList head){
        return (head == null);
    }
    
    public static newList insertFirst(newList head,int data)
    {
        
        if(head == null)
           head.data = data;
        
        {
            newList temp = new newList();
            temp.data = data;
            temp.next = head;
            head = temp;
        }
        return head;
    }
    
    public static void displayList(newList head)
    {
        newList temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static newList deleteFirst(newList head)
    {
        newList temp = head;
        head = head.next;
        temp = head;
        return temp;
    }
    
    public static newList delete(newList head,int data)
    {
        newList temp = head;
        if(head.next.data == data)
        {
            head = head.next;
            temp = head;
            return temp;
        }
        else
        {
            while(temp != null)
            {
                head = head.next;
                if(head.next.data == data)
                {
                    head.next = head.next.next;
                    break;
                }
            }
            temp = head;
            return temp;
        }
}
    
    public static int Find(newList head,int data)
    {
        newList temp = head;
        int count = 0;
        while(temp != null)
        {
            if(temp.data == data)
                break;
            temp = temp.next;
            count ++;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        newList head = new newList();
        head = insertFirst(head, 1);
        head = insertFirst(head, 2);
        head = insertFirst(head, 3);
        head = insertFirst(head, 4);
        head = insertFirst(head, 5);
        head = insertFirst(head, 6);
        
        
        head = delete(head, 4);
        displayList(head);
        
    }
}
