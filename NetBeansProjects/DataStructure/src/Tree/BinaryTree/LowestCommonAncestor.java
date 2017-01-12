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
class TREe{
    int data;
    TREe left;
    TREe right;
    
    TREe(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    TREe(){
        this.left = null;
        this.right=null;
    }
    
}

public class LowestCommonAncestor
{
    private static TREe LCA(TREe root,TREe x,TREe y){
        if(root == null)
            return null;
        if(root == x || root == y)
            return root;
        TREe left = LCA(root.left, x, y);
        TREe right = LCA(root.right, x ,y);
        if(left != null && right != null)
            return root;
        if(left == null && right == null)
            return null;
        return left!=null ? left : right;
    }
    
    public static void main(String[] args)
    {
        TREe root = new TREe(8);
        root.left = new TREe(5);
        root.right = new TREe(1);
        root.left.right = new TREe(2);
        root.left.right.left = new TREe(3);
        TREe answer = LCA(root, root.left.right, root.left.right.left);
        System.out.println(answer.data);
    }
    
}
