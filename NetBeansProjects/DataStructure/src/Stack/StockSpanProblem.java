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
public class StockSpanProblem
{
    private static void Function(Stack<Integer> st, int[] arr,int[] S){
        st.push(0);
        S[0] = 1;
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                st.pop();
            }
            S[i] = (st.isEmpty()) ? i+1 : i-st.peek();
            st.push(i);
        }
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[]{10,4,5,90,120,80};
        int[] S = new int[6];
        Function(st, arr, S);
        for(int p: S)
            System.out.print(p+" ");
    }
}
