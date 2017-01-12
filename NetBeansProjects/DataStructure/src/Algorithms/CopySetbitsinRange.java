package Algorithms;

public class CopySetbitsinRange
{
    public static int ChangeBits(int x,int y,int l,int r)
    {
        if(l<1 && r>32)
            return -1;
        else
        {
            for(int i=l;i<=r;i++)
            {
                int mask = 1<<(i-1);
                if((y & mask) > 0)
                {
                    System.out.println(y&mask);
                    x = (x|mask);
                }
            }
        }
        return x;
    }
    
    public static void main(String[] args)
    {
        int x = 10,y=28,l=2,r=5;
        x = ChangeBits(x, y, l, r);
        System.out.println(x);
    }
    
}
