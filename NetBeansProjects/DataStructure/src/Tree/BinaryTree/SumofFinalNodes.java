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
class TREE{
    int data;
    TREE left;
    TREE right;
    
    TREE(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class SumofFinalNodes
{
    static int max = Integer.MAX_VALUE;
    static ArrayList<Integer> al = new ArrayList<>();
    
    private static void Function(TREE root,int sum){
        if(root == null){
            al.add(sum);
            return;
        }else{
            Function(root.left,sum+root.data);
            Function(root.right,sum+root.data);
        }
    }
    
    private static int check(ArrayList<Integer> al){
        int i;
        for(i=0;i<al.size();i++)
        {
            int p = al.get(i);
            if(p < max)
                max = p;
            
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        TREE root = new TREE(10);
        root.left = new TREE(-2);
        root.right = new TREE(7);
        root.left.left = new TREE(8);
        root.left.right = new TREE(-4);
        Function(root, 0);
    //    System.out.println(al);
        int z = check(al);
        System.out.println(z);
    }
    
}
