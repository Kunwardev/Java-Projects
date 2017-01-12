
package LinkedList;

public class BinarytoDecima
{
    
    public static void Convert(naviList h)
    {
        int result = 0;
        while(h!= null)
        {
            result = (result<<1)+h.data;
            h = h.next;
        }
        System.out.println(result);
    }
    
    public static void main(String[] args)
    {
        naviList head = new naviList(0);
        head.next = new naviList(0);
        head.next.next = new naviList(1);
        head.next.next.next = new naviList(1);
        Convert(head);
    }
}
