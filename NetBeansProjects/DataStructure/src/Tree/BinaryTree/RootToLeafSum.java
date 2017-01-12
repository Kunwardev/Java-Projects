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
public class RootToLeafSum
{
    private static boolean Function (TrEe root, int sum){
        if(root == null && sum == 0)
            return true;
        else if(root == null && sum != 0)
            return false;
        boolean leftside = Function(root.left,sum - root.data);
        boolean rightside = Function(root.right, sum - root.data);
        if(leftside || rightside)
            return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(10);
        root.left = new TrEe(16);
        root.right = new TrEe(5);
        root.left.right = new TrEe(-3);
        root.right.left = new TrEe(6);
        root.right.right = new TrEe(11);
        System.out.println(Function(root, 23));
    }
    
}
