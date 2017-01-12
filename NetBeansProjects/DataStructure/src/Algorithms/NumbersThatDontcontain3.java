
package Algorithms;

public class NumbersThatDontcontain3
{
    public static void Solution(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if((i & 3) == 1)
                System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args)
    {
        Solution(15);
    }
    
}
