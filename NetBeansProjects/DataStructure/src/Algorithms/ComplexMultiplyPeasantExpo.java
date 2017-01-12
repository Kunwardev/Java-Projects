package Algorithms;

class Complex{
    int a;
    int ib;
}

public class ComplexMultiplyPeasantExpo
{
    public static long Fact(long n)
    {
        long f = 1;
        for(long i =1;i<=n;i++)
            f = f*i;
        return f;
    }
    
    public static long Comb(long n,long k)
    {
        return (Fact(n)/(Fact(k)*Fact(n-k)));
    }
    
    public static long EXPO(long x,long n)
        {
        long P  = 1;
        if(n>=1)
            {
            while(n%2 == 0)
                {
                x = x*x;
                n = n/2;
            }
            P = x;
            n = n/2;
            while(n>0)
            {
                x = x*x;
                if(n%2 == 1)
                    P = P*x;
                n = n/2;
            }
        }
        return P;
    }
    
    public static int ith(long u)
        {
        if(u % 4 == 0 )
            return 1;
        if(u%4 == 1)
            return 1;
        if(u%4 == 2)
            return -1;
        else
            return -1;
    }
    
    public static void Power(long a,long b,long k,long m)
    {
        long c = 0L;
        long d = 0L;
        for(long i=0;i<=k;i+=2)
        {
            c = (Comb(k,i)*EXPO(c,k-i)*EXPO(d,i)*ith(i));
            c = c%m;
        }
        for(long j=1;j<=k;j+=2)
        {
            d = (Comb(k,j)*EXPO(c,k-j)*EXPO(d,j)*ith(j));
            d = d%m;
        }
        System.out.println(c+" "+d);
    }
    
    
    public static void main(String[] args)
    {
        long p = Fact(5);
        System.out.println(p);
        for(long i=0;i<=5;i++)
        {
            long q = Comb(5, i);
            System.out.print(q+" ");
        }
        long z = EXPO(5,3);
        System.out.println(z);
        for(long i=1;i<=8;i++)
            System.out.print(ith(i));
        System.out.println("");
    Power(8,2, 10, 1000000000);
    }
    
    
        
}
