/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class UnionIntersection
{
    static LIST UNION, INTER;
    private static void Function(LIST first, LIST second){
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> inter = new ArrayList<>();
        while(first != null){
            union.add(first.data);
            first = first.next;
        }
        while(second != null){
            if(union.contains(second.data))
                inter.add(second.data);
            else
                union.add(second.data);
            second = second.next;
        }System.out.println(union);
        System.out.println(inter);
        LIST un = new LIST(union.get(0));
        LIST in = null;
        if(inter != null)
            in = new LIST(inter.get(0));
        UNION = un;INTER = in;
        
        for(int i=1;i<union.size();i++){
            un.next = new LIST(union.get(i));
            un = un.next;
        }
        for(int i=1;i<inter.size();i++){
            in.next = new LIST(inter.get(i));
            in = in.next;
        }
        
        while(UNION != null){
            System.out.print(UNION.data+" ");
            UNION = UNION.next;
        }
        System.out.println("");
        while(INTER != null){
            System.out.print(INTER.data+" ");
            INTER = INTER.next;
        }
    }
    public static void main(String[] args){
        LIST first = new LIST(1);
        first.next = new LIST(4);
        first.next.next = new LIST(3);
        
        LIST second = new LIST(2);
        second.next = new LIST(1);
        second.next.next = new LIST(3);
        second.next.next.next = new LIST(5);
        Function(first, second);
    }
    
}
