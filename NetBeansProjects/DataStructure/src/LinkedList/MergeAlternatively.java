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
public class MergeAlternatively
{
    static LIST head1,head2;
    private static void Function(){
        LIST heead1 = head1, heead2 = head2;
        LIST heead1n ,heead2n;
        while(heead1 != null && heead2 != null){
            heead1n = head1.next;
            heead2n = head2.next;
            head1.next = heead2n;
            head2.next = heead1n;
            heead1 = heead1n;
            heead2 = heead2n;
        }
        head2 = heead2;
    }
    
    public static void main(String[] args)
    {
        head1 = new LIST(1);
        head1.next = new LIST(2);
        head1.next.next = new LIST(3);
                
        head2 = new LIST(4);
        head2.next = new LIST(5);
        head2.next.next = new LIST(6);
        Function();
        while(head1 != null){
            System.out.print(head1.data+" ");
            head1 = head1.next;
        }
    }
    
}
