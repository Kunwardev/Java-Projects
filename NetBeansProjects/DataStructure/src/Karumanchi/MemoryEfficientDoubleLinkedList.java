
package Karumanchi;

class MemoryLinked{
    int data;
    MemoryLinked ptrDiff;

    public MemoryLinked(int data)
    {
        this.data = data;
        ptrDiff = null;
    }
    
    
    
}

public class MemoryEfficientDoubleLinkedList
{
    
    public static MemoryLinked XOR(MemoryLinked a,MemoryLinked b)
    {
        return MemoryLinked ((int)b ^(int) a);
    }
    
    public static void Insert(MemoryLinked head, int data)
    {
        
    }
}
