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
public class StackMinElement_O_1_space
{
    private static int minElement = Integer.MAX_VALUE;
    public static void Insert(Stack st,int x)
    {
        if(st.isEmpty())
        {
            st.push(x);
            minElement = x;
        }
        else
        {
            if(x >= minElement)
                st.push(x);
            else
            {
                st.push(2*x - minElement);
                minElement = x;
            }
        }
    }
    
    public static void Pop(Stack st)
    {
        if(st.isEmpty())
            return ;
        else
        {
            int z = (int)st.pop();
            //System.out.println(z);
            if(z < minElement)
            {
                minElement = 2*minElement - z;
            }
        }
    }
    
    public static int getMinElement()
    {
        return minElement;
    }
    
    public static void main(String[] args)
    {
        Stack <Integer> st = new Stack<>();
        int z = getMinElement();
        System.out.println(z);
        Insert(st, 3);
        Insert(st, 5);
        Insert(st, 2);
        Insert(st, 1);
        Insert(st, 6);
        Insert(st, 7);
        Insert(st, -1);
        z = getMinElement();
        System.out.println(z);
        Pop(st);
        z = getMinElement();
        Pop(st);
        z = getMinElement();
        System.out.println(z);
        System.out.println(st);     //Stack Value will not be same, but MinValue will be
    }
    
}
