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
public class ReverseTill2
{
    private static LIST[] Reverse(LIST head){
        
        LIST prevs[] = new LIST[2];
        LIST prev = null;LIST current = head, next;
        while(current.data != 2){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        prevs[0] = prev;
        LIST prev1 = null,nexts;
        while(current != null){
            nexts = current.next;
            current.next = prev1;
            prev1 = current;
            current = nexts;
        }
        prevs[1] = prev1;
        return prevs;
    }
    public boolean Function(int[] nums,int k){
    for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;(j-i)<=k;j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        LIST head = new LIST(6);
        head.next = new LIST(5);
        head.next.next = new LIST(4);
        head.next.next.next = new LIST(3);
        head.next.next.next.next = new LIST(2);
        head.next.next.next.next.next = new LIST(1);
        LIST prevs[] = Reverse(head);
        while(prevs[0] != null){
            System.out.print(prevs[0].data+" ");
            prevs[0] = prevs[0].next;
        }
        System.out.println("");
        while(prevs[1] != null){
            System.out.print(prevs[1].data+" ");
            prevs[1] = prevs[1].next;
        }
}
}
