/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedList;

import CodeInterview.List;

/**
 *
 * @author Kunwar
 */

public class IntersectionLinkedList
{
    static LIST first, second;
    
    private static int countNodes(LIST x){
        int count = 0;
        while(x!=null){
            count++;
            x = x.next;    
        }
        return count;
    }
    
    private static int Function(LIST x,LIST y){
        if(x == null || y == null){
            return -1;
        }
        
        int length1 = countNodes(x);
        int length2 = countNodes(y);
        int diff = Math.abs(length2-length1);
        //System.out.println(length1+" "+length2+" "+diff);
        
        LIST tempx = x;
        LIST tempy = y;
        
        if(length1 > length2){
            for(int i=0;i<=diff-1;i++)
                tempx = tempx.next;
        }else{
            for(int i=0;i<=diff-1;i++)
                tempy = tempy.next;
        }
        
        while(tempx!=null && tempy!=null){
            if(tempx.data == tempy.data)
                return tempx.data;
            else
            {}
            tempx = tempx.next;
            tempy = tempy.next;
           // System.out.println("In");
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        first = new LIST(5);
        first.next = new LIST(7);
        first.next.next = new LIST(8);
        first.next.next.next = new LIST(10);
        second = new LIST(9);
        second.next = new LIST(1);
        second.next.next = first;
        
        int p = Function(first,second);
        System.out.println(p);
    }
    
}
    