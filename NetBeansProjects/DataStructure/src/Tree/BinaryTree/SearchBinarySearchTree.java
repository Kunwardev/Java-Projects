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
public class SearchBinarySearchTree
{
    private static boolean Search(TrEe root, int x){
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }
        else{
            if(root.data > x)
                return Search(root.left, x);
            else if (root.data < x)
                return Search(root.right, x);
    }
        return false;
}
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(10);
        root.left = new TrEe(-5);
        root.right = new TrEe(30);
        root.left.left = new TrEe(-10);
        root.left.right = new TrEe(0);
        root.left.right.right = new TrEe(5);
        root.right.right = new TrEe(36);
        System.out.println(Search(root, 18));
    }
    
}
