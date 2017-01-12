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
    
    Tree(){
        this.left = null;
        this.right=null;
    }
    
}

public class BinaryTree
{
    
    public static void Traverse(Tree head)
    {
        if(head == null)
            return;
        Traverse(head.left);
        System.out.println(head.data);
        Traverse(head.right);
    }
    
    public static int Height(Tree head){
        if(head == null)
            return 0;
        else{
            int lheight = Height(head.left);
            int rheight = Height(head.right);
            return Math.max(lheight,rheight)+1;
        }
    }
    
    public static void main(String[] args)
    {
        Tree head = new Tree(1);
        head.left = new Tree(2);
        head.right = new Tree(3);
        head.left.left = new Tree(4);
        head.left.right = new Tree(5);
        head.right.left = new Tree(6);
        head.right.right = new Tree(7);
        Tree temp = head;
        //Traverse(head);
        System.out.println(Height(head));
    }
}
