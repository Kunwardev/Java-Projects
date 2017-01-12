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
public class SymmetryTree
{
    
    private static String InOrder(TrEe root){
        String p = "";
        if(root != null){
            p += InOrder(root.left);
            p += root.data;
            p += InOrder(root.right);
        }//else
           // p+='@';
  
        return p;
    }
    
    
    
    private static boolean Symmetry(TrEe root){
        String x = "";
        x = InOrder(root);
        System.out.println(x);
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) != x.charAt(x.length()-1-i))
                return false;
        }
        return true;
    }
    /*
    
    private static boolean isSymmetry(TrEe root1, TrEe root2){
        if((root1 == null) && (root2==null))
            return true;
        if(root1==root2 && root1.data == root2.data)
            return isSymmetry(root1.left,root2.left) && isSymmetry(root1.right,root2.right);
        return false;
    }
    
    private static boolean Symmetry(TrEe root){
        return isSymmetry(root,root);
    }
    */
    public static void main(String[] args)
    {
        TrEe root = new TrEe(1);
        root.left = new TrEe(2);
        root.right = new TrEe(2);
        root.left.left = new TrEe(3);
        root.left.right = new TrEe(4);
        root.right.left = new TrEe(4);
        root.right.right = new TrEe(3);
        boolean a = Symmetry(root);
        System.out.println(a);
    }
    
}
