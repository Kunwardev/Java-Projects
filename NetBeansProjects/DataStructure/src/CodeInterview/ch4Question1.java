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
public class ch4Question1
{
    private static int height(Tree root){
        if(root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
    }
    
    private static int minHeight(Tree root){
        if(root == null)
            return 0;
        int lheight = minHeight(root.left);
        int rheight = minHeight(root.right);
        return Math.min(rheight, lheight)+1;
    }
    
    private static boolean Function(Tree root){
        if(root == null)
            return true;
        return (height(root)-minHeight(root) <= 1);
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(8);
        root.left = new Tree(10);
        root.right = new Tree(5);
        root.left.left = new Tree(4);
        root.left.left.left = new Tree(1);
        System.out.println(Function(root));
    }
    
}
