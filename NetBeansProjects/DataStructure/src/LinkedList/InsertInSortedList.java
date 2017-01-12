
package LinkedList;

public class InsertInSortedList
{
    public static void main(String[] args)
    {
        Link head = new Link(1);
        head.next = new Link(2);
        head.next.next = new Link(4);
        head.next.next.next = new Link(8);
        head.next.next.next.next = new Link(10);
        int data = 15;
        head = Insert(head,data);     
        while(head!= null)
        {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    private static Link Insert(Link head, int data)
    {
        Link temp = new Link(data);
        if(head == null)
            head = temp;
        Link headduplicate = head;
        while(headduplicate.next.data < data)
        {
            headduplicate = headduplicate.next;
            if(headduplicate.next == null)
                break;
        }
        temp.next = headduplicate.next;
        headduplicate.next = temp;
        return head;
    }
}
