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
public class StringComparisons
{
    static Listchar first;
    static Listchar second;
    
    private static int compare(){
        if(first == null && second == null)
            return 0;
        if(first == null)
            return -1;
        if(second == null)
            return 1;
        while(first != null && second != null && first.data == second.data){
            first = first.next;
            second = second.next;
        }
        if(first == null && second == null)
            return 0;
        if(first == null)
            return -1;
        if(second == null)
            return 1;
        if(first.data > second.data)
            return 1;
        return -1;
    }
    
    public static void main(String[] args)
    {
        first = new Listchar('g');
        first.next = new Listchar('e');
        first.next.next = new Listchar('e');
        first.next.next.next = new Listchar('k');
        first.next.next.next.next = new Listchar('s');
        first.next.next.next.next.next = new Listchar('b');
        
        second = new Listchar('g');
        second.next = new Listchar('e');
        second.next.next = new Listchar('e');
        second.next.next.next = new Listchar('k');
        second.next.next.next.next = new Listchar('s');
        second.next.next.next.next.next = new Listchar('b');
        
        System.out.println(compare());
    }
    
}
