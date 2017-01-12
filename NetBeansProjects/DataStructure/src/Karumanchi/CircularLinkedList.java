
package Karumanchi;


public class CircularLinkedList
{
    static int lengthCircle = 0;
       public static naviList insertCircle(naviList head,int data)
    {
        naviList temp = new naviList(data);
        if(head == null)
        {
            head = temp;
            head.next = head;
        }
        else
        {naviList temporary = head;
        for(int i=0;i<lengthCircle;i++)
            temporary = temporary.next;
        temporary.next = temp;
        temporary.next.next = head;
        lengthCircle++;}
        return head;
    }
    
    public static naviList insertAtEnd(naviList head, int data)
    {
        naviList temp = new naviList(data);
        if(head == null)
        {
            head = temp;
            head.next = head;
        }
        else
        {
            naviList temporary = head;
        for(int i=0;i<lengthCircle;i++)
            temporary = temporary.next;
        temp.next = head;
        temporary.next = temp;
        head = temp;
        lengthCircle++;
        }
        return head;
    }
    
    public static naviList deleteBeg(naviList head)
    {
        naviList temp = head;
        while(temp.next != head)
            temp = temp.next;
        temp.next = head.next;
        head = temp;
        return head;
    }
       
    public static void Print(naviList head)
    {
        naviList temp = head;
        do
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while(temp!=head);
    }
    
    public static void main(String[] args)
    {
        naviList head = null;
        head = insertCircle(head, 1);
        head = insertCircle(head,2);
        head = insertCircle(head, 3);
        head = insertAtEnd(head, 4);
        head = insertAtEnd(head, 5);
        head = insertAtEnd(head, 6);
        head = insertAtEnd(head, 7);
        Print(head);
        System.out.println();
        head = deleteBeg(head);
        head = deleteBeg(head);
        Print(head);
        
    }
    
}
