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
public class CountingMinInversions
{
    static Stack st = new Stack();
    public static int Count(String str)
    {
        if(str.length() % 2 != 0)
            return -1;
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i) == '}' && (!st.isEmpty()))
                {
                    if((char) st.peek() == '{')
                        st.pop();
                    else
                        st.push(str.charAt(i));
                }
                else
                    st.push(str.charAt(i));
            }
        }
        int size = st.size();
        int n = 0;
        while(st.isEmpty() == false && (char)st.peek() == '{')
        {
            n++;
            st.pop();
        }
        //size = size - n;
        /*
        explain:- in any case of unbalance parenthesis,after removing the
        balance part,only left part is first }}}}} and then
        {{{{{ like }}}}}}}{{{{{ . now to calculate, we have 7 right parenthesis
        and 5 left parenthesis. for the 7 right parenthesis,we make 3 as left by
        3 reversal i.e. 7/2.now only one right parenthesis is left(remember it).
        now for the left parenthesis part,out of 5 we make 2 reversal to make 
        them right parenthesis i.e. 5/2.now only one left parenthesis is left.we
        can make it balance with the previous remaining one right parenthesis(2 
        reversal). so total=7/2+5/2+2=7. which is equal to len/2+n%2.
Note:- in any case if length of right unbalanced parenthesis is odd then only 
        one is need to be match with the left parenthesis which is also odd.
        that's why n%2.
        */
        return ((size/2)+(n%2));
    }
    
    public static void main(String[] args)
    {
        String str = "}}}{{{{{";
        System.out.println(Count(str));
    }
    
}
