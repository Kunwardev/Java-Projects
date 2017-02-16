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
public class MaxSum
{
    
    private static int Sum(TrEe root,int sum){
        if(root == null)
            return 0;
        int l = Sum(root.left, sum);
        int r = Sum(root.right, sum);
        
        int single = Math.max(Math.max(l,r) + root.data, root.data);
        //System.out.println(single);
        int maxTop = Math.max(single, l+r+root.data);
        //System.out.println(maxTop);
        sum = Math.max(sum, maxTop);
        System.out.println(sum+" "+maxTop);
        return sum;
    }
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(-2);
        root.left = new TrEe(1);/*
        root.right = new TrEe(20);
        root.left.left = new TrEe(15);
        root.left.right = new TrEe(6);
        root.right.left = new TrEe(3);
        root.right.right = new TrEe(2);
        */
        int sum = Sum(root, 0);
        System.out.println(sum);
    }
}
