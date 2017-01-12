package SPOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class multiply
{
    public static void main(String[] args)
    {
        String x,y;
        Scanner sx = new Scanner(System.in);
        x = sx.next();
        y = sx.next();
        BigInteger a = new BigInteger(x);
        BigInteger b = new BigInteger(y);
        BigInteger c;
        c = a.multiply(b);
        System.out.println(c);
        c = a.and(b);
        System.out.println(c);
        boolean z = a.equals(c);
        System.out.println(z);
        c = a.gcd(b);
        System.out.println(c);
        BigInteger p[] = new BigInteger[2];
        p = a.divideAndRemainder(b);
        System.out.println(p[0]+" "+p[1]);
    }
}
