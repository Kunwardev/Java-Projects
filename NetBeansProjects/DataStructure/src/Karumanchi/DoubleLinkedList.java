/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Karumanchi;

/**
 *
 * @author Kunwar
 */

class DoubleLinked
{
    int data;
    DoubleLinked next;
    DoubleLinked prev;
    
    DoubleLinked(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
}

public class DoubleLinkedList
{
    public static DoubleLinked insertAtBeginning(DoubleLinked head, int data)
    {
        DoubleLinked temp = new DoubleLinked(data);
        if(head == null)
            head = temp;
        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        return head;
    }
    
    public static DoubleLinked insertAtEnd(DoubleLinked head, int data)
    {
        if(head == null)
            head = insertAtBeginning(head, data);
        else{
        DoubleLinked temp = new DoubleLinked(data);
        DoubleLinked headduplicate = head;
        while(headduplicate.next != null)
        {
            headduplicate = headduplicate.next;
        }
        headduplicate.next = temp;
        temp.prev = headduplicate;
        }
        return head;
    }
    
    public static int length(DoubleLinked head)
    {
        int counter = 0;
        while(head != null)
        {
            counter++;
            head = head.next;
        }
        return counter;
    }
    
    public static DoubleLinked insertInMiddle(DoubleLinked head, int loc,int data)
    {
        int length = length(head);
        if(loc > length)
        {
            head = insertAtEnd(head, data);
        }
        else
        {
            DoubleLinked temp = new DoubleLinked(data);
            DoubleLinked headduplicate = head;
            for(int i=0;i<loc-1;i++)
            {
                headduplicate = headduplicate.next;
            }
            temp.prev = headduplicate;
            temp.next = headduplicate.next;
            headduplicate.next.prev = temp;
            headduplicate.next = temp;            
        }
        return head;
    }
    
    public static DoubleLinked deleteAtBeginning(DoubleLinked head)
    {
         head = head.next;
         head.prev = null;
         return head;
    }
    
    public static DoubleLinked deleteAtEnd(DoubleLinked head)
    {
        DoubleLinked headduplicate = head;
        while(headduplicate.next != null)
            headduplicate = headduplicate.next;
        headduplicate.prev.next = null;
        headduplicate = null;
        return head;
    }
    
    public static DoubleLinked deleteAtLoc(DoubleLinked head, int loc)
    {
        int length = length(head);
        if(loc > length)
            head = deleteAtEnd(head);
        else if(loc == 0)
            head = deleteAtBeginning(head);
        else
        {
            DoubleLinked headduplicate = head;
            for(int i=0;i<loc;i++)
            {
                headduplicate = headduplicate.next;
            }
            DoubleLinked tep = headduplicate.prev;
            tep.next = headduplicate.next;
            headduplicate.next.prev = tep;
        }
        return head;
    }
    
    public static void DoublePrint(DoubleLinked head)
    {
        while(head.next != null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println(head.data);
        System.out.print(head.data+" ");
        while(head.prev != null)
        {
            head = head.prev;
            System.out.print(head.data+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        DoubleLinked head = null;
        head = insertAtBeginning(head, 1);
        head = insertAtBeginning(head, 2);
        head = insertAtBeginning(head, 3);
        head = insertAtBeginning(head, 4);
        head = insertAtBeginning(head, 5);
        head = insertAtEnd(head, 6);
        head = insertInMiddle(head, 4, 15);
         DoublePrint(head);
       // head = deleteAtBeginning(head);
       // head = deleteAtEnd(head);
        head = deleteAtLoc(head, 3);
        DoublePrint(head);
    }
    
}
