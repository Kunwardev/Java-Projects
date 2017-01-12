package SPOJ;


import java.util.Scanner;


public class doughnuts
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t,c,k,w;
        t = Integer.parseInt(sc.next());
        while(t!=0)
        {
            c = Integer.parseInt(sc.next());
            k = Integer.parseInt(sc.next());
            w = Integer.parseInt(sc.next());
            if((c*w) <= k)
                System.out.println("yes");
            else
                System.out.println("no");
            t--;
        }
    }
}
