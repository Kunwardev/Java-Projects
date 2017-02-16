/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class evaluateInReversePolish
{
    private static int result(String a){
        Stack<String> st = new Stack();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='0' && a.charAt(i) <= '9')
                st.push(String.valueOf(a.charAt(i)));
            else{
                int b = Integer.parseInt(st.pop());
                int c = Integer.parseInt(st.pop());
                switch(a.charAt(i)){
                    case '+':
                        st.push(b+c+"");
                        break;
                    case '-':
                        st.push(b-c+"");
                        break;
                    case '*':
                        st.push(b*c+"");
                        break;
                    case '/':
                        st.push(b/c+"");
                        break;
                }
            }
        }
        return Integer.parseInt(st.pop());
    }
    
    public static void main(String[] args)
    {
        String a = "21+3*";
        int p = result(a);
        System.out.println(p);
    }
    
}
