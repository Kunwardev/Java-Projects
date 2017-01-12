
package Stack;

class List{
    int data;
    List next;
    List(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation
{
    public static List Push(List head, int data)
    {
        List temp = new List(data);
        if(head == null)
            head = temp;
        else
        {
            temp.next = head;
            head = temp;
        }
        return head;
    }
    
    public static List Pop(List head)
    {
        if(head == null)
        {
            System.out.println("Stack underFlow");
            return head;
        }
        return head.next;
    }
    
    public static int Peek(List head)
    {
        if(head == null)
            return -1;
        return head.data;
    }
    
    public static void Print(List head)
    {
        if(head == null)
            return;
        else
        {
            while(head != null)
            {
                System.out.print(head.data+" ");
                head = head.next;
            }
        }
   }
    
    public static void main(String[] args)
    {
        List head = null;
        head = Push(head,1);
        head = Push(head,3);
        head = Push(head,5);
        head = Push(head,7);
        head = Push(head,9);
        head = Pop(head);
        Print(head);
    }
    
}
