/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class ReverseStackRecursion
{
    private static void insertAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
        }else{
            int temp = st.pop();
            insertAtBottom(st, x);
            st.push(temp);
        }
    }
    
    private static void reverse(Stack<Integer> st){
        if(!st.isEmpty()){
            int temp = st.pop();
            reverse(st);
            insertAtBottom(st, temp);
        }
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    
}
