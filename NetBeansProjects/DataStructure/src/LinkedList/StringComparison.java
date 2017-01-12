
package LinkedList;

class Listchar{
    Listchar next;
    char data;
    Listchar(char data)
    {
        this.next = null;
        this.data = data;
    }
} 

public class StringComparison
{
    public static boolean Compare(Listchar x,Listchar y)
    {
        if(x == null && y == null)
            return true;
        while(x != null && y != null && x.data == y.data)
        {
            x = x.next;
            y = y.next;
            //System.out.println("Entered");
        }
        if(x != null && y== null)
            return false;
        if(x == null && y != null)
            return false;
        if(x.data != y.data)
            return false;
        return true;
    }
    
    public static void main(String[] args)
    {
        Listchar a,b;
        a = new Listchar('g');
        a.next = new Listchar('e');
        a.next.next = new Listchar('e');
        a.next.next.next = new Listchar('k');
        a.next.next.next.next = new Listchar('s');
        a.next.next.next.next.next = new Listchar('b');
 
        b = new Listchar('g');
        b.next = new Listchar('e');
        b.next.next = new Listchar('e');
        b.next.next.next = new Listchar('k');
        b.next.next.next.next = new Listchar('s');
        b.next.next.next.next.next = new Listchar('a');
        
        System.out.println(Compare(a, b));
    }
    
}
