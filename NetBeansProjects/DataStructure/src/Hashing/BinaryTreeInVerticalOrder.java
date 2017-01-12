/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Kunwar
 */

class Node{
    int data;
    Node left;Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTreeInVerticalOrder
{
    static HashMap<Integer,ArrayList> mp = new HashMap<Integer,ArrayList>();
    static ArrayList<Integer> al = new ArrayList<>();
    
    public static void getVerticalOrder(Node root,int hd)
    {
            al.add(root.data);
            mp.put(hd, al);
            getVerticalOrder(root.left, hd-1);
            getVerticalOrder(root.right, hd+1);
        }
    }
    
    public static void printVerticalOrder(Node root)
    {
        Iterator it = mp.entrySet().iterator();
        while(it.hasNext())
        {
            HashMap.Entry pair = (HashMap.Entry<Integer,ArrayList>) it.next();
            System.out.println(pair.getValue());
            
            it.remove();
        }
    }
    
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        getVerticalOrder(root, 0);
        printVerticalOrder(root);
    }
    
}
