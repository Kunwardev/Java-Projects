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
public class DuplicateParenthesis
{
    public static boolean check(String str)
    {
        Stack<Character> st = new Stack<>();
        char top;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ')')
            {
                top = st.pop();
                if(top == '(')
                    return true;
                else
                {
                    while(top != '(')
                    {
                        top = st.pop();
                    }
                }
            }
            else
                st.push(str.charAt(i));
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        String str = "(((a+(b))+(c+d)))";
        if(check(str))
            System.out.println("Duplicate Found");
        else
            System.out.println("No Duplicate Found");
    }
    
}
