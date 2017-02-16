/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BinarySearchTree;

import java.util.Scanner;

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

public class OperationsOnTree
{
    private static int search(Tree root, int data){
        if(root == null)
            return 0;
        if(root.data == data)
            return 1;
        if(root.data > data)
            return search(root.left, data);
        else
            return search(root.right, data);
    }
    
    private static Tree insert(Tree root, int data){
        if(root == null){
            root = new Tree(data);
        }else{
            if(root.data < data){
                root.right = insert(root.right, data);
            }else{
                root.left = insert(root.left, data);
            }
        }
        return root;
    }
    
    private static void inOrder(Tree root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    
    private static Tree delete(Tree root, int data){
        if(root == null)
            return root;
        if(search(root, data) == 0)
            return root;
        if(root.data > data){
            root.left = delete(root.left, data);
        }else if(root.data < data){
            root.right =delete(root.right, data);
        }else{
            if(root.left == null)
                return root.right;
            if(root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Tree root = null;
        for(int i=0;i<7;i++){
            root = insert(root, in.nextInt());
        }
        inOrder(root);
        System.out.println();
        root = delete(root, 4);
        inOrder(root);
    }

    private static int minValue(Tree right)
    {
        while(right.left != null)
            right = right.left;
        return right.data;
    }
    
}
