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
class DList{
    int data;
    DList prev;
    DList next;
    
    public DList(int data){
        this.data = data; 
        this.prev = null;
        this.next = null;
    }
    
}
public class DoublyLinkedList
{    
    static DList head = null;
    static DList tail = null;
    static int size = 0;
    
    public static void InsertFirst(int data){
        if(head == null)
        {
            head = new DList(data);
            tail = head;
            size++;
        }
        else{
            DList temp = new DList(data);
            head.prev = temp;
            temp.next = head;
            head = temp;
            size++;
        }
    }
    
    public static void InsertPos(int data,int pos){
        if(pos < 1)
            InsertFirst(data);
        else if(pos >= size)
            InsertLast(data);
        else{
            DList temp = new DList(data);
            DList spare = head;
            for(int i=1;i<pos;i++)
                head = head.next;
            temp.next = head.next;
            temp.prev = head;
            head.next.prev = temp;
            head.next = temp;
            head = spare;
        }
    }
    
    public static void InsertLast(int data){
        if(tail == null){
            tail = new DList(data);
            head = tail;
            size++;
        }
        else{
            DList temp = new DList(data);
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            size++;
        }
    }
    
    public static void DeleteFirst(){
        head = head.next;
        head.prev = null;
        size--;
    }
    
    public static void DeltePos(int pos){
        /*To be Done*/
        DList spare = head;
        for(int i=0;i<pos;i++)
            spare = spare.next;
        spare.next.next.prev = spare;
        spare.next = spare.next.next;
        //head = spare;
    }
    
    public static void DeleteLast(){
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    
    public static void PrintForward(){
        DList spare = head;
        while(spare != null){
            System.out.print(spare.data+" ");
            spare = spare.next;
        }
        System.out.println("");
    }
    
    public static void PrintBackward(){
        DList spare = tail;
        while(spare != null){
            System.out.print(spare.data+" ");
            spare = spare.prev;
        }
        System.out.println("");
    }
    
    public static void main(String[] args)
    {
        InsertFirst(1);
        InsertFirst(2);
        InsertFirst(3);
        InsertFirst(4);
        InsertFirst(5);
        InsertLast(6);
        InsertPos(15, 8);
        PrintForward();
        DeltePos(1);
        PrintForward();
        PrintBackward();
    }
    
}
