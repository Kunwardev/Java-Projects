
package Stack;

import java.util.ArrayList;

public class DynamicArrayStack
{
    static ArrayList stack = new ArrayList();
    static int count = -1;
    public static void Push(int data)
    {
        stack.add(++count, data);
    }
    
    public static void Pop()
    {
        if(count == -1)
        {
            System.out.println("Stack UnderFlow");
            return ;
        }
        stack.remove(count--);
    }
    
    public static int Top()
    {
        if(count == -1)
            return - 1;
        return Integer.parseInt((String) stack.get(count));
    }
    
    public static void Print()
    {
        if(count == -1)
        {
            return;
        }
        for(int i=0;i<stack.size();i++)
        {
            System.out.println(stack.get(i)+" ");
        }
    }
    
    public static void main(String[] args)
    {
        DynamicArrayStack st = new DynamicArrayStack();
        st.Push(1);st.Push(2);st.Push(3);st.Push(4);st.Push(5);st.Push(6);
        st.Pop();
        st.Pop();
        Print();
    }
    
}
