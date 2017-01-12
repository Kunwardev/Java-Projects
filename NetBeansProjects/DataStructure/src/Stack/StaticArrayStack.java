
package Stack;

public class StaticArrayStack
{
    static int arr[] = new int[10];
    static int count = 0;
    public static void Push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return;
        }
        arr[count++] = data;
    }
    
    public static void Pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return;
        }
        count--;
    }
    
    public static int Top()
    {
        if(count < 0 || count > 9)
            return -1;
        return arr[count];
    }
    
    public static int Size()
    {
        return count;
    }
    
    public static boolean isEmpty()
    {
        if(count == -1)
            return true;
        return false;
    }
    
    public static boolean isFull()
    {
        if(count == 9)
            return true;
        return false;
    }
    
    public static void Print()
    {
        if(isEmpty() && isFull())
            return;
        for(int i=0;i<=count;i++)
            System.out.print(arr[i]+" ");
    }
    
    public static void main(String[] args)
    {
        StaticArrayStack st = new StaticArrayStack();
        st.Push(1);
        st.Push(2);
        st.Push(1);
        st.Push(2);
        st.Push(1);
        st.Push(2);
        st.Push(1);
        st.Push(2);
        st.Push(1);
        st.Push(2);
        st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();st.Pop();
        st.Print();
    }
    
}
