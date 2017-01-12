
package Algorithms;

import java.util.Stack;

public class PNtoInfixCalculator
{
    public static double Evaluate(String expr)
    {
        Stack <String> st = new Stack<>();
        double result = 0;
        double l,m;String pusher,x1,x2;
        String x[] = expr.split(" ");
        for(int i=x.length -1;i>=0;i--)
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
    }
        result = Double.parseDouble(st.pop());
        return result;
    }
    public static void main(String[] args)
    {
        double re = Evaluate("/ + 4 3 7");
        System.out.println(re);
    }
}
