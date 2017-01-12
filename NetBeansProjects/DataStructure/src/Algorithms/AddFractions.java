
package Algorithms;

import java.util.Scanner;

public class AddFractions
{
    public static int GCD(int x,int y)
    {
        if(y == 0)
            return x;
        return GCD(y,x%y);
    }
    
    public static int LCM(int x,int y)
    {
        int gcd = GCD(x,y);
        int lcm = (x*y)/gcd;
        return lcm;
    }
    
    public static void main(String[] args)
    {
        int x1,y1,x2,y2,x3,y3;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        int temp1,temp2;
        if(y1 < y2)
        {
            int temp = y1;
            y1 = y2;
            y2 = temp;
            temp = x1;
            x1 = x2;
            x2 = temp;
        }
        y3 = LCM(y1, y2);
        System.out.println(y3);
        x3 = (x1 * (y3/y1)) + (x2 * (y3/y2));
        int common;
        if(y3>x3)
            common = GCD(y3,x3);
        else
            common = GCD(x3,y3);
        System.out.println(common);
        x3 = x3/common;
        y3 = y3/common;
        System.out.println(x3+"/"+y3);
    }
}
