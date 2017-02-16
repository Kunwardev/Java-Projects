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
public class VerticalOrderTraverse
{
    static int min = 0;
    static int max = 0;
    
    private static void GetMinMax(TrEe root,int hd){
        if(root == null)
            return ;
        if(min > hd){
            min = hd;
        }
        if(max < hd)
            max = hd;
        GetMinMax(root.left, hd-1);
        GetMinMax(root.right, hd+1);
    }
    
    private static void Vertical(TrEe root,int line, int hd){
        if(root == null)
            return;
        if(line == hd)
            System.out.print(root.data + " ");
        Vertical(root.left, line, hd-1);
        Vertical(root.right, line, hd+1);
    }
    
    private static void Function(TrEe root){
        GetMinMax(root, 0);
        for(int i=min;i<=max;i++){
            Vertical(root, i, 0);
            System.out.println("");
        }
    }
    
    public static void main(String[] args)
    {
        TrEe root = new TrEe(1);
        root.left = new TrEe(2);
        root.right = new TrEe(3);
        root.left.left = new TrEe(4);
        root.left.right = new TrEe(5);
        root.right.left = new TrEe(6);
        root.right.right = new TrEe(7);
        root.right.left.right = new TrEe(8);
        root.right.right.right = new TrEe(9);
        Function(root);
    }
    
}
