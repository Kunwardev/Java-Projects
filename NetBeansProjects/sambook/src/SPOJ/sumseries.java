package SPOJ;

import java.util.Scanner;

public class sumseries
{
    public static double fn(double a)
    {
        double z = 0.5-(0.5*(a*a)+a+1);
        return z;
    }
    public static void main(String[] args)
    {
        double n,t,p;
        Scanner sc = new Scanner(System.in);
        t = Double.parseDouble(sc.next());
        while(t!=0)
        {
        p = Double.parseDouble(sc.next());
        n = fn(p);
        double roundOff = Math.round(n * 100000.0) / 100000.0;
        System.out.println(roundOff);
        t--;
        }
    }
}
