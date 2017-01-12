/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Kunwar
 */
public class stacksupportinggetmin
{    
    static Stack<Integer> st = new Stack<>();
    static int minElement = Integer.MAX_VALUE;
    Scanner sc = new Scanner(System.in);
    public static void getMin()
    {
        if(st.isEmpty() == true)
            System.out.println("Stack is Empty");
        else
            System.out.println("The Minimum Element is "+minElement);
    }
    public static void PUSH(int data)
    {
        if(data >= minElement)
            st.push(data);
        else
        {
            minElement = data;
            st.push(2*data - minElement);
        }
        System.out.println("Number Inserted: "+data);
    }
    
    public static void POP()
    {
        int t = st.pop();
        if(t < minElement)
        {
            System.out.println("Number popped: "+minElement);
            minElement = 2*minElement-t;
        }
        else
            System.out.println("Number popped: "+t);
    }
    
    public static void main(String[] args)
    {
        PUSH(3);
PUSH(5);
getMin();
POP();
getMin();
PUSH(2);
PUSH(1);
PUSH(-5);
getMin();
    }
    
}
