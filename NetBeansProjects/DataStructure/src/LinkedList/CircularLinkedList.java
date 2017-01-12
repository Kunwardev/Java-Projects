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

public class CircularLinkedList
{
    public static void main(String[] args)
    {
        List a = new List();
        List b = new List();
        List c = new List();
        Scanner s = new Scanner(System.in);
        a.data = s.nextInt();
        b.data = s.nextInt();
        c.data = s.nextInt();
        a.next = b;
        b.next = c;
        c.next = a;
        for(int i=0;i<7;i++)
        {
            System.out.print(a.data);
            a = a.next;
        }
    }
 
}
