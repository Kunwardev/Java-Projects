
package Algorithms;

public class CatalanNumbers
{
    public static int Method(int n)
    {
        int res = 0;
        if(n<=1)
            return 1;
        for(int i=0;i<n;i++)
            res+= Method(i)*Method(n-i-1);
        return res;
    }
    
    public static void main(String[] args)
    {
        CatalanNumbers cn = new CatalanNumbers();
        for(int u=0;u<10;u++)
            System.out.println(cn.Method(u));
    }
    
}
