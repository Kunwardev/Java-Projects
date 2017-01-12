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

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.data = x;
        this.left = null;
        this.right = null;
    }
}

public class FindIfTheTreeIsComplete
{
    public static int maxHeight(TreeNode t)
    {
        if(t == null)
            return 0;
        else
        {
            return (1+Math.max(maxHeight(t.left), maxHeight(t.right)));
        }
    }
    
    public static int minHeight(TreeNode t)
    {
        if(t == null)
            return 0;
        else
            return (1+Math.min(minHeight(t.left),minHeight(t.right)));
    }
    
    public static boolean checkBalance(TreeNode x){
        return (maxHeight(x) - minHeight(x) <= 1);
    }
    
    public static void main(String[] args)
    {
        TreeNode t = new TreeNode(5);
        t.left = new TreeNode(7);
        t.right = new TreeNode(9);
        t.left.left = new TreeNode(1);
        t.left.left.left = new TreeNode(8);
        System.out.println(checkBalance(t));
    }
    
}