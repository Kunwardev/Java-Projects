package Algorithms;

public class BleakNumber
{
    public static int ceilLog2(int n)
    {
        return (int)Math.ceil(Math.log(n)/Math.log(2));
    }
    
    public static boolean Bleak(int n)
    {
        for(int i=n-ceilLog2(n);i<n;i++)
        {
            if((i+Integer.bitCount(i)) == n)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        boolean y = Bleak(4);
        System.out.println(y);
        y = Bleak(3);
        System.out.println(y);
    }
    
}
