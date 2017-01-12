package LinkedList;

public class checker
{
    public static void main(String[] args)
    {
        List a = new List();
        List b = new List();
        a.data = 4;
        a.next = b;
        b.data = 5;
        if(a==b)
            System.out.println("Case 1");
        a = a.next;
        if(a == b)
            System.out.println("Case 2");
    }
}
