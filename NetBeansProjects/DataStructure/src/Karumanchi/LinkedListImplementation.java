
package Karumanchi;

class naviList{
    int data;
    naviList next;
    naviList(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplementation
{
    public static int length(naviList head)
    {
        int count = 0;
        naviList temp = head;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public static naviList insertAtBeginning(naviList head,int data)
    {    
        naviList temp = new naviList(data);
        if(head == null)
            return temp;
        temp.next = head;
            return temp;
    }
    
    public static naviList insertAtlocation(naviList head, int loc,int data)
    {
        naviList temp = new naviList(data);
        naviList temporary = head;
        int length = length(head);
        if(loc > length)
            head = insertAtEnd(head, data);
        else if(loc <= 0)
            head = insertAtBeginning(head, data);
        else
        {
            for(int i=0;i<loc-1;i++)
                temporary = temporary.next;
            temp.next = temporary.next;
            temporary.next = temp;
        }
        return head;
    }
    
    public static naviList insertAtEnd(naviList head,int data)
    {
        naviList temp = new naviList(data);
        if(head == null)
            return temp;
        naviList temporary = head;
        while(temporary.next != null)
            temporary = temporary.next;
        temporary.next = temp;
        return head;
    }
    
    public static naviList deleteAtBeginning(naviList head)
    {
        naviList temp = head;
        temp = temp.next;
        head = temp;
        return head;
    }
    
    public static naviList deleteAtEnd(naviList head)
    {
        naviList previous = head;
        while(previous.next.next != null)
            previous = previous.next;
        previous.next = null;
        return head;
    }
    
    public static naviList deleteAtLoc(naviList head,int loc)
    {
        naviList previous = head;
        int counter = 0;
        while(counter+1 != loc)
        {
            previous = previous.next;
            counter++;
        }
        previous.next = previous.next.next;
        return head;
    }
    
    public static void printList(naviList head)
    {
        while(head != null)
        {
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args)
    {
        naviList head = null;
        head = insertAtBeginning(head, 1);
        head = insertAtBeginning(head, 3);
        head = insertAtBeginning(head, 4);
        head = insertAtBeginning(head, 5);
        head = insertAtBeginning(head, 6);
        head = insertAtlocation(head, 3, 10);
        head = insertAtEnd(head, 2);
        //head = deleteAtBeginning(head);
        //head = deleteAtEnd(head);
        //head = deleteAtLoc(head, 3);
        printList(head);
    }
    
}
