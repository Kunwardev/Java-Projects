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
public class NextGreaterElement
{
    private static void NGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int i=0;int element;int next;
        //st.push(-1);
        st.push(arr[i]);
        for(i=1;i<arr.length;i++){
            next = arr[i];
            if(!st.isEmpty()){
                element = st.pop();
                while(element < next){
                    System.out.println(element+" -> "+next);
                    if(st.isEmpty()){
                        break;
                    }element = st.pop();
                }
                if(element > next){
                    st.push(element);
                }
            }
            st.push(next);
        }
        
        while(!st.isEmpty()){
            element = st.pop();
            next = -1;
            System.out.println(element+" -> "+next);
        }
        
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{11,13,21,4};
        NGE(arr);
    }
    
}
