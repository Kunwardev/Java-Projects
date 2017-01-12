package LinkedList;


class Link{
int data;
Link next;

Link(int data)
{
    this.data = data;
    this.next = null;
}
}

public class TriedAgain
{
    
    public static Link InsertLast(Link head,int data)
    {
        if(head == null)
            head = new Link(data);
        else
        {
            Link temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new Link(data);
            
        }
        return head;
    }
    
    public static Link InsertFirst(Link head,int data)
    {
        if(head == null)
            head = new Link(data);
        else
        {
            Link temp = new Link(data);;
            temp.next=head;
            head = temp;
        }
        return head;
        
    }
    
    public static Link deleteFirst(Link head)
    {
        if(head == null)
        {
            System.out.println("Linked List is already empty");
            return null;
        }
        else
        {
            head = head.next;
        }
        return head;
    }
    
    public static Link deleteLast(Link head)
    {
        if(head == null)
        {
            System.out.println("Linked List is already empty");
            return null;
        }
        else
        {
            Link temp = head;
            while(temp.next.next != null)
                temp = temp.next;
            temp.next = null;
        }
        return head;
    }
    
    public static void Print(Link head)
    {
        Link current = head;
        while(current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static void main(String[] args)
    {
        Link head = null;
        head = InsertFirst(head, 1);
        head = InsertFirst(head, 2);
        head = InsertFirst(head, 3);
        head = InsertFirst(head, 4);
        head = InsertLast(head, 5);
        //head = deleteFirst(head);
        head = deleteLast(head);
        Print(head);
    }
    
}
