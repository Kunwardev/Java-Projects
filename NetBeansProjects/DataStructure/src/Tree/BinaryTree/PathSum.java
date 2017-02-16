/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree.BinaryTree;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class PathSum
{
    private static void printPaths(TrEe root, int sum, int sum_Far, ArrayList<Integer> al){
        if(root == null)
            return;
        sum_Far += root.data;
        al.add(root.data);
        if(sum_Far == sum){
            System.out.println(al);
        }
        if(root.left != null){
            printPaths(root.left, sum, sum_Far, al);
        }
        if(root.right != null){
            printPaths(root.right, sum, sum_Far, al);
        }
        al.remove(al.size()-1);
    }
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(10);
        root.left = new TrEe(28);
        root.right = new TrEe(13);
        root.right.left = new TrEe(14);
        root.right.right = new TrEe(15);
        root.right.left.left = new TrEe(21);
        root.right.left.right = new TrEe(22);
        root.right.right.left = new TrEe(23);
        root.right.right.right = new TrEe(24);
        int sum = 38;
        ArrayList<Integer> al = new ArrayList<>();
        printPaths(root,sum,0, al);
    }
    
}
