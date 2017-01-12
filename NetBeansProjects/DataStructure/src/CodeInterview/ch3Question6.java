/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeInterview;
import java.util.Stack;
/**
 *
 * @author Kunwar
 */
public class ch3Question6
{
    private static Stack<Integer> sort(Stack p){
        Stack<Integer> r = new Stack<>();
        while(!p.isEmpty()){
            Integer tmp =  (Integer) p.pop();
            while(!r.isEmpty() && r.peek() > tmp){
                p.push(r.pop());
            }
            r.push(tmp);
        }
        return r;
    }
    
    public static void main(String[] args)
    {
        Stack <Integer> st = new Stack<>();
        st.push(8);st.push(2);st.push(7);st.push(3);st.push(5);st.push(1);
        Stack<Integer> p = sort(st);
        System.out.println(p);
    }
    
}
