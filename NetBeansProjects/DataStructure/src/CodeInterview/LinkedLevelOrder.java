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
public class LinkedLevelOrder
{
    private static void createLevel(Tree root, ArrayList<LinkedList<Tree>> lists, int level){
        if(root == null)
            return ;
        LinkedList<Tree> list = null;
        if(lists.size() == level){
            list = new LinkedList<>();
            lists.add(list);
        }else{
            list = lists.get(level);
        }
        list.add(root);
        createLevel(root.left, lists, level+1);
        createLevel(root.right, lists, level+1);
    }
    
    private static ArrayList<LinkedList<Tree>> createLevelOrder(Tree root){
        ArrayList<LinkedList<Tree>> lists = new ArrayList<>();
        createLevel(root, lists, 0);
        return lists;
    }
    
    public static void main(String[] args)
    {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        ArrayList<LinkedList<Tree>> al = createLevelOrder(root);
        System.out.println(al);
    }
    
}
