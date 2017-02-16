/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree.BinaryTree;

/**
 *
 * @author Kunwar
 */
class List{
    int data;
    List next;
    
    List(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListToBST
{
    static TrEe root;
    private static int length(List head){
        List temp = head;
        int count = 0;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    private static TrEe OtherMethod(List head,int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start + (end - start)/2);
        TrEe root;
        TrEe left = OtherMethod(head, start, mid-1);
        root = new TrEe(head.data);
        root.left = left;
        if(head.next != null){
            head.data = head.next.data;
            head.next = head.next.next;
            root.right = OtherMethod(head.next, mid+1, end);
        }
        return root;
    }
    
    private static TrEe Func(List head, int n){
        if(n<=0)
            return null;
        TrEe left = Func(head, n/2);
        root = new TrEe(head.data);
        root.left = left;
        head = head.next;
        root.right = Func(head, n-n/2-1);
        return root;
    }
    
    private static TrEe Function(List head){
        if(head == null)
            return null;
        int n = length(head);
        return Func(head, n);
    }
    
    private static void PreOrder(TrEe root){
        if(root != null){
            PreOrder(root.left);
            System.out.print(root.data+" ");
            PreOrder(root.right);
        }
            
    }
    
    public static void main(String[] args)
    {
        List head = new List(1);
        head.next = new List(2);
        head.next.next = new List(3);
        head.next.next.next = new List(4);
        head.next.next.next.next = new List(5);
        head.next.next.next.next.next = new List(6);
        head.next.next.next.next.next.next = new List(7);
        //TrEe root = OtherMethod(head, 0, length(head));
        
        PreOrder(root);
    }
    
}
