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
public class RPNtoInfixCalculator
{
    public static double evaluate(String expr)
    {
        double result = 0;
        double l,m;String pusher,x1,x2;
        Stack<String> st = new Stack<>();
        String x[] = expr.split(" ");
        
        for(int i=0;i<x.length;i++)
        {
            if(x[i].charAt(0) == '+')
            {
                l = Double.parseDouble(st.pop());
                m = Double.parseDouble(st.pop());
                l = m+l;
                st.push(l+"");
            }
            else if(x[i].charAt(0) == '-')
            {
                l = Double.parseDouble(st.pop());
                m = Double.parseDouble(st.pop());
                l = m-l;
                st.push(l+"");
            }
            else if(x[i].charAt(0) == '*')
            {
                l = Double.parseDouble(st.pop());
                m = Double.parseDouble(st.pop());
                l = m*l;
                st.push(l+"");
            }
            else if(x[i].charAt(0) == '/')
            {
                l = Double.parseDouble(st.pop());
                m = Double.parseDouble(st.pop());
                l = m/l;
                st.push(l+"");
            }
            else
            {
                st.push(x[i]);
            }
            System.out.println(st);    
        }
        result = Double.parseDouble(st.pop());
        return result;
    }
    public static void main(String[] arg)
    {
        double res = evaluate("5 1 2 + 4 * -");
        System.out.println(res);
    }
}
