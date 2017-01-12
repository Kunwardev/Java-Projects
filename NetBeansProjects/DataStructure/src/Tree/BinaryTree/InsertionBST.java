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
public class InsertionBST
{
    private static TrEe InsertRec(TrEe root, int x){
        if(root == null){
            root = new TrEe(x);
            return root;
        }
        if(root.data > x){
            root.left = InsertRec(root.left,x);
        }else
            root.right = InsertRec(root.right, x);
        return root;
    }

    private static void InOrder(TrEe root){
        if(root != null){
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);}
    }
    
    public static void main(String[] args){
        TrEe root = new TrEe(10);
        root.left = new TrEe(-5);
        root.right = new TrEe(30);
        root.left.left = new TrEe(-10);
        root.left.right = new TrEe(0);
        root.left.right.right = new TrEe(5);
        root.right.right = new TrEe(36);
        
        TrEe head = InsertRec(root, 18);
        InOrder(root);
    }
    
}
