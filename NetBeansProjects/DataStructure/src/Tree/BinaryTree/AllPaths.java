/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree.BinaryTree;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class AllPaths
{
    private static void printArray(int[] al, int length){
        for(int i=0;i<length;i++)
            System.out.print(al[i]+" ");
        System.out.println();
    }
    
    private static void Paths(TrEe root, int[] al,int path){
        if(root == null){
            return;
        }
        al[path++] = root.data;
        if(root.left == null && root.right == null){
            printArray(al, path);
        }else{
            Paths(root.left, al, path);
            Paths(root.right, al, path);
        }
    }
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(1);
        root.left = new TrEe(2);
        root.right = new TrEe(3);
        root.left.left = new TrEe(4);
        root.left.right = new TrEe(5);
        int[] arr = new int[100];
        Paths(root, arr, 0);
    }
    
}
