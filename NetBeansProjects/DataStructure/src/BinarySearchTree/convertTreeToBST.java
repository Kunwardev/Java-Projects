/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BinarySearchTree;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class convertTreeToBST
{
    static int[] arr;
    private static int countNodes(Tree root){
        if(root == null)
            return 0;
        return countNodes(root.left)+countNodes(root.right)+1;
    }
    static int i =0;
    private static void inOrderArray(Tree root){
        if(root != null){
            inOrderArray(root.left);
            arr[i]=root.data;
            i++;
            inOrderArray(root.right);
        }
    }
    static int j=0;
    private static void update(Tree root){
        if(root == null)
            return;
        update(root.left);
        root.data = arr[j++];
        update(root.right);
    }
    
    public static void inOrder(Tree root)
    {
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(15);
        root.left = new Tree(10);
        root.right = new Tree(20);
        root.left.left = new Tree(5);
        root.right.right = new Tree(30);
        arr = new int[countNodes(root)];
        inOrderArray(root);
        update(root);
        inOrder(root);
    }
    
}
