/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class LevelInLinkedList
{
    private static int Height(Tree root){
        if(root == null)
            return 0;
        int lheight = Height(root.left);
        int rheight = Height(root.right);
        return (lheight > rheight) ? lheight+1 : rheight+1;
    }
    
    private static void FunctionUtil(Tree root,int level,int current,LinkedList<Integer> list){
        if(root == null)
            return;
        if(current > level)
            return;
        else if(current == level){
            list.add(root.data);
            System.out.println(list);
        }
        else{
        current++;
        FunctionUtil(root.left,  level, current,list);
        FunctionUtil(root.right, level, current,list);
        current--;
        return;
        }
    }
    
    private static ArrayList<LinkedList<Integer>> Function(Tree a){
        ArrayList<LinkedList<Integer>> al = new ArrayList<>();
        
        for(int i=0;i<Height(a);i++){
            LinkedList<Integer> list = new LinkedList<>();
            FunctionUtil(a,i,0,list);
            al.add(list);
        }
        return al;
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        System.out.println(Height(root));
        ArrayList<LinkedList<Integer>> al = Function(root);
        System.out.println(al);
    }
    
}
