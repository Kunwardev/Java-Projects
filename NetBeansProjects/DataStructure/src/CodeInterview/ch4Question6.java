/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

/**
 *
 * @author Kunwar
 */
public class ch4Question6
{
    private static Tree Function(Tree root, Tree x, Tree y){
        if(root == null)
            return null;
        if(root == x || root == y)
            return root;
        
        Tree left = Function(root.left,x,y);
        Tree right = Function(root.right,x,y);
        
        if(left == null && right == null)
            return null;
        if(left != null && right != null)
            return root;
        return (left != null) ? left : right;
        
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(8);
        root.left = new Tree(5);
        root.right = new Tree(1);
        root.left.right = new Tree(2);
        root.left.right.left = new Tree(3);
        Tree x = new Tree(5);
        Tree y = new Tree(2);
        Tree z = Function(root, root.left, root.left.right);
        System.out.println(z.data);
        
        int index = (0-1)%5;
        System.out.println(index);
    }
    
}
