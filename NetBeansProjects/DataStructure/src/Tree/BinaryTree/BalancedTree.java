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
public class BalancedTree
{
    private static int Balanced(TrEe root){
        if(root == null)
            return -1;
        int lheight = Balanced(root.left);
        if(lheight == Integer.MIN_VALUE)
            return lheight;
        int rheight = Balanced(root.right);
        if(rheight == Integer.MIN_VALUE)
            return rheight;
        if(Math.abs(rheight - lheight) > 1)
            return Integer.MIN_VALUE;
        else
            return Math.max(rheight, lheight)+1;
    }
    
    public static void main(String[] args)
    {
        TrEe root= new TrEe(1);
        root.left = new TrEe(2);
        root.right = new TrEe(3);
        root.left.left = new TrEe(4);
        root.left.right = new TrEe(5);
        root.left.left.left = new TrEe(6);
        if(Balanced(root) != Integer.MIN_VALUE)
            System.out.println("Balanced");
        else
            System.out.println("Not");
    }
}
