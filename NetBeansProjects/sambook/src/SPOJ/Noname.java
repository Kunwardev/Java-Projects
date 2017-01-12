package SPOJ;

import java.util.Scanner;

public class Noname
{
    public static int pf(double n)
    {
        int count = 0;/*
        while(n%2==0)
        {
            System.out.println("2");
            n/=2;
        }*/
        for(double i=2;i<Math.sqrt(n);i++)
        {
            while(n%i==0)
            {
                n = n/i;
                System.out.println(i);
            }
        }
        if(n>2)
            System.out.println(n);
        //System.out.println(count);
        return count;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.next());
        double a,c;
        while(T!=0)
        {
            a = Double.parseDouble(sc.next());
            c = pf(a);
            T--;
        }
    }
}
