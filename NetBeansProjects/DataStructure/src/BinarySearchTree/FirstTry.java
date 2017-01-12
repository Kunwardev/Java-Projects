/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BinarySearchTree;

import Tree.BinaryTree.Tree;

/**
 *
 * @author Kunwar
 */

class Tree{
    int data;
    Tree left;
    Tree right;
    
    Tree(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class FirstTry
{
    static int count = 0;
    public static Tree Insert(Tree head, int data)
    {
        if(head == null)
        {
            head = new Tree(data);
            return head;
        }
        if(head.data > data)
            head.left = Insert(head.left,data);
        else
            head.right = Insert(head.right,data);
     return head;
    }
    
    public static void inOrder(Tree root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static int flag = 0;
    public static Tree search(Tree root, int key)
{
    // Base Cases: root is null or key is present at root
    if (root==null || root.data==key)
        return root;
 
    // val is greater than root's key
    if (root.data > key)
        return search(root.left, key);
 
    // val is less than root's key
    return search(root.right, key);
}
    
   
    public static void main(String[] args)
    {
        Tree head = null;
        head = Insert(head, 6);
        head = Insert(head, 5);
        head = Insert(head, 2);
        head = Insert(head, 5);
        head = Insert(head, 7);
        head = Insert(head, 8);
        
        System.out.println(search(head, 3));
        inOrder(head);
                
    }
    
}
