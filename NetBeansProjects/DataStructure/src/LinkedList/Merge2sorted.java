package LinkedList;

/*
class naviList{
    int data;
    naviList next;
    naviList(int data)
    {
        this.data = data;
        this.next = null;
    }

    naviList()
    {
        this.next = null;
    }
}
*/

public class Merge2sorted
{
    /* Last node is not being shown
    public static naviList program(naviList hedA,naviList hedB)
    {
        naviList res = null;
        if(hedA == null)
            return hedB;
        else if(hedB == null)
            return hedA;
        else if(hedA !=null && hedB != null)
        {
            naviList prev = null;
            naviList temp = null;
            while(hedA!=null && hedB!=null)
            {
                if(hedA.data >= hedB.data)
                {
                    temp = new naviList(hedB.data);
                    if(res == null)
                        res = temp;
                    else
                    {
                        prev.next = temp;
                    }
                    prev = temp;
                    hedB = hedB.next;
                }
                else if(hedA.data < hedB.data)
                {
                    temp = new naviList(hedA.data);
                    if(res == null)
                        res = temp;
                    else
                    {
                        prev.next = temp;
                    }
                    prev = temp;
                    hedA = hedA.next;
                }
                else if(hedA != null && hedB == null)
                {
                    prev.next = hedA;
                    prev = hedA;
                }
                else if(hedB != null && hedA == null)
                {
                    prev.next = hedB;
                    prev = hedB;
                }
            }
        }
        return res;
    }
    */
    
    public static naviList program(naviList hedA,naviList hedB)
    {
        naviList result = null;
        if(hedA == null)
            return hedB;
        else if(hedB == null)
            return hedA;
        if(hedA.data >= hedB.data)
        {
            result = hedB;
            result.next = program(hedA,hedB.next);
        }
        else
        {
            result = hedA;
            result.next = program(hedA.next, hedB);
        }
        return result;
    }
    
    
    public static void main(String[] args)
    {
        naviList hedA = new naviList(1);
        naviList hedB = new naviList(2);
        hedA.next = new naviList(3);
        hedB.next = new naviList(4);
        hedA.next.next = new naviList(5);
        hedB.next.next = new naviList(6);
        naviList res = program(hedA,hedB);
        naviList temp = res;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
}
