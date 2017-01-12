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
public class SameBinaryTree
{
    private static boolean Function(TrEe root1, TrEe root2){
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        return ( root1.data == root2.data && 
                Function(root1.left, root2.left) && 
                Function(root1.right, root2.right));
    }
    
    private static int size(TrEe root){
        if(root == null)
            return 0;
        int lsize = size(root.left);
        int rsize = size(root.right);
        return lsize+rsize+1;
    }
    
    private static int height(TrEe root){
        if(root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(rheight, lheight)+1;
    }
    
    public static void main(String[] args)
    {
        TrEe root1 = new TrEe(5);
        TrEe root2 = new TrEe(5);
        root1.left = new TrEe(8);
        root2.left = new TrEe(8);
        root1.right = new TrEe(9);
        root2.right = new TrEe(10);
        System.out.println(Function(root1, root2));
        System.out.println(size(root2));
        System.out.println(height(root2));
    }
    
}
