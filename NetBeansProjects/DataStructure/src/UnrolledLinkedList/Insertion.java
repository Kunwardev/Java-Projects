/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UnrolledLinkedList;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */

class UList{
    int countNumber;
    int data[];
    UList next;

    public UList()
    {
        countNumber = 0;
        data = new int[3];
        this.next = null;
    }
    
}

public class Insertion
{
    public static UList Insert(UList head,int data)
    {
        if(head == null){
            head = new UList();
            head.data[head.countNumber] = data;
            head.countNumber++;
        }
        else{
            head.data[head.countNumber] = data;
            head.countNumber++;
        }
        return head;
    }
    
    public static void Print(UList head)
    {
        while(head != null)
        {
            for(int i=0;i<head.countNumber;i++)
            {
                System.out.print(head.data[i] + " ");
            }
            System.out.print(" -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args)
    {
        UList head= new UList();
        UList temp = head;
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        while(data >= 0)
        {
            head = Insert(head, data);
            if(head.countNumber == 3)
            {
                head.next = new UList();
                head = head.next;
            }
            data = in.nextInt();
        }
        head = temp;
        Print(head);
    }
    
}
