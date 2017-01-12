
package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversals
{
    
    public static int Height(Tree root)
    {
        if(root == null)
            return 0;
        int lHeight = Height(root.left);
        int rHeight = Height(root.right);
        if(lHeight > rHeight)
            return 1+lHeight;
        return 1+rHeight;
    }
    
    public static void PrintgivenLevel(Tree root,int level)
    {
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.data+" ");
        else if(level > 1)
        {
            PrintgivenLevel(root.left, level-1);
            PrintgivenLevel(root.right, level-1);
        }
    }
    
    public static void LevelOrder(Tree root){
        Tree temp = new Tree();
        Queue<Tree> q = new LinkedList<Tree>();
        q.add(root);
        System.out.println("");
        while(!q.isEmpty()){
            temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null)
                q.add(temp.left);
            if(temp.right != null)
                q.add(temp.right);
        }
    }
    
    public static void PrintgivenLevelOrder(Tree root)
    {
        for(int i=1;i<=Height(root);i++)
            PrintgivenLevel(root, i);
    }
    public static void main(String[] args)
    {
        Tree list = new Tree(1);
        list.left = new Tree(2);
        list.right = new Tree(3);
        list.left.left = new Tree(4);
        list.left.right = new Tree(5);
        PrintgivenLevelOrder(list);
        LevelOrder(list);
    }
}
