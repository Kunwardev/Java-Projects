/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */
public class LevelOrderTraverse
{
    private static int Height(Tree root){
        if(root == null)
            return 0;
        int lheight = Height(root.left)+1;
        int rheight = Height(root.right)+1;
        if(lheight > rheight)
            return lheight;
        return rheight;
    }
    
    private static void PrintGivenLevel(Tree root){
        for(int i=1;i<=Height(root);i++){
            PrintGivenLevelUtil(root,i);
        }
    }
    
    private static void PrintGivenLevelUtil(Tree root,int level){
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.data + " ");
        else if(level > 1){
            PrintGivenLevelUtil(root.left, level-1);
            PrintGivenLevelUtil(root.right, level-1);
        }
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        PrintGivenLevel(root);
        ArrayList<Integer> al = new ArrayList<>();
        
    }
    
}
