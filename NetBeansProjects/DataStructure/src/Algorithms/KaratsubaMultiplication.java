
package Algorithms;

public class KaratsubaMultiplication
{
    public static int getSize(long x)
    {
        int sum = String.valueOf(x).length();
        return sum;
    }
    
    public static long Multiply(long x,long y)
    {
        int size1 = getSize(x);
        int size2 = getSize(y);
        int N = Math.max(size1, size2);
        if(N < 10)
            return x*y;
        N = N/2+N%2;
        System.out.println(N);
        long m = (long)Math.pow(10, N);
        
        long b = x/m;
        long a = x %m;
        long d = y/m;
        long c = y - (d*m);
        
        long z0 = Multiply(a, c);
        long z1 = Multiply(a+b, c+d);
        long z2 = Multiply(b, d);
        
        return z0 +((z1-z0-z2)*m) + (z2*(long)Math.pow(10, 2*N));
    }
    
    public static void main(String[] args)
    {
        System.out.println(Multiply(1234567890, 14589));
    }
    
}
