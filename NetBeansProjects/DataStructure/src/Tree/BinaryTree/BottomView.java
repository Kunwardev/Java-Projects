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
public class BottomView
{
    private static void VIEW(TrEe root){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            System.out.print(root.data+" ");
        }else{
        VIEW(root.left);
        VIEW(root.right);}
    }
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(1);
        root.left = new TrEe(8);
        root.right = new TrEe(22);
        root.left.left = new TrEe(5);
        root.left.right = new TrEe(3);
        root.left.right.left = new TrEe(10);
        root.left.right.right = new TrEe(14);
        root.right.right = new TrEe(25);
        VIEW(root);
    }
    
}
