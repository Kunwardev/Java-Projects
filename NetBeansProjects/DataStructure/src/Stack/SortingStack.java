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
public class SortingStack
{
    public static Stack<Integer> sort(Stack <Integer> s)
    {
        Stack<Integer> r = new Stack<>();
        while(s.isEmpty() != true)
        {
            int tmp = s.pop();
            while(r.isEmpty() == false && r.peek() > tmp)
            {
                s.push(r.pop());
            }
            r.push(tmp);
        }
        return r;
    }
    
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(8);
        s.push(2);
        s.push(5);
        s.push(1);
        s.push(6);s.push(9);
        s.push(3);
        s.push(4);
        s.push(7);
        s.push(0);
        Stack<Integer> r = sort(s);
        System.out.println(r);
    }
    
}
