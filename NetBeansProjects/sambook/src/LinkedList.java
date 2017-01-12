
public class LinkedList
{
    private String item;
    private int count;
    private LinkedList next;
    
    public LinkedList()
    {
        item = null;
        item = null;
        count = 0;
    }
    
    public LinkedList(String name, int ncount, LinkedList linkvalue)
    {
        setData(name, ncount);
        next = linkvalue;
    }        
    public void setData(String name, int count)
    {
        item = name;
        this.count = count;
    }
    public void setLink(LinkedList l)
    {
        next = l;
    }
    public String getItem()
    {
        return item;
    }
    public int getCount()
    {
        return count;
    }
    public LinkedList getLink()
    {
        return next;
    }
}
