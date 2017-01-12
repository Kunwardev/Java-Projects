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

// Finding the minElement of Stack using O(n) space and O(1) time

public class MinELementStackO_n_space
{
    private static int minElement;
    public static void Insert(Stack st, Stack aux,int Element)
    {
        if(st.isEmpty())
        {
            st.push(Element);
            aux.push(Element);
            minElement = Element;
        }
        else
        {
            if(minElement <= Element)
            {
                st.push(Element);
                aux.push(minElement);
            }
            else
            {
                st.push(Element);
                minElement = Element;
                aux.push(minElement);
            }
        }
    }
    
    public static int getMin(Stack st,Stack aux)
    {
        int top;
        if(st.isEmpty())
            return -1;
        top = (int) aux.pop();
        st.pop();
        return top;
    }
    
    public static void Pop(Stack st,Stack aux)
    {
        if(st.isEmpty())
        {
            System.out.println("Stack is Empty");
            return;
        }
        st.pop();
        aux.pop();
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack();
        Stack<Integer> aux = new Stack();
        Insert(st, aux, 18);
        Insert(st, aux, 19);
        Insert(st, aux, 29);
        Insert(st, aux, 16);
        Insert(st, aux, 15);
        Insert(st, aux, 14);
        Insert(st, aux, 20);
        System.out.println(getMin(st, aux));
        System.out.println(getMin(st, aux));
        System.out.println(getMin(st, aux));
    }
    
}
