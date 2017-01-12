
package Algorithms;

import java.util.Scanner;

public class ArmstrongNumbers
{
    
    public static int power(int x,int n)
    {
        if(n == 0)
            return 1;
        return x * power(x,n-1);
    }
    
    public static int count(int num)
    {
        int count =0;
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        return count;
    }
    
    public static int Check(int num)
    {
        int sum1 = num,sum2 = 0;
        int count = count(num);
        while(num!=0)
        {
            sum2+= power(num%10,count);
            num = num/10;
        }
        if(sum1 == sum2)
            return 1;
        return 0;
    }
    
    public static void main(String[] args)
    {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int res = Check(N);
        if(res == 0)
            System.out.println(N + " is not an armstrong Number");
        else
            System.out.println(N + " is an armstrong Number");
    }
    
}
