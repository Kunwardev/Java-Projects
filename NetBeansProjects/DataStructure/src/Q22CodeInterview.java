
import java.util.Scanner;

class List{
    int data;
    List next;
    List(int d)
    {
        data = d;
        next = null;
    }
}


public class Q22CodeInterview
{
    //Q2.4
    public static List AddNodes(List h1,List h2)
    {
        List h3;
        
    }
    //Q2.3
    public static List deleteNode(List h)
    {
        List slow = h;
        List fast = h;
        while(true)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next.next == null||fast.next.next.next == null)
                break;
        }
        slow.next = slow.next.next;
        return h;
    }

    
    public static void main(String[] args)
    {
        List a = new List(1);
        a.next = new List(2);
        a.next.next = new List(3);
        a.next.next.next = new List(4);
        a.next.next.next.next = new List(5);
        a.next.next.next.next.next = new List(6);
        a.next.next.next.next.next.next = new List(7);
        Scanner in = new Scanner(System.in);
        List p1 = a;
        List p2 = a;
        int length = 0;
        while(p1 != null)
        {
            p1 = p1.next;
            length++;
        }
        int p = in.nextInt();
        
        System.out.println(length);
        for(int i=0;i<length-p;i++)
        {
            p2 = p2.next;
        }
        if(p > length)
        {
            System.out.println("Not Possible");
        }
        else
            System.out.println(p2.data);
        a = deleteNode(a);
        while(a!=null)
        {
            System.out.print(a.data+" ");
            a = a.next;
        }
    }
}
