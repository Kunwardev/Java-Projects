/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tree.BinaryTree;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
class tree{
    tree left;
    tree right;
    char expression;
    
    tree(char expression){
        this.expression = expression;
        this.left = null;
        this.right = null;
    }
}

public class ExpressionTree
{
    private static boolean isOperator(char a){
        return ((a=='+')||(a=='-')||(a=='*')||(a=='/')||a=='^');
    }
    
    private static tree expression(String prefix){
        tree t, t1,t2;
        Stack<tree> st = new Stack<>();
        for(int i=0;i<prefix.length();i++){
            t = new tree(prefix.charAt(i));
            if(!isOperator(prefix.charAt(i))){
                st.push(t);
            }else{
                t1 = st.pop();
                t2 = st.pop();
                t.left = t2;
                t.right = t1;
                st.push(t);
            }
        }
        t = st.pop();
        return t;
    }
    
    private static void inorder(tree t){
        if(t != null){
            inorder(t.left);
            System.out.print(t.expression);
            inorder(t.right);
        }
    }
    
    public static void main(String[] args)
    {
        String expression = "ab+ef*g*-";
        tree t = expression(expression);
        inorder(t);
    }
    
}
