/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;
import java.util.Stack;
import java.util.LinkedList;
/**
 *
 * @author Kunwar
 */
public class ch3Question2
{
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> min = new Stack<>();
       
    private static void Push(int data){
        if(st == null){
            st.push(data);
            min.push(data);
        }else{
            int m = min.peek();
            if(m > data)
                m = data;
            st.push(data);
            min.push(m);
        }
    }
    
    private static void Pop(){
        st.pop();
        min.pop();
    }
    
    private static int getMin(){
        int p = min.peek();
        return p;
    }
    
    public static void main(String[] args){
        Push(8);
        Push(7);
        Push(9);
        System.out.println(st);
        System.out.println(min);
    }
    
}
