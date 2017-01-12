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
public class SortStackRecursion
{
    public static void SortStack(Stack<Integer> S){
        if(S != null){
            int temp = S.pop();
            SortStack(S);
            SortInsert(S,temp);
        }
    }
    
    public static void SortInsert(Stack<Integer> S, int number){
        if(S == null || number > S.peek()){
            {
                S.push(number);
                return;
            }
        }else{
                int temp = S.pop();
                SortInsert(S, number);
                S.push(temp);
        }
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(-3);st.push(14);st.push(18);st.push(-5);st.push(30);st.push(17);
        System.out.println(st);
        SortStack(st);
        System.out.println(st);
    }
    
}
