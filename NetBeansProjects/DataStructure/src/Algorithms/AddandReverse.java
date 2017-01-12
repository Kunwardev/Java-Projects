
package Algorithms;

import java.util.Scanner;

public class AddandReverse
{
    public static boolean Palindrome(long x)
    {
        long num = x;
        long rev_num = 0;
        while(num!=0)
        {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        if(x == rev_num)
            return true;
        return false;
    }
    
    public static long reverseAndAdd(long x)
    {
        long num = x;
        long rev_num = 0;
        while(num!=0)
        {
            rev_num = rev_num*10 + num%10;
            num = num/10;
        }
        x = x+rev_num;
        return x;
    }
    
    public static void mainSolution(long x)
    {
        int flag = 0;
        int iterations = 0;
        while(x < 4294967295l )
        {
            x = reverseAndAdd(x);
          //  System.out.println(x+"  "+Palindrome(x));
            if(Palindrome(x))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println(x+" is the reverse and add");
        else
        {
            System.out.println(x);
            System.out.println("No palindrome exists");
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        mainSolution(x);
    }
    
}
